package com.healthsafe.app.provisioningservice.comptest

import com.healthsafe.app.provisioningservice.ProvisioningServiceApplication
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.context.PropertyPlaceholderAutoConfiguration
import org.springframework.boot.jdbc.EmbeddedDatabaseConnection
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase
import org.springframework.boot.test.context.ConfigFileApplicationContextInitializer
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.boot.web.server.LocalServerPort
import org.springframework.core.env.Environment
import org.springframework.http.HttpEntity
import org.springframework.http.HttpHeaders
import org.springframework.http.HttpMethod
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.test.context.ActiveProfiles
import org.springframework.test.context.TestPropertySource
import org.springframework.util.MultiValueMap
import org.springframework.web.util.UriComponentsBuilder
import spock.lang.Shared
import spock.lang.Specification

@SpringBootTest(
        webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT,
        classes = [ProvisioningServiceApplication, PropertyPlaceholderAutoConfiguration, ConfigFileApplicationContextInitializer]
)
//@SpringBootTest(
//        webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT
//)
@TestPropertySource(locations = "classpath:application.properties")
//@TestPropertySource(properties = [
//        "spring.datasource.url=jdbc:h2:mem:provisioningDB",
//        "spring.datasource.driverClassName=org.h2.Driver",
//        "spring.jpa.hibernate.ddl-auto = create-drop",
//        "spring.jpa.database-platform=org.hibernate.dialect.H2Dialect"
//])
@ActiveProfiles("comp-test")
@AutoConfigureTestDatabase(connection = EmbeddedDatabaseConnection.H2)
class BaseCompSpec extends Specification{

    @Autowired
    TestRestTemplate restTemplate

    @Autowired
    Environment environment;

    @LocalServerPort
    int port

    @Shared
    String CONTEXT_PATH = "/ProvisioningService/"


    URI buildUri(String resource) {
        return buildUri(resource, null)
    }

    URI buildUri(String resource, MultiValueMap<String, String> queryParams) {
        return UriComponentsBuilder.fromUriString("http://localhost:" + port + CONTEXT_PATH + resource)
                .queryParams(queryParams)
                .build(false)
                .encode()
                .toUri()
    }

    ResponseEntity<String> callService(URI uri, HttpMethod method, Object body) {
        return callService(uri, method, body, MediaType.APPLICATION_JSON, MediaType.APPLICATION_JSON)
    }

    ResponseEntity<String> callService(URI uri, HttpMethod method, Object body, MediaType acceptHeader, MediaType contentType) {
        HttpHeaders headers = new HttpHeaders()
        headers.setAccept([acceptHeader])
        if (body != null) {
            headers.setContentType(contentType)
        }
        return callService(uri, method, headers, body)
    }

    ResponseEntity<String> callService(URI uri, HttpMethod method, HttpHeaders headers, Object body) {
        return restTemplate.exchange(uri, method, new HttpEntity<Object>(body, headers), String)
    }

}
