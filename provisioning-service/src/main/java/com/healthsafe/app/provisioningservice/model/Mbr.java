package com.healthsafe.app.provisioningservice.model;

import java.time.LocalDate;
import java.time.LocalDateTime;


public class Mbr {
    private Integer provisionMemberId;
    private String healthSafeId;
    private String mdmFirstName;
    private String mdmLastName;
    private String preferredName;
    private String emailAddress;
    private LocalDate mdmMemberDOB;
    private String mdmMemberSubscriberid;
    private String mdmMemberPolicyNumber;
    private String mdmMemberCarrierId;
    private String mdmMemberEmployerId;
    private String mdmMemberAccountId;
    private String mdmMemberParticipantId;
    private String mdmMemberClaimId;
    private String mdmMemberSSN;
    private String mdmMemberEncryptedSSN;
    private String mdmMemberEnterpriseId;
    private String mdmMemberZipCode;
    private String mdmOverrideIndicator;
    private LocalDate termsAndConditionsAcceptedDate;
    private MbrSts memberStatus;
    private String memberRegistrationType;
    private String createdBy;
    private LocalDateTime createdTs;
    private String updatedBy;
    private LocalDateTime updatedTs;
    private Prtl prtl;

    public Integer getProvisionMemberId() {
        return provisionMemberId;
    }

    public void setProvisionMemberId(Integer provisionMemberId) {
        this.provisionMemberId = provisionMemberId;
    }

    public String getHealthSafeId() {
        return healthSafeId;
    }

    public void setHealthSafeId(String healthSafeId) {
        this.healthSafeId = healthSafeId;
    }

    public String getMdmFirstName() {
        return mdmFirstName;
    }

    public void setMdmFirstName(String mdmFirstName) {
        this.mdmFirstName = mdmFirstName;
    }

    public String getMdmLastName() {
        return mdmLastName;
    }

    public void setMdmLastName(String mdmLastName) {
        this.mdmLastName = mdmLastName;
    }

    public String getPreferredName() {
        return preferredName;
    }

    public void setPreferredName(String preferredName) {
        this.preferredName = preferredName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public LocalDate getMdmMemberDOB() {
        return mdmMemberDOB;
    }

    public void setMdmMemberDOB(LocalDate mdmMemberDOB) {
        this.mdmMemberDOB = mdmMemberDOB;
    }

    public String getMdmMemberSubscriberid() {
        return mdmMemberSubscriberid;
    }

    public void setMdmMemberSubscriberid(String mdmMemberSubscriberid) {
        this.mdmMemberSubscriberid = mdmMemberSubscriberid;
    }

    public String getMdmMemberPolicyNumber() {
        return mdmMemberPolicyNumber;
    }

    public void setMdmMemberPolicyNumber(String mdmMemberPolicyNumber) {
        this.mdmMemberPolicyNumber = mdmMemberPolicyNumber;
    }

    public String getMdmMemberCarrierId() {
        return mdmMemberCarrierId;
    }

    public void setMdmMemberCarrierId(String mdmMemberCarrierId) {
        this.mdmMemberCarrierId = mdmMemberCarrierId;
    }

    public String getMdmMemberEmployerId() {
        return mdmMemberEmployerId;
    }

    public void setMdmMemberEmployerId(String mdmMemberEmployerId) {
        this.mdmMemberEmployerId = mdmMemberEmployerId;
    }

    public String getMdmMemberAccountId() {
        return mdmMemberAccountId;
    }

    public void setMdmMemberAccountId(String mdmMemberAccountId) {
        this.mdmMemberAccountId = mdmMemberAccountId;
    }

    public String getMdmMemberParticipantId() {
        return mdmMemberParticipantId;
    }

    public void setMdmMemberParticipantId(String mdmMemberParticipantId) {
        this.mdmMemberParticipantId = mdmMemberParticipantId;
    }

    public String getMdmMemberClaimId() {
        return mdmMemberClaimId;
    }

    public void setMdmMemberClaimId(String mdmMemberClaimId) {
        this.mdmMemberClaimId = mdmMemberClaimId;
    }

    public String getMdmMemberSSN() {
        return mdmMemberSSN;
    }

    public void setMdmMemberSSN(String mdmMemberSSN) {
        this.mdmMemberSSN = mdmMemberSSN;
    }

    public String getMdmMemberEncryptedSSN() {
        return mdmMemberEncryptedSSN;
    }

    public void setMdmMemberEncryptedSSN(String mdmMemberEncryptedSSN) {
        this.mdmMemberEncryptedSSN = mdmMemberEncryptedSSN;
    }

    public String getMdmMemberEnterpriseId() {
        return mdmMemberEnterpriseId;
    }

    public void setMdmMemberEnterpriseId(String mdmMemberEnterpriseId) {
        this.mdmMemberEnterpriseId = mdmMemberEnterpriseId;
    }

    public String getMdmMemberZipCode() {
        return mdmMemberZipCode;
    }

    public void setMdmMemberZipCode(String mdmMemberZipCode) {
        this.mdmMemberZipCode = mdmMemberZipCode;
    }

    public String getMdmOverrideIndicator() {
        return mdmOverrideIndicator;
    }

    public void setMdmOverrideIndicator(String mdmOverrideIndicator) {
        this.mdmOverrideIndicator = mdmOverrideIndicator;
    }

    public LocalDate getTermsAndConditionsAcceptedDate() {
        return termsAndConditionsAcceptedDate;
    }

    public void setTermsAndConditionsAcceptedDate(LocalDate termsAndConditionsAcceptedDate) {
        this.termsAndConditionsAcceptedDate = termsAndConditionsAcceptedDate;
    }

    public MbrSts getMemberStatus() {
        return memberStatus;
    }

    public void setMemberStatus(MbrSts memberStatus) {
        this.memberStatus = memberStatus;
    }

    public String getMemberRegistrationType() {
        return memberRegistrationType;
    }

    public void setMemberRegistrationType(String memberRegistrationType) {
        this.memberRegistrationType = memberRegistrationType;
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

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public LocalDateTime getUpdatedTs() {
        return updatedTs;
    }

    public void setUpdatedTs(LocalDateTime updatedTs) {
        this.updatedTs = updatedTs;
    }

    public Prtl getPrtl() {
        return prtl;
    }

    public void setPrtl(Prtl prtl) {
        this.prtl = prtl;
    }
}
