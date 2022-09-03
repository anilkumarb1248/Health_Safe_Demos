package com.healthsafe.app.provisioningservice.entity.incident;

import com.healthsafe.app.provisioningservice.constants.IncidentConstants;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="INCIDENT_ACTION_MBR")
public class IncidentActionMember {

    @Id
    @Column(name="INCIDENT_ACTION_MBR_ID")
    private Integer incidentActionMbrId;

    @Column(name="INCIDENT_ACTION_ID")
    private Integer incidentActionId;

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

    @Column(name="CREAT_TS")
    private String createdTs;

    public Integer getIncidentActionMbrId() {
        return incidentActionMbrId;
    }

    public void setIncidentActionMbrId(Integer incidentActionMbrId) {
        this.incidentActionMbrId = incidentActionMbrId;
    }

    public Integer getIncidentActionId() {
        return incidentActionId;
    }

    public void setIncidentActionId(Integer incidentActionId) {
        this.incidentActionId = incidentActionId;
    }

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

    public String getCreatedTs() {
        return createdTs;
    }

    public void setCreatedTs(String createdTs) {
        this.createdTs = createdTs;
    }
}