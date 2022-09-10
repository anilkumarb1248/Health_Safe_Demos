package com.healthsafe.app.provisioningservice.repository;

import com.healthsafe.app.provisioningservice.entity.incident.IncidentActionMemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IncidentActionMemberRepository extends JpaRepository<IncidentActionMemberEntity, Integer> {
}
