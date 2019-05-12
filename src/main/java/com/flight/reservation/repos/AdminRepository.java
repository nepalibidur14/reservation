package com.flight.reservation.repos;

import com.flight.reservation.entities.adminModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<adminModel, Integer> {
    adminModel findByEmail(String email);
}
