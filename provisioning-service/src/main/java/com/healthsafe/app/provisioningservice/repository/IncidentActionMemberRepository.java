package com.healthsafe.app.provisioningservice.repository;

import com.healthsafe.app.provisioningservice.entity.incident.IncidentActionMember;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IncidentActionMemberRepository extends JpaRepository<IncidentActionMember, Integer> {
}
