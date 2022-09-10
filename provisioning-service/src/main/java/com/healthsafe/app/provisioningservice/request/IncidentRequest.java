package com.healthsafe.app.provisioningservice.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.healthsafe.app.provisioningservice.model.incident.Incident;
import com.healthsafe.app.provisioningservice.model.incident.IncidentActionMember;

import java.util.List;


@JsonIgnoreProperties
public class IncidentRequest {

    private Character reasonTypeCode;
    private Incident incident;
    private List<IncidentActionMember> incidentActionMembers;

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

    public List<IncidentActionMember> getIncidentActionMembers() {
        return incidentActionMembers;
    }

    public void setIncidentActionMembers(List<IncidentActionMember> incidentActionMembers) {
        this.incidentActionMembers = incidentActionMembers;
    }
}
