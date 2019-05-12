package com.flight.reservation.entities;

import javax.persistence.*;

@Entity
@Table(name = "reservation")
public class reservationModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "CHECKED_IN")
    private boolean checked_in;

    @Column(name = "NUMBER_OF_BAGS")
    private int numberOfBags;

    @OneToOne
    private passengerModel passenger;

    @OneToOne
    private flightModel flight;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isChecked_in() {
        return checked_in;
    }

    public void setChecked_in(boolean checked_in) {
        this.checked_in = checked_in;
    }

    public int getNumberOfBags() {
        return numberOfBags;
    }

    public void setNumberOfBags(int numberOfBags) {
        this.numberOfBags = numberOfBags;
    }

    public passengerModel getPassenger() {
        return passenger;
    }

    public void setPassenger(passengerModel passenger) {
        this.passenger = passenger;
    }

    public flightModel getFlight() {
        return flight;
    }

    public void setFlight(flightModel flight) {
        this.flight = flight;
    }
}
