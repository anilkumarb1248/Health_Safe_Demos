package com.healthsafe.app.provisioningservice.entity.incident;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name="INCIDENT")
public class Incident {

    @Id
    @Column(name="INCIDENT_ID")
    private Integer incidentId;

    @Column(name="HLTHSF_ID")
    private String healthSafeId;

    @Column(name="INCIDENT_NBR")
    private String incidentNumber;

    @Column(name="PRTL_ID")
    private Integer prtlId;

    @Column(name="ENBL_DSBL_MSG_ID")
    private Integer enableDisableMessageId;

    @Column(name="ENBL_DSBL_RSN_ID")
    private Integer reasonId;

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

    @Column(name="CREAT_TS")
    private LocalDateTime createdTs;
}
