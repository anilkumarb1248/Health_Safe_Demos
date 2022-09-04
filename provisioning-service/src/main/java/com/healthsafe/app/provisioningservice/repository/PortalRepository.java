package com.healthsafe.app.provisioningservice.repository;

import com.healthsafe.app.provisioningservice.entity.Prtl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PortalRepository extends JpaRepository<Prtl, Integer> {
}
