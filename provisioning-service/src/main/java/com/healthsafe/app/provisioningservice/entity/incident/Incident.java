package com.healthsafe.app.provisioningservice.entity.incident;

import com.healthsafe.app.provisioningservice.entity.EnablementMessage;
import com.healthsafe.app.provisioningservice.entity.EnablementReason;
import com.healthsafe.app.provisioningservice.entity.Prtl;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name="INCIDENT")
public class Incident implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="INCIDENT_ID", unique = true, nullable = false)
    private Integer incidentId;

    @Column(name="HLTHSF_ID")
    private String healthSafeId;

    @Column(name="INCIDENT_NBR")
    private String incidentNumber;

//    @Column(name="PRTL_ID")
//    private Integer prtlId;

    @ManyToOne
    @JoinColumn(name="PRTL_ID",referencedColumnName = "PRTL_ID", nullable = false)
    private Prtl prtl;

//    @Column(name="ENBL_DSBL_MSG_ID")
//    private Integer enableDisableMessageId;
//
//    @Column(name="ENBL_DSBL_RSN_ID")
//    private Integer reasonId;

    @ManyToOne
    @JoinColumn(name="ENBL_DSBL_MSG_ID", referencedColumnName = "ENBL_DSBL_MSG_ID", nullable = false)
    private EnablementMessage enablementMessage;

    @ManyToOne
    @JoinColumn(name="ENBL_DSBL_RSN_ID", referencedColumnName = "ENBL_DSBL_RSN_ID", nullable = false)
    private EnablementReason enablementReason;

    @Column(name="ISSUE_OCC_TS")
    private LocalDateTime issueOccurredTs;

    @Column(name="ISSUE_OCC_TZ")
    private String issueOccurredTimeZone;

    @Column(name="ISSUE_DESC")
    private String issueDescription;

    @Column(name="CALLER_FN")
    private String callerFirstName;

    @Column(name="CALLER_LN")
    private String callerLastName;

    @Column(name="CALLER_PHNE")
    private String callerPhone;

    @Column(name="CALLER_EMAIL")
    private String callerEmail;

    @Column(name="CALLER_AUTH_FOR_OTHR")
    private String callerAuthorizedForOther;

    @Column(name="CALLER_AUTH_MBR_ACC")
    private String callerAuthorizedMbrAccount;

    @Column(name="CALLER_DEVICE")
    private String callerDevice;

    @Column(name="CALLER_INFO_SHARED")
    private String callerInfoShared;

    @Column(name="EMP_FN")
    private String empFirstName;

    @Column(name="EMP_LN")
    private String empLastName;

    @Column(name="EMP_MSID")
    private String empMsId;

    @Column(name="EMP_EMAIL")
    private String empEmail;

    @Column(name="EMP_DESC")
    private String empDescription;

    @Column(name="RPRT_EMAIL")
    private String reporterEmail;

    @Column(name="RPRT_TS")
    private LocalDateTime reporterTs;

    @Column(name="RPRT_TZ")
    private String reporterTimeZone;

    @Column(name="CREAT_BY")
    private String createdBy;

    @Column(name="CREAT_TS", columnDefinition = "TIMESTAMP", updatable = false)
    private LocalDateTime createdTs;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "INCIDENT_ACTION_ID", referencedColumnName = "INCIDENT_ID")
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
