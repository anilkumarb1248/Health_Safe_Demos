package com.healthsafe.app.provisioningservice.model;

import java.time.LocalDateTime;

public class Prtl {
    private int prtlId;
    private String portalShortName;
    private String portalVersion;
    private String portalLongName;
    private String portalDisplayName;
    private String portalLandingDefaultPageUrl;
    private String memberPortalSpecificMemberIdName;
    private Integer parentPortalId;
    private String createdBy;
    private LocalDateTime createdTs;
    private String updatedBy;
    private LocalDateTime updatedTs;

    public int getPrtlId() {
        return prtlId;
    }

    public void setPrtlId(int prtlId) {
        this.prtlId = prtlId;
    }

    public String getPortalShortName() {
        return portalShortName;
    }

    public void setPortalShortName(String portalShortName) {
        this.portalShortName = portalShortName;
    }

    public String getPortalVersion() {
        return portalVersion;
    }

    public void setPortalVersion(String portalVersion) {
        this.portalVersion = portalVersion;
    }

    public String getPortalLongName() {
        return portalLongName;
    }

    public void setPortalLongName(String portalLongName) {
        this.portalLongName = portalLongName;
    }

    public String getPortalDisplayName() {
        return portalDisplayName;
    }

    public void setPortalDisplayName(String portalDisplayName) {
        this.portalDisplayName = portalDisplayName;
    }

    public String getPortalLandingDefaultPageUrl() {
        return portalLandingDefaultPageUrl;
    }

    public void setPortalLandingDefaultPageUrl(String portalLandingDefaultPageUrl) {
        this.portalLandingDefaultPageUrl = portalLandingDefaultPageUrl;
    }

    public String getMemberPortalSpecificMemberIdName() {
        return memberPortalSpecificMemberIdName;
    }

    public void setMemberPortalSpecificMemberIdName(String memberPortalSpecificMemberIdName) {
        this.memberPortalSpecificMemberIdName = memberPortalSpecificMemberIdName;
    }

    public Integer getParentPortalId() {
        return parentPortalId;
    }

    public void setParentPortalId(Integer parentPortalId) {
        this.parentPortalId = parentPortalId;
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
}
