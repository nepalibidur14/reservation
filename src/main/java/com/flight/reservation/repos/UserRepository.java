package com.flight.reservation.repos;

import com.flight.reservation.entities.userModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<userModel, Long> {
    userModel findByEmail(String email);
}
