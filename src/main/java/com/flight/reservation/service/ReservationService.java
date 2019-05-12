package com.flight.reservation.service;

import com.flight.reservation.dto.ReservationRequest;
import com.flight.reservation.entities.reservationModel;

public interface ReservationService {
    public reservationModel bookFlight(ReservationRequest reservationRequest);
}
