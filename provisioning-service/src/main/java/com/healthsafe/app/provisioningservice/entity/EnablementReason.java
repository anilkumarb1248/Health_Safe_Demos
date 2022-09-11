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
@Table(name="ENBL_DSBL_RSN")
public class EnablementReason implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ENBL_DSBL_RSN_ID", unique = true, nullable = false)
    private Integer reasonId;

    @Column(name="REASON")
    private String reason;

    @Column(name="RSN_TYP_CD")
    private Character reasonTypeCode;

    @Column(name="CREAT_BY")
    private String createdBy;

    @Column(name="CREAT_TS", columnDefinition = "TIMESTAMP", updatable = false)
    private LocalDateTime createdTimestamp;

    @Column(name="UPDT_BY")
    private String updatedBy;

    @Column(name="UPDT_TS", columnDefinition = "TIMESTAMP")
    private LocalDateTime updatedTimestamp;

    public Integer getReasonId() {
        return reasonId;
    }

    public void setReasonId(Integer reasonId) {
        this.reasonId = reasonId;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
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
