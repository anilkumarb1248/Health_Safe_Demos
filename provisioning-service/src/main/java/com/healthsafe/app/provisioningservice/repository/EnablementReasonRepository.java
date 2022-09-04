package com.healthsafe.app.provisioningservice.repository;

import com.healthsafe.app.provisioningservice.entity.EnablementReason;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnablementReasonRepository extends JpaRepository<EnablementReason, Integer>{
}
