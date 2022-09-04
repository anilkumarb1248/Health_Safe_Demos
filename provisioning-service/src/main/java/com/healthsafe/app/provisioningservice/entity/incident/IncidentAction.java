package com.healthsafe.app.provisioningservice.entity.incident;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name="INCIDENT_ACTION")
public class IncidentAction implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name="INCIDENT_ACTION_ID", unique = true, nullable = false)
    @Column(name="INCIDENT_ACTION_ID", unique = true)
    private Integer incidentActionId;

//    @Column(name="INCIDENT_ID")
//    private Integer incidentId;

    @Column(name="CREAT_BY")
    private String createdBy;

    @Column(name="CREAT_TS", columnDefinition = "TIMESTAMP",insertable = false, updatable = false)
    private LocalDateTime createdTs;

//    @ManyToOne(fetch = FetchType.LAZY, optional = false)
////    @JoinColumn(name="INCIDENT_ID", referencedColumnName = "INCIDENT_ID", nullable = false)
//    @JoinColumn(name="INCIDENT_ID", nullable = false)
//    @ManyToOne(fetch = FetchType.LAZY, optional = false)
//    @JoinColumn(name = "INCIDENT_ID")
//    @JoinColumn(name = "INCIDENT_ID", insertable = false, updatable = false)
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "INCIDENT_ID", nullable = false, insertable = false, updatable = false)
    private Incident incident;

//    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
////    @OneToMany(mappedBy = "incidentAction", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
////    @JoinColumn(name = "INCIDENT_ACTION_ID", referencedColumnName = "INCIDENT_ACTION_ID")
//    @JoinColumn(name = "INCIDENT_ACTION_ID")
//    @OneToMany(mappedBy = "incidentAction")
//    @OneToMany(mappedBy = "incidentAction",fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
//    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
////    @JoinColumn(name = "INCIDENT_ACTION_ID")
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name="INCIDENT_ACTION_ID", nullable = false)
    private List<IncidentActionMember> incidentActionMembers;

    public Integer getIncidentActionId() {
        return incidentActionId;
    }

    public void setIncidentActionId(Integer incidentActionId) {
        this.incidentActionId = incidentActionId;
    }

//    public Integer getIncidentId() {
//        return incidentId;
//    }
//
//    public void setIncidentId(Integer incidentId) {
//        this.incidentId = incidentId;
//    }

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

    public List<IncidentActionMember> getIncidentActionMembers() {
        return incidentActionMembers;
    }

    public void setIncidentActionMembers(List<IncidentActionMember> incidentActionMembers) {
        this.incidentActionMembers = incidentActionMembers;
    }

    public Incident getIncident() {
        return incident;
    }

    public void setIncident(Incident incident) {
        this.incident = incident;
    }
}
