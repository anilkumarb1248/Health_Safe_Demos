package com.healthsafe.app.provisioningservice.model.incident;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@JsonIgnoreProperties
public class IncidentAction implements Serializable {
    private Integer incidentActionId;
    private Integer incidentId;
    private List<IncidentActionMember> incidentActionMembers;
    private String createdBy;
    private LocalDateTime createdTs;

    public Integer getIncidentActionId() {
        return incidentActionId;
    }

    public void setIncidentActionId(Integer incidentActionId) {
        this.incidentActionId = incidentActionId;
    }

    public Integer getIncidentId() {
        return incidentId;
    }

    public void setIncidentId(Integer incidentId) {
        this.incidentId = incidentId;
    }

    public List<IncidentActionMember> getIncidentActionMembers() {
        return incidentActionMembers;
    }

    public void setIncidentActionMembers(List<IncidentActionMember> incidentActionMembers) {
        this.incidentActionMembers = incidentActionMembers;
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
}
