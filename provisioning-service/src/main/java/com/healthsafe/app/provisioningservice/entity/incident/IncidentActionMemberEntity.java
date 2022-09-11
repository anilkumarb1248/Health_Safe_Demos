package com.healthsafe.app.provisioningservice.entity.incident;

import com.healthsafe.app.provisioningservice.constants.IncidentConstants;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name="INCIDENT_ACTION_MBR")
public class IncidentActionMemberEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name="INCIDENT_ACTION_MBR_ID", unique = true, nullable = false)
    @Column(name="INCIDENT_ACTION_MBR_ID", unique = true)
    private Integer incidentActionMbrId;

//    @Column(name="INCIDENT_ACTION_ID")
//    private Integer incidentActionId;

    @Column(name="HLTHSF_ID")
    private String healthSafeId;

    @Column(name="MBR_TYPE")
    @Enumerated(EnumType.STRING)
    private IncidentConstants.MemberType memberType;

    @Column(name="ACTION_REQ")
    @Enumerated(EnumType.STRING)
    private IncidentConstants.ActionRequested actionRequested;

    @Column(name="CREAT_BY")
    private String createdBy;

    @Column(name="CREAT_TS", columnDefinition = "TIMESTAMP",insertable = false, updatable = false)
    private LocalDateTime createdTs;


////    @JoinColumn(name="INCIDENT_ACTION_ID", referencedColumnName = "INCIDENT_ACTION_ID", nullable = false)
//    @ManyToOne(fetch = FetchType.LAZY, optional = false)
////    @JoinColumn(name="INCIDENT_ID", referencedColumnName = "INCIDENT_ID", nullable = false)
//    @JoinColumn(name="INCIDENT_ACTION_ID", nullable = false)

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "INCIDENT_ACTION_ID")
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "INCIDENT_ACTION_ID", nullable = false, insertable = false, updatable = false)
    private IncidentActionEntity incidentActionEntity;

    public Integer getIncidentActionMbrId() {
        return incidentActionMbrId;
    }

    public void setIncidentActionMbrId(Integer incidentActionMbrId) {
        this.incidentActionMbrId = incidentActionMbrId;
    }

//    public Integer getIncidentActionId() {
//        return incidentActionId;
//    }
//
//    public void setIncidentActionId(Integer incidentActionId) {
//        this.incidentActionId = incidentActionId;
//    }

    public String getHealthSafeId() {
        return healthSafeId;
    }

    public void setHealthSafeId(String healthSafeId) {
        this.healthSafeId = healthSafeId;
    }

    public IncidentConstants.MemberType getMemberType() {
        return memberType;
    }

    public void setMemberType(IncidentConstants.MemberType memberType) {
        this.memberType = memberType;
    }

    public IncidentConstants.ActionRequested getActionRequested() {
        return actionRequested;
    }

    public void setActionRequested(IncidentConstants.ActionRequested actionRequested) {
        this.actionRequested = actionRequested;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public LocalDateTime getCreatedTs() {
        return createdTs;
    }

    public void setCreatedTs(LocalDateTime createdTs) {
        this.createdTs = createdTs;
    }

    public IncidentActionEntity getIncidentAction() {
        return incidentActionEntity;
    }

    public void setIncidentAction(IncidentActionEntity incidentActionEntity) {
        this.incidentActionEntity = incidentActionEntity;
    }

}
