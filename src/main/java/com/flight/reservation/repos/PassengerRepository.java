package com.flight.reservation.repos;

import com.flight.reservation.entities.passengerModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassengerRepository extends JpaRepository<passengerModel, Long> {
}
