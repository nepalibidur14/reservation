package com.flight.reservation.service;

import com.flight.reservation.entities.adminModel;

public interface AdminService  {
    void deleteReservation(adminModel admin);
    adminModel updateReservation(adminModel admin);
}
