package com.healthsafe.app.provisioningservice.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class MbrPrtl {
    private Integer memberPortalId;
    private Integer portalId;
    private String memberPortalFirstName;
    private String memberPortalLastName;
    private LocalDate memberPortalDob;
    private String memberPortalGender;
    private String memberPortalSubscriberId;
    private String memberPortalPolicyNumber;
    private String memberPortalAddressLineText1;
    private String memberPortalAddressLineText2;
    private String memberPortalCityName;
    private String memberPortalStateName;
    private String memberPortalZipCode;
    private String memberPortalSSN;
    private String memberPortalEncryptedSSN;
    private String memberPortalSpecificMemberId;
    private Integer provisionMemberId;
    private MbrSts memberStatusId;
    private LocalDateTime memberPortalEligibilityFailureDate;
    private LocalDate memberPortalEffectiveDate;
    private LocalDate memberPortalExpiryDate;
    private String createdBy;
    private LocalDateTime createdTs;
    private String updatedBy;
    private LocalDateTime updatedTs;
    private String memberPortalEligibilityResponse;
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
