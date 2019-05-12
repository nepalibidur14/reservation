package com.flight.reservation.repos;

import com.flight.reservation.entities.reservationModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<reservationModel, Long> {
}
