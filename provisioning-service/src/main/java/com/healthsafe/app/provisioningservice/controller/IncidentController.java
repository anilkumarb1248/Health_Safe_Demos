package com.healthsafe.app.provisioningservice.controller;

import com.healthsafe.app.provisioningservice.model.incident.Incident;
import com.healthsafe.app.provisioningservice.request.IncidentRequest;
import com.healthsafe.app.provisioningservice.response.IndividualResponse;
import com.healthsafe.app.provisioningservice.response.Status;
import com.healthsafe.app.provisioningservice.service.IncidentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.concurrent.Callable;

@RestController
@RequestMapping("/incident")
public class IncidentController {

    private static final Logger LOGGER = LoggerFactory.getLogger(IncidentController.class);

    private final IncidentService incidentService;

    @Autowired
    public IncidentController(IncidentService incidentService){
        this.incidentService = incidentService;
    }

    @PostMapping("/create")
    public Callable<ResponseEntity<IndividualResponse<Incident>>> createIncident(@RequestBody @Valid IncidentRequest incidentRequest){

        IndividualResponse<Incident> individualResponse = new IndividualResponse<>();

        try{
            Incident incident = incidentService.createIncident(incidentRequest);
            individualResponse.setStatus(Status.SUCCESS);
            individualResponse.setValue(incident);
            return () -> new ResponseEntity<>(individualResponse, HttpStatus.OK);
        }catch(Exception e){
            LOGGER.error("Exception occurred while creating the incident: ", e);
            individualResponse.setStatus(Status.ERROR);
            individualResponse.setMsg(e.getMessage());
            return () -> new ResponseEntity<>(individualResponse, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
