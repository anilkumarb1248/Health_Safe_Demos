package com.healthsafe.app.provisioningservice.repository;

import com.healthsafe.app.provisioningservice.entity.EnablementMessage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnablementMessageRepository extends JpaRepository<EnablementMessage, Integer> {

    EnablementMessage findByMessage(String message);
}
