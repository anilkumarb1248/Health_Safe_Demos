package com.healthsafe.app.provisioningservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name="PRTL")
public class Prtl  implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="PRTL_ID", unique = true, nullable = false)
    private int prtlId;

    @Column(name="PRTL_SHRT_NM")
    private String portalShortName;

    @Column(name="PRTL_VER")
    private String portalVersion;

    @Column(name="PRTL_LNG_NM")
    private String portalLongName;

    @Column(name="PRTL_DSPL_NM")
    private String portalDisplayName;

    @Column(name="PRTL_LND_DFLT_PG_URL")
    private String portalLandingDefaultPageUrl;

    @Column(name="MBR_PRTL_SPC_MBR_ID_NM")
    private String memberPortalSpecificMemberIdName;

    @Column(name="PARNT_PRTL_ID")
    private Integer parentPortalId;

    @Column(name="CREAT_BY")
    private String createdBy;

    @Column(name="CREAT_TS")
    private LocalDateTime createdTs;

    @Column(name="UPDT_BY")
    private String updatedBy;

    @Column(name="UPDT_TS")
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
