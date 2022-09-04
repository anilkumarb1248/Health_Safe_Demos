package com.healthsafe.app.provisioningservice.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.healthsafe.app.provisioningservice.entity.incident.Incident;
import com.healthsafe.app.provisioningservice.entity.incident.IncidentAction;
import com.healthsafe.app.provisioningservice.entity.incident.IncidentActionMember;


@JsonIgnoreProperties
public class IncidentRequest {

    private Character reasonTypeCode;
    private Incident incident;
    private IncidentAction incidentAction;
    private IncidentActionMember incidentActionMember;

    public Character getReasonTypeCode() {
        return reasonTypeCode;
    }

    public void setReasonTypeCode(Character reasonTypeCode) {
        this.reasonTypeCode = reasonTypeCode;
    }

    public Incident getIncident() {
        return incident;
    }

    public void setIncident(Incident incident) {
        this.incident = incident;
    }

    public IncidentAction getIncidentAction() {
        return incidentAction;
    }

    public void setIncidentAction(IncidentAction incidentAction) {
        this.incidentAction = incidentAction;
    }

    public IncidentActionMember getIncidentActionMember() {
        return incidentActionMember;
    }

    public void setIncidentActionMember(IncidentActionMember incidentActionMember) {
        this.incidentActionMember = incidentActionMember;
    }
}
