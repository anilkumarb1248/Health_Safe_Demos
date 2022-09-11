package com.healthsafe.app.provisioningservice.comptest.IncidentController

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule
import com.healthsafe.app.provisioningservice.comptest.BaseCompSpec
import com.healthsafe.app.provisioningservice.model.incident.Incident
import com.healthsafe.app.provisioningservice.request.IncidentRequest
import com.healthsafe.app.provisioningservice.response.IndividualResponse
import groovy.json.JsonSlurper
import org.springframework.http.HttpMethod
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.test.context.jdbc.Sql
import org.springframework.test.context.jdbc.SqlGroup
import spock.lang.Shared

@SqlGroup([
        @Sql(statements = [
                "delete from mbr_prtl",
                "delete from mbr",
                "delete from prtl",
                "delete from mbr_sts",
                "delete from prtl_msg_rsn_mapping",
                "delete from enbl_dsbl_msg",
                "delete from enbl_dsbl_rsn",
                "delete from incident_action_mbr",
                "delete from incident_action",
                "delete from incident"
        ], executionPhase = Sql.ExecutionPhase.BEFORE_TEST_METHOD),
        @Sql(scripts = [
                "classpath:test-data/sql/insertPortals.sql",
                "classpath:test-data/sql/insertMbrSts.sql",
                "classpath:test-data/sql/insertMembers.sql",
                "classpath:test-data/sql/insertMemberPortals.sql",
                "classpath:test-data/sql/enableDisableResons.sql",
                "classpath:test-data/sql/enableDisableMessages.sql",
                "classpath:test-data/sql/portalMessageReasonMapping.sql"
        ], executionPhase = Sql.ExecutionPhase.BEFORE_TEST_METHOD)
])
class CreateIncidentCompSpec extends BaseCompSpec{

        @Shared
        String INCIDENT_RESOURCE = "/incident"

        @Shared
        String INCIDENT_CREATE_RESOURCE = "/create"

        @Shared
        ObjectMapper OBJECTMAPPER = null

        def setup(){
            OBJECTMAPPER = new ObjectMapper().registerModule(new JavaTimeModule())
        }

        def "Incident creates Successfully"(){
                setup:
                URI uri = buildUri(INCIDENT_RESOURCE + INCIDENT_CREATE_RESOURCE)

                IncidentRequest incidentRequest = OBJECTMAPPER.readValue(this.getClass().getResource("/test-data/requests/createIncident.json"), IncidentRequest.class)

                print(incidentRequest)

                def jsonString = OBJECTMAPPER.writeValueAsString(incidentRequest)

                when:
                ResponseEntity<IndividualResponse<Incident>> responseEntity = callService(uri, HttpMethod.POST, jsonString)

                then:
                responseEntity
                responseEntity.statusCode == HttpStatus.CREATED
                responseEntity.hasBody()
                Map individualResponseMap = new JsonSlurper().parseText(responseEntity.getBody())
                individualResponseMap.size() == 4
                individualResponseMap.get("status") == "SUCCESS"
                !individualResponseMap.get("msg")
                Map incident = individualResponseMap.get("value")
                incident
                incident.get("incidentId")
                Map incidentAction = incident.get("incidentActions")[0]
                incidentAction
                incidentAction.get("incidentActionId")
                List incidentActionMembersList = incidentAction.get("incidentActionMembers")
                Map incidentActionMember1 = incidentActionMembersList.get(0)
                incidentActionMember1.get("incidentActionMbrId")
                Map incidentActionMember2 = incidentActionMembersList.get(1)
                incidentActionMember2.get("incidentActionMbrId")




        }
}
