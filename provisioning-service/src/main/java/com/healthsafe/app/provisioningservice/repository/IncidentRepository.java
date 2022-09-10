package com.healthsafe.app.provisioningservice.repository;

import com.healthsafe.app.provisioningservice.entity.incident.IncidentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IncidentRepository extends JpaRepository<IncidentEntity, Integer> {
}
