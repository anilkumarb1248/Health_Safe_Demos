package com.healthsafe.app.provisioningservice.repository;

import com.healthsafe.app.provisioningservice.entity.incident.IncidentActionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IncidentActionRepository extends JpaRepository<IncidentActionEntity, Integer> {
}
