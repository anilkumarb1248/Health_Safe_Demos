package com.healthsafe.app.provisioningservice.controller

import com.healthsafe.app.provisioningservice.constants.IncidentConstants
import com.healthsafe.app.provisioningservice.model.incident.Incident
import com.healthsafe.app.provisioningservice.model.incident.IncidentAction
import com.healthsafe.app.provisioningservice.model.incident.IncidentActionMember
import com.healthsafe.app.provisioningservice.request.IncidentRequest
import com.healthsafe.app.provisioningservice.response.IndividualResponse
import com.healthsafe.app.provisioningservice.response.Status
import com.healthsafe.app.provisioningservice.service.IncidentService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import spock.lang.Specification

import java.util.concurrent.Callable

class IncidentControllerSpec extends Specification{

    IncidentService service = Mock(IncidentService.class)
    IncidentController controller = new IncidentController(service)

    def "createIncident returns success response"(){
        setup:
        IncidentRequest incidentRequest = new IncidentRequest(reasonTypeCode: "P", incident: new Incident(healthSafeId: "testHealthSafeId", incidentNumber: "testNumber", createdBy: "testUser"), incidentActionMembers: [new IncidentActionMember(healthSafeId: "testId", memberType: IncidentConstants.MemberType.IMPACTED)])

        Incident incidentMock = new Incident(incidentId: 1, healthSafeId: "testHealthSafeId", incidentNumber: "testNumber", createdBy: "testUser", incidentActions: [new IncidentAction(createdBy: "testUser", incidentActionMembers: [new IncidentActionMember(healthSafeId: "testId", memberType: IncidentConstants.MemberType.IMPACTED)])])
//        IndividualResponse<Incident> individualResponseMock = new IndividualResponse<>(status: Status.SUCCESS, value: incidentMock)

        when:
        Callable<ResponseEntity<IndividualResponse<Incident>>> responseEntityCallable =  controller.createIncident(incidentRequest)
        ResponseEntity<IndividualResponse<Incident>> responseEntity = responseEntityCallable.call()

        then:
        1 * service.createIncident(incidentRequest) >> incidentMock

        and:
        responseEntity
        responseEntity.statusCode == HttpStatus.CREATED
        responseEntity.getBody()
        responseEntity.getBody().status == Status.SUCCESS
        responseEntity.getBody().value
        responseEntity.getBody().value.incidentId == 1
        responseEntity.getBody().value.healthSafeId == "testHealthSafeId"
        responseEntity.getBody().value.incidentNumber == "testNumber"
        responseEntity.getBody().value.createdBy == "testUser"
        responseEntity.getBody().value.incidentActions
        responseEntity.getBody().value.incidentActions.size() == 1
        responseEntity.getBody().value.incidentActions.get(0).createdBy == "testUser"
        responseEntity.getBody().value.incidentActions.get(0).incidentActionMembers
        responseEntity.getBody().value.incidentActions.get(0).incidentActionMembers.size() == 1
        responseEntity.getBody().value.incidentActions.get(0).incidentActionMembers.get(0).healthSafeId == "testId"
        responseEntity.getBody().value.incidentActions.get(0).incidentActionMembers.get(0).memberType == IncidentConstants.MemberType.IMPACTED
    }

    def "createIncident returns failure response"(){
        setup:
        IncidentRequest incidentRequest = new IncidentRequest(reasonTypeCode: "P", incident: new Incident(healthSafeId: "testHealthSafeId", incidentNumber: "testNumber", createdBy: "testUser"), incidentActionMembers: [new IncidentActionMember(healthSafeId: "testId", memberType: IncidentConstants.MemberType.IMPACTED)])

        when:
        Callable<ResponseEntity<IndividualResponse<Incident>>> responseEntityCallable =  controller.createIncident(incidentRequest)
        ResponseEntity<IndividualResponse<Incident>> responseEntity = responseEntityCallable.call()

        then:
        1 * service.createIncident(incidentRequest) >> {throw new RuntimeException("Internal Server Error Occurred")}

        and:
        responseEntity
        responseEntity.statusCode == HttpStatus.INTERNAL_SERVER_ERROR
        responseEntity.getBody()
        responseEntity.getBody().status == Status.ERROR
        responseEntity.getBody().msg == "Internal Server Error Occurred"
        !responseEntity.getBody().value
    }
}
