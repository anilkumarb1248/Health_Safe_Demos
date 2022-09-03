package com.healthsafe.app.provisioningservice.entity.incident;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name="INCIDENT_ACTION")
public class IncidentAction {

    @Id
    @Column(name="INCIDENT_ACTION_ID")
    private Integer incidentActionId;

    @Column(name="INCIDENT_ID")
    private Integer incidentId;

    @Column(name="CREAT_BY")
    private String createdBy;

    @Column(name="CREAT_TS")
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
