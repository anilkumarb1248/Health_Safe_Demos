package com.healthsafe.app.provisioningservice.model.incident;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.healthsafe.app.provisioningservice.constants.IncidentConstants;

import java.io.Serializable;
import java.time.LocalDateTime;

@JsonIgnoreProperties
public class IncidentActionMember implements Serializable {

    private Integer incidentActionMbrId;
    private String healthSafeId;
    private IncidentConstants.MemberType memberType;
    private IncidentConstants.ActionRequested actionRequested;
    private String createdBy;
    private LocalDateTime createdTs;
    private Integer incidentActionId;

    public Integer getIncidentActionMbrId() {
        return incidentActionMbrId;
    }

    public void setIncidentActionMbrId(Integer incidentActionMbrId) {
        this.incidentActionMbrId = incidentActionMbrId;
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

    public LocalDateTime getCreatedTs() {
        return createdTs;
    }

    public void setCreatedTs(LocalDateTime createdTs) {
        this.createdTs = createdTs;
    }

    public Integer getIncidentActionId() {
        return incidentActionId;
    }

    public void setIncidentActionId(Integer incidentActionId) {
        this.incidentActionId = incidentActionId;
    }
}
