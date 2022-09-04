package com.healthsafe.app.provisioningservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name="MBR")
public class Mbr  implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="PRVSN_MBR_ID", unique = true, nullable = false)
    private Integer provisionMemberId;

    @Column(name="HLTHSF_ID")
    private String healthSafeId;

    @Column(name="MDM_FST_NM")
    private String mdmFirstName;

    @Column(name="MDM_LST_NM")
    private String mdmLastName;

    @Column(name="PREF_NM")
    private String preferredName;

    @Column(name="EMAIL_ADDR")
    private String emailAddress;

    @Column(name="MDM_MBR_DOB")
    private LocalDate mdmMemberDOB;

    @Column(name="MDM_MBR_SBSCR_ID")
    private String mdmMemberSubscriberid;

    @Column(name="MDM_MBR_POL_NBR")
    private String mdmMemberPolicyNumber;

    @Column(name="MDM_MBR_CARR_ID")
    private String mdmMemberCarrierId;

    @Column(name="MDM_MBR_EMPLR_ID")
    private String mdmMemberEmployerId;

    @Column(name="MDM_MBR_ACCT_ID")
    private String mdmMemberAccountId;

    @Column(name="MDM_MBR_PRTCP_ID")
    private String mdmMemberParticipantId;

    @Column(name="MDM_MBR_CLM_ID")
    private String mdmMemberClaimId;

    @Column(name="MDM_MBR_SSN")
    private String mdmMemberSSN;

    @Column(name="MDM_MBR_ENCRP_SSN")
    private String mdmMemberEncryptedSSN;

    @Column(name="MDM_MBR_EID")
    private String mdmMemberEnterpriseId;

    @Column(name="MDM_MBR_ZIP_CD")
    private String mdmMemberZipCode;

    @Column(name="MDM_OVRD_IND")
    private String mdmOverrideIndicator;

    @Column(name="TERM_AND_COND_ACPT_DT")
    private LocalDate termsAndConditionsAcceptedDate;

    @ManyToOne
    @JoinColumn(name="MBR_STS_ID", nullable = false)
    private MbrSts memberStatus;

    @Column(name="MBR_RGST_TYP_ID")
    private String memberRegistrationType;

    @Column(name="CREAT_BY")
    private String createdBy;

    @Column(name="CREAT_TS")
    private LocalDateTime createdTs;

    @Column(name="UPDT_BY")
    private String updatedBy;

    @Column(name="UPDT_TS")
    private LocalDateTime updatedTs;

    @ManyToOne
    @JoinColumn(name="MBR_RGST_PRTL_ID")
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
