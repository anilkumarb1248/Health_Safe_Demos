package com.healthsafe.app.provisioningservice.service;

import com.healthsafe.app.provisioningservice.entity.EnablementMessage;
import com.healthsafe.app.provisioningservice.entity.EnablementReason;
import com.healthsafe.app.provisioningservice.entity.PortalEnablementMessageReason;
import com.healthsafe.app.provisioningservice.entity.Prtl;
import com.healthsafe.app.provisioningservice.entity.incident.IncidentActionEntity;
import com.healthsafe.app.provisioningservice.entity.incident.IncidentActionMemberEntity;
import com.healthsafe.app.provisioningservice.entity.incident.IncidentEntity;
import com.healthsafe.app.provisioningservice.model.incident.Incident;
import com.healthsafe.app.provisioningservice.repository.EnablementMessageRepository;
import com.healthsafe.app.provisioningservice.repository.EnablementReasonRepository;
import com.healthsafe.app.provisioningservice.repository.IncidentActionMemberRepository;
import com.healthsafe.app.provisioningservice.repository.IncidentActionRepository;
import com.healthsafe.app.provisioningservice.repository.IncidentRepository;
import com.healthsafe.app.provisioningservice.repository.PortalEnablementMessageReasonRepository;
import com.healthsafe.app.provisioningservice.repository.PortalRepository;
import com.healthsafe.app.provisioningservice.request.IncidentRequest;
import org.apache.commons.collections4.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
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
    public Incident createIncident(IncidentRequest incidentRequest) {

        IncidentEntity incidentEntity = new IncidentEntity();
        BeanUtils.copyProperties(incidentRequest.getIncident(), incidentEntity);

        IncidentActionEntity incidentActionEntity = new IncidentActionEntity();
        incidentActionEntity.setCreatedBy(incidentEntity.getCreatedBy());

        List<IncidentActionMemberEntity> incidentActionMemberEntityList = new ArrayList<>();
        incidentRequest.getIncidentActionMembers().forEach(member ->{
            IncidentActionMemberEntity incidentActionMemberEntity = new IncidentActionMemberEntity();
            BeanUtils.copyProperties(member, incidentActionMemberEntity);
            incidentActionMemberEntityList.add(incidentActionMemberEntity);
        });
        incidentActionEntity.setIncidentActionMembers(incidentActionMemberEntityList);
        incidentEntity.setIncidentActions(Arrays.asList(incidentActionEntity));



//        Optional<Prtl> portalOptional =  portalRepository.findById(incidentEntity.getPrtl().getPrtlId());
//        if(portalOptional.isPresent()){
//            incidentEntity.setPrtl(portalOptional.get());
//        }
//
//        Optional<EnablementReason> reasonOptional =  enablementReasonRepository.findById(incidentEntity.getEnablementReason().getReasonId());
//        if(reasonOptional.isPresent()){
//            incidentEntity.setEnablementReason(reasonOptional.get());
//        }

        List<PortalEnablementMessageReason> portalEnablementMessageReasons = portalEnablementMessageReasonRepository.findByPortalIdAndReasonTypeCode(incidentEntity.getPrtl().getPrtlId(), incidentRequest.getReasonTypeCode());
        if(CollectionUtils.isNotEmpty(portalEnablementMessageReasons)){
            EnablementMessage enablementMessage = new EnablementMessage();
            enablementMessage.setEnableDisableMessageId(portalEnablementMessageReasons.get(0).getMessageId());
//            Optional<EnablementMessage> messageOptional = enablementMessageRepository.findById(portalEnablementMessageReasons.get(0).getMessageId());
//            if(messageOptional.isPresent()){
//                incidentEntity.setEnablementMessage(messageOptional.get());
//            }
            incidentEntity.setEnablementMessage(enablementMessage);
        }

//        incident.setCreatedTs(LocalDateTime.now());
//        incident.getIncidentActions().forEach(ia-> {
//            ia.setCreatedTs(LocalDateTime.now());
//            ia.getIncidentActionMembers().forEach(iam->iam.setCreatedTs(LocalDateTime.now()));
//        });
        //incident.setReporterTs(LocalDateTime.now());
        //incident.setPrtl(new Prtl());
        //incident.setEnablementMessage(new EnablementMessage());
       // incident.setEnablementReason(new EnablementReason());
//        IncidentAction incidentAction = new IncidentAction();
//        incidentAction.setIncidentActionMembers(Arrays.asList(new IncidentActionMember()));
//        incident.setIncidentActions(Arrays.asList(incidentAction));

        incidentEntity = incidentRepository.save(incidentEntity);

//        IncidentAction incidentAction = incident.getIncidentActions().get(0);
//        incidentAction.setIncident(incident);
//        incidentAction = incidentActionRepository.save(incidentAction);
//        List<IncidentActionMember> incidentActionMemberList = incidentAction.getIncidentActionMembers();

//        IncidentAction finalIncidentAction = incidentAction;
//        incidentActionMemberList.forEach(actionMember ->{
//            actionMember.setIncidentAction(finalIncidentAction);
//        });
//        incidentActionMemberRepository.saveAll(incidentActionMemberList);

        Incident incidentResponse = new Incident();
        BeanUtils.copyProperties(incidentEntity, incidentResponse);

        return incidentResponse;
    }

}
