package com.healthsafe.app.provisioningservice.model.incident;

import com.healthsafe.app.provisioningservice.constants.IncidentConstants;

public class IncidentActionMember {
    private Integer incidentActionMbrId;
    private Integer incidentActionId;
    private String healthSafeId;

    private IncidentConstants.MemberType memberType;
    private IncidentConstants.ActionRequested actionRequested;
    private String createdBy;
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
