package com.healthsafe.app.provisioningservice.model.incident;

import java.time.LocalDateTime;


public class Incident {
    private Integer incidentId;
    private String healthSafeId;
    private String incidentNumber;
    private Integer prtlId;
    private Integer enableDisableMessageId;
    private Integer reasonId;
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
}
