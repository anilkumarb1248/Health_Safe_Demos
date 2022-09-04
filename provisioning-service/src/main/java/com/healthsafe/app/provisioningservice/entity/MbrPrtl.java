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
@Table(name="MBR_PRTL")
public class MbrPrtl  implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="MBR_PRTL_ID", unique = true, nullable = false)
    private Integer memberPortalId;

    @Column(name="PRTL_ID")
    private Integer portalId;

    @Column(name="MBR_PRTL_FST_NM")
    private String memberPortalFirstName;

    @Column(name="MBR_PRTL_LST_NM")
    private String memberPortalLastName;

    @Column(name="MBR_PRTL_DOB")
    private LocalDate memberPortalDob;

    @Column(name="MBR_PRTL_GDR")
    private String memberPortalGender;

    @Column(name="MBR_PRTL_SBSCR_ID")
    private String memberPortalSubscriberId;

    @Column(name="MBR_PRTL_POL_NBR")
    private String memberPortalPolicyNumber;

    @Column(name="MBR_PRTL_ADDR_LN_1_TXT")
    private String memberPortalAddressLineText1;

    @Column(name="MBR_PRTL_ADDR_LN_2_TXT")
    private String memberPortalAddressLineText2;

    @Column(name="MBR_PRTL_CTY_NM")
    private String memberPortalCityName;

    @Column(name="MBR_PRTL_ST_NM")
    private String memberPortalStateName;

    @Column(name="MBR_PRTL_ZIP_CD")
    private String memberPortalZipCode;

    @Column(name="MBR_PRTL_SSN")
    private String memberPortalSSN;

    @Column(name="MBR_PRTL_ENCRP_SSN")
    private String memberPortalEncryptedSSN;

    @Column(name="MBR_PRTL_SPC_MBR_ID")
    private String memberPortalSpecificMemberId;

    @Column(name="PRVSN_MBR_ID")
    private Integer provisionMemberId;

    @ManyToOne
    @JoinColumn(name="MBR_STS_ID", nullable = true)
    private MbrSts memberStatusId;

    @Column(name="MBR_PRTL_ELIG_FAIL_DT")
    private LocalDateTime memberPortalEligibilityFailureDate;

    @Column(name="MBR_PRTL_EFF_DT")
    private LocalDate memberPortalEffectiveDate;

    @Column(name="MBR_PRTL_EXPIR_DT")
    private LocalDate memberPortalExpiryDate;

    @Column(name="CREAT_BY")
    private String createdBy;

    @Column(name="CREAT_TS")
    private LocalDateTime createdTs;

    @Column(name="UPDT_BY")
    private String updatedBy;

    @Column(name="UPDT_TS")
    private LocalDateTime updatedTs;

    @Column(name="MBR_PRTL_ELIGIBILITY_RESPONSE")
    private String memberPortalEligibilityResponse;

    @Column(name="EXPIRE_TS")
    private LocalDateTime expiryTs;

    public Integer getMemberPortalId() {
        return memberPortalId;
    }

    public void setMemberPortalId(Integer memberPortalId) {
        this.memberPortalId = memberPortalId;
    }

    public Integer getPortalId() {
        return portalId;
    }

    public void setPortalId(Integer portalId) {
        this.portalId = portalId;
    }

    public String getMemberPortalFirstName() {
        return memberPortalFirstName;
    }

    public void setMemberPortalFirstName(String memberPortalFirstName) {
        this.memberPortalFirstName = memberPortalFirstName;
    }

    public String getMemberPortalLastName() {
        return memberPortalLastName;
    }

    public void setMemberPortalLastName(String memberPortalLastName) {
        this.memberPortalLastName = memberPortalLastName;
    }

    public LocalDate getMemberPortalDob() {
        return memberPortalDob;
    }

    public void setMemberPortalDob(LocalDate memberPortalDob) {
        this.memberPortalDob = memberPortalDob;
    }

    public String getMemberPortalGender() {
        return memberPortalGender;
    }

    public void setMemberPortalGender(String memberPortalGender) {
        this.memberPortalGender = memberPortalGender;
    }

    public String getMemberPortalSubscriberId() {
        return memberPortalSubscriberId;
    }

    public void setMemberPortalSubscriberId(String memberPortalSubscriberId) {
        this.memberPortalSubscriberId = memberPortalSubscriberId;
    }

    public String getMemberPortalPolicyNumber() {
        return memberPortalPolicyNumber;
    }

    public void setMemberPortalPolicyNumber(String memberPortalPolicyNumber) {
        this.memberPortalPolicyNumber = memberPortalPolicyNumber;
    }

    public String getMemberPortalAddressLineText1() {
        return memberPortalAddressLineText1;
    }

    public void setMemberPortalAddressLineText1(String memberPortalAddressLineText1) {
        this.memberPortalAddressLineText1 = memberPortalAddressLineText1;
    }

    public String getMemberPortalAddressLineText2() {
        return memberPortalAddressLineText2;
    }

    public void setMemberPortalAddressLineText2(String memberPortalAddressLineText2) {
        this.memberPortalAddressLineText2 = memberPortalAddressLineText2;
    }

    public String getMemberPortalCityName() {
        return memberPortalCityName;
    }

    public void setMemberPortalCityName(String memberPortalCityName) {
        this.memberPortalCityName = memberPortalCityName;
    }

    public String getMemberPortalStateName() {
        return memberPortalStateName;
    }

    public void setMemberPortalStateName(String memberPortalStateName) {
        this.memberPortalStateName = memberPortalStateName;
    }

    public String getMemberPortalZipCode() {
        return memberPortalZipCode;
    }

    public void setMemberPortalZipCode(String memberPortalZipCode) {
        this.memberPortalZipCode = memberPortalZipCode;
    }

    public String getMemberPortalSSN() {
        return memberPortalSSN;
    }

    public void setMemberPortalSSN(String memberPortalSSN) {
        this.memberPortalSSN = memberPortalSSN;
    }

    public String getMemberPortalEncryptedSSN() {
        return memberPortalEncryptedSSN;
    }

    public void setMemberPortalEncryptedSSN(String memberPortalEncryptedSSN) {
        this.memberPortalEncryptedSSN = memberPortalEncryptedSSN;
    }

    public String getMemberPortalSpecificMemberId() {
        return memberPortalSpecificMemberId;
    }

    public void setMemberPortalSpecificMemberId(String memberPortalSpecificMemberId) {
        this.memberPortalSpecificMemberId = memberPortalSpecificMemberId;
    }

    public Integer getProvisionMemberId() {
        return provisionMemberId;
    }

    public void setProvisionMemberId(Integer provisionMemberId) {
        this.provisionMemberId = provisionMemberId;
    }

    public MbrSts getMemberStatusId() {
        return memberStatusId;
    }

    public void setMemberStatusId(MbrSts memberStatusId) {
        this.memberStatusId = memberStatusId;
    }

    public LocalDateTime getMemberPortalEligibilityFailureDate() {
        return memberPortalEligibilityFailureDate;
    }

    public void setMemberPortalEligibilityFailureDate(LocalDateTime memberPortalEligibilityFailureDate) {
        this.memberPortalEligibilityFailureDate = memberPortalEligibilityFailureDate;
    }

    public LocalDate getMemberPortalEffectiveDate() {
        return memberPortalEffectiveDate;
    }

    public void setMemberPortalEffectiveDate(LocalDate memberPortalEffectiveDate) {
        this.memberPortalEffectiveDate = memberPortalEffectiveDate;
    }

    public LocalDate getMemberPortalExpiryDate() {
        return memberPortalExpiryDate;
    }

    public void setMemberPortalExpiryDate(LocalDate memberPortalExpiryDate) {
        this.memberPortalExpiryDate = memberPortalExpiryDate;
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

    public String getMemberPortalEligibilityResponse() {
        return memberPortalEligibilityResponse;
    }

    public void setMemberPortalEligibilityResponse(String memberPortalEligibilityResponse) {
        this.memberPortalEligibilityResponse = memberPortalEligibilityResponse;
    }

    public LocalDateTime getExpiryTs() {
        return expiryTs;
    }

    public void setExpiryTs(LocalDateTime expiryTs) {
        this.expiryTs = expiryTs;
    }
}
