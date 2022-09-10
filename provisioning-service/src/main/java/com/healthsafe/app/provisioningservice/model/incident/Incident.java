package com.healthsafe.app.provisioningservice.model.incident;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.healthsafe.app.provisioningservice.entity.EnablementMessage;
import com.healthsafe.app.provisioningservice.entity.EnablementReason;
import com.healthsafe.app.provisioningservice.entity.Prtl;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@JsonIgnoreProperties
public class Incident implements Serializable {
    private Integer incidentId;
    private String healthSafeId;
    private String incidentNumber;
    private Prtl prtl;
    private EnablementMessage enablementMessage;
    private EnablementReason enablementReason;
    private LocalDateTime issueOccurredTs;
    private String issueOccurredTimeZone;
    private String issueDescription;
    private String callerFirstName;
    private String callerLastName;
    private String callerPhone;
    private String callerEmail;
    private String callerAuthorizedForOther;
    private String callerAuthorizedMbrAccount;
    private String callerDevice;
    private String callerInfoShared;
    private String empFirstName;
    private String empLastName;
    private String empMsId;
    private String empEmail;
    private String empDescription;
    private String reporterEmail;
    private LocalDateTime reporterTs;
    private String reporterTimeZone;
    private String createdBy;
    private LocalDateTime createdTs;
    private List<IncidentAction> incidentActions;

    public Integer getIncidentId() {
        return incidentId;
    }

    public void setIncidentId(Integer incidentId) {
        this.incidentId = incidentId;
    }

    public String getHealthSafeId() {
        return healthSafeId;
    }

    public void setHealthSafeId(String healthSafeId) {
        this.healthSafeId = healthSafeId;
    }

    public String getIncidentNumber() {
        return incidentNumber;
    }

    public void setIncidentNumber(String incidentNumber) {
        this.incidentNumber = incidentNumber;
    }

    public Prtl getPrtl() {
        return prtl;
    }

    public void setPrtl(Prtl prtl) {
        this.prtl = prtl;
    }

    public EnablementMessage getEnablementMessage() {
        return enablementMessage;
    }

    public void setEnablementMessage(EnablementMessage enablementMessage) {
        this.enablementMessage = enablementMessage;
    }

    public EnablementReason getEnablementReason() {
        return enablementReason;
    }

    public void setEnablementReason(EnablementReason enablementReason) {
        this.enablementReason = enablementReason;
    }

    public LocalDateTime getIssueOccurredTs() {
        return issueOccurredTs;
    }

    public void setIssueOccurredTs(LocalDateTime issueOccurredTs) {
        this.issueOccurredTs = issueOccurredTs;
    }

    public String getIssueOccurredTimeZone() {
        return issueOccurredTimeZone;
    }

    public void setIssueOccurredTimeZone(String issueOccurredTimeZone) {
        this.issueOccurredTimeZone = issueOccurredTimeZone;
    }

    public String getIssueDescription() {
        return issueDescription;
    }

    public void setIssueDescription(String issueDescription) {
        this.issueDescription = issueDescription;
    }

    public String getCallerFirstName() {
        return callerFirstName;
    }

    public void setCallerFirstName(String callerFirstName) {
        this.callerFirstName = callerFirstName;
    }

    public String getCallerLastName() {
        return callerLastName;
    }

    public void setCallerLastName(String callerLastName) {
        this.callerLastName = callerLastName;
    }

    public String getCallerPhone() {
        return callerPhone;
    }

    public void setCallerPhone(String callerPhone) {
        this.callerPhone = callerPhone;
    }

    public String getCallerEmail() {
        return callerEmail;
    }

    public void setCallerEmail(String callerEmail) {
        this.callerEmail = callerEmail;
    }

    public String getCallerAuthorizedForOther() {
        return callerAuthorizedForOther;
    }

    public void setCallerAuthorizedForOther(String callerAuthorizedForOther) {
        this.callerAuthorizedForOther = callerAuthorizedForOther;
    }

    public String getCallerAuthorizedMbrAccount() {
        return callerAuthorizedMbrAccount;
    }

    public void setCallerAuthorizedMbrAccount(String callerAuthorizedMbrAccount) {
        this.callerAuthorizedMbrAccount = callerAuthorizedMbrAccount;
    }

    public String getCallerDevice() {
        return callerDevice;
    }

    public void setCallerDevice(String callerDevice) {
        this.callerDevice = callerDevice;
    }

    public String getCallerInfoShared() {
        return callerInfoShared;
    }

    public void setCallerInfoShared(String callerInfoShared) {
        this.callerInfoShared = callerInfoShared;
    }

    public String getEmpFirstName() {
        return empFirstName;
    }

    public void setEmpFirstName(String empFirstName) {
        this.empFirstName = empFirstName;
    }

    public String getEmpLastName() {
        return empLastName;
    }

    public void setEmpLastName(String empLastName) {
        this.empLastName = empLastName;
    }

    public String getEmpMsId() {
        return empMsId;
    }

    public void setEmpMsId(String empMsId) {
        this.empMsId = empMsId;
    }

    public String getEmpEmail() {
        return empEmail;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }

    public String getEmpDescription() {
        return empDescription;
    }

    public void setEmpDescription(String empDescription) {
        this.empDescription = empDescription;
    }

    public String getReporterEmail() {
        return reporterEmail;
    }

    public void setReporterEmail(String reporterEmail) {
        this.reporterEmail = reporterEmail;
    }

    public LocalDateTime getReporterTs() {
        return reporterTs;
    }

    public void setReporterTs(LocalDateTime reporterTs) {
        this.reporterTs = reporterTs;
    }

    public String getReporterTimeZone() {
        return reporterTimeZone;
    }

    public void setReporterTimeZone(String reporterTimeZone) {
        this.reporterTimeZone = reporterTimeZone;
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

    public List<IncidentAction> getIncidentActions() {
        return incidentActions;
    }

    public void setIncidentActions(List<IncidentAction> incidentActions) {
        this.incidentActions = incidentActions;
    }
}
