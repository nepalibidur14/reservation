package com.flight.reservation.service;

import com.flight.reservation.dto.ReservationRequest;
import com.flight.reservation.entities.flightModel;
import com.flight.reservation.entities.passengerModel;
import com.flight.reservation.entities.reservationModel;
import com.flight.reservation.repos.FlightRepository;
import com.flight.reservation.repos.PassengerRepository;
import com.flight.reservation.repos.ReservationRepository;
import com.flight.reservation.util.EmailUtil;
import com.flight.reservation.util.PDFGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ReservationServiceimpl implements ReservationService {

    @Autowired
    FlightRepository flightRepository;

    @Autowired
    PassengerRepository passengerRepository;

    @Autowired
    ReservationRepository reservationRepository;

    @Autowired
    PDFGenerator pdfGenerator;

    @Autowired
    EmailUtil emailUtil;

    @Override
    public reservationModel bookFlight(ReservationRequest reservationRequest) {

        Long flightId=reservationRequest.getFlightId();
        flightModel flight=flightRepository.findById(flightId).get();

        passengerModel passenger=new passengerModel();

        passenger.setFirstName(reservationRequest.getPassengerFirstName());
        passenger.setLastName(reservationRequest.getPassengerLastName());
        passenger.setEmail(reservationRequest.getPassengerEmail());
        passenger.setPhone(reservationRequest.getPassengerPhone());
        passengerModel savedPassenger=passengerRepository.save(passenger);

        reservationModel reservation=new reservationModel();
        reservation.setFlight(flight);
        reservation.setPassenger(savedPassenger);
        reservation.setChecked_in(false);

        reservationModel savedReservation=reservationRepository.save(reservation);

        String filePath="/Users/ben/IdeaProjects/reservation"+savedReservation.getId()+".pdf";
        pdfGenerator.generateItinerary(savedReservation,filePath);
        emailUtil.sendItinerary(passenger.getEmail(),filePath);
        return reservation;
    }



}
