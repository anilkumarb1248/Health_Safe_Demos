package com.healthsafe.app.provisioningservice.repository;

import com.healthsafe.app.provisioningservice.entity.incident.IncidentAction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IncidentActionRepository extends JpaRepository<IncidentAction, Integer> {
}
