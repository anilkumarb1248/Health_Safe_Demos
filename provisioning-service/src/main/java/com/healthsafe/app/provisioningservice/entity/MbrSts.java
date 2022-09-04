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
@Table(name="MBR_STS")
public class MbrSts  implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="MBR_STS_ID", unique = true, nullable = false)
    private Integer memberStatusId;

    @Column(name="MBR_STS_NM")
    private String memberStatusName;

    @Column(name="MBR_STS_DESC")
    private String memberStatusDescription;

    @Column(name="CREAT_BY")
    private String createdBy;

    @Column(name="CREAT_TS")
    private LocalDateTime createdTs;

    @Column(name="UPDT_BY")
    private String updatedBy;

    @Column(name="UPDT_TS")
    private LocalDateTime updatedTs;
}
