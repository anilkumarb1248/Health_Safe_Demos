package com.healthsafe.app.provisioningservice.service;

import com.healthsafe.app.provisioningservice.entity.EnablementMessage;
import com.healthsafe.app.provisioningservice.entity.EnablementReason;
import com.healthsafe.app.provisioningservice.entity.PortalEnablementMessageReason;
import com.healthsafe.app.provisioningservice.entity.Prtl;
import com.healthsafe.app.provisioningservice.entity.incident.Incident;
import com.healthsafe.app.provisioningservice.entity.incident.IncidentAction;
import com.healthsafe.app.provisioningservice.entity.incident.IncidentActionMember;
import com.healthsafe.app.provisioningservice.repository.EnablementMessageRepository;
import com.healthsafe.app.provisioningservice.repository.EnablementReasonRepository;
import com.healthsafe.app.provisioningservice.repository.IncidentActionMemberRepository;
import com.healthsafe.app.provisioningservice.repository.IncidentActionRepository;
import com.healthsafe.app.provisioningservice.repository.IncidentRepository;
import com.healthsafe.app.provisioningservice.repository.PortalEnablementMessageReasonRepository;
import com.healthsafe.app.provisioningservice.repository.PortalRepository;
import com.healthsafe.app.provisioningservice.request.IncidentRequest;
import com.healthsafe.app.provisioningservice.request.IncidentResponse;
import org.apache.commons.collections4.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class IncidentService {

    private static final Logger LOGGER = LoggerFactory.getLogger(IncidentService.class);

    private final IncidentRepository incidentRepository;
    private final IncidentActionRepository incidentActionRepository;
    private final IncidentActionMemberRepository incidentActionMemberRepository;
    private final EnablementMessageRepository enablementMessageRepository;
    private final EnablementReasonRepository enablementReasonRepository;
    private final PortalEnablementMessageReasonRepository portalEnablementMessageReasonRepository;
    private final PortalRepository portalRepository;


    @Autowired
    public IncidentService(IncidentRepository incidentRepository,
                           IncidentActionRepository incidentActionRepository,
                           IncidentActionMemberRepository incidentActionMemberRepository,
                           EnablementMessageRepository enablementMessageRepository,
                           EnablementReasonRepository enablementReasonRepository,
                           PortalEnablementMessageReasonRepository portalEnablementMessageReasonRepository,
                           PortalRepository portalRepository
                           ) {
        this.incidentRepository = incidentRepository;
        this.incidentActionRepository = incidentActionRepository;
        this.incidentActionMemberRepository = incidentActionMemberRepository;
        this.enablementMessageRepository = enablementMessageRepository;
        this.enablementReasonRepository = enablementReasonRepository;
        this.portalEnablementMessageReasonRepository = portalEnablementMessageReasonRepository;
        this.portalRepository = portalRepository;
    }

    @Transactional
    public IncidentResponse createIncident(IncidentRequest incidentRequest) {



        IncidentResponse incidentResponse = new IncidentResponse();
        BeanUtils.copyProperties(incidentRequest, incidentResponse);

        Incident incident = incidentResponse.getIncident() != null ? incidentResponse.getIncident() : new Incident();

        Optional<Prtl> portalOptional =  portalRepository.findById(incident.getPrtl().getPrtlId());

        if(portalOptional.isPresent()){
            incident.setPrtl(portalOptional.get());
        }

        Optional<EnablementReason> reasonOptional =  enablementReasonRepository.findById(incident.getEnablementReason().getReasonId());

        if(reasonOptional.isPresent()){
            incident.setEnablementReason(reasonOptional.get());
        }

        List<PortalEnablementMessageReason> portalEnablementMessageReasons = portalEnablementMessageReasonRepository.findByPortalIdAndReasonTypeCode(incident.getPrtl().getPrtlId(), incidentRequest.getReasonTypeCode());
        if(CollectionUtils.isNotEmpty(portalEnablementMessageReasons)){
            Optional<EnablementMessage> messageOptional = enablementMessageRepository.findById(portalEnablementMessageReasons.get(0).getMessageId());
            if(messageOptional.isPresent()){
                incident.setEnablementMessage(messageOptional.get());
            }
        }

        incident.setCreatedTs(LocalDateTime.now());
        incident.getIncidentActions().forEach(ia-> {
            ia.setCreatedTs(LocalDateTime.now());
            ia.getIncidentActionMembers().forEach(iam->iam.setCreatedTs(LocalDateTime.now()));
        });
        //incident.setReporterTs(LocalDateTime.now());
        //incident.setPrtl(new Prtl());
        //incident.setEnablementMessage(new EnablementMessage());
       // incident.setEnablementReason(new EnablementReason());
//        IncidentAction incidentAction = new IncidentAction();
//        incidentAction.setIncidentActionMembers(Arrays.asList(new IncidentActionMember()));
//        incident.setIncidentActions(Arrays.asList(incidentAction));

        incident = incidentRepository.save(incident);
//        incidentRepository.flush();

        incidentResponse.setIncident(incident);
        return incidentResponse;
    }

}
