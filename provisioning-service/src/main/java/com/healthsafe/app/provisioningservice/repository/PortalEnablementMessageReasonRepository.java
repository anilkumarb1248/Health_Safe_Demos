package com.healthsafe.app.provisioningservice.repository;

import com.healthsafe.app.provisioningservice.entity.PortalEnablementMessageReason;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PortalEnablementMessageReasonRepository extends JpaRepository<PortalEnablementMessageReason, Integer> {

    List<PortalEnablementMessageReason> findByPortalIdAndReasonTypeCode(Integer portalId, Character reasonTypeCode);

}
