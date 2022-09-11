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
@Table(name = "PRTL_MSG_RSN_MAPPING")
public class PortalEnablementMessageReason implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="PRTL_MSG_RSN_MAP_ID", unique = true, nullable = false)
    private Integer portalMessageReasonId;

    @Column(name = "PRTL_ID", nullable = false)
    private Integer portalId;

    @Column(name = "ENBL_DSBL_MSG_ID", nullable = false)
    private Integer messageId;

    @Column(name = "RSN_TYP_CD", nullable = false)
    private Character reasonTypeCode;

    @Column(name = "CREAT_BY")
    private String createdBy;

    @Column(name = "CREAT_TS", columnDefinition = "TIMESTAMP", updatable = false)
    private LocalDateTime createdTimestamp;

    @Column(name = "UPDT_BY")
    private String updatedBy;

    @Column(name = "UPDT_TS", columnDefinition = "TIMESTAMP")
    private LocalDateTime updatedTimestamp;

    public Integer getPortalMessageReasonId() {
        return portalMessageReasonId;
    }

    public void setPortalMessageReasonId(Integer portalMessageReasonId) {
        this.portalMessageReasonId = portalMessageReasonId;
    }

    public Integer getPortalId() {
        return portalId;
    }

    public void setPortalId(Integer portalId) {
        this.portalId = portalId;
    }

    public Integer getMessageId() {
        return messageId;
    }

    public void setMessageId(Integer messageId) {
        this.messageId = messageId;
    }

    public Character getReasonTypeCode() {
        return reasonTypeCode;
    }

    public void setReasonTypeCode(Character reasonTypeCode) {
        this.reasonTypeCode = reasonTypeCode;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public LocalDateTime getCreatedTimestamp() {
        return createdTimestamp;
    }

    public void setCreatedTimestamp(LocalDateTime createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public LocalDateTime getUpdatedTimestamp() {
        return updatedTimestamp;
    }

    public void setUpdatedTimestamp(LocalDateTime updatedTimestamp) {
        this.updatedTimestamp = updatedTimestamp;
    }
}
