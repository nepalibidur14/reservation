package com.flight.reservation.entities;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

@Entity
@Table(name = "flight")
public class flightModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="FLIGHT_NUMBER")
    private String flightNumber;

    @Column(name="OPERATING_AIRLINES")
    private String operatingAirlines;

    @Column(name="DEPARTURE_CITY")
    private String departureCity;

    @Column(name="ARRIVAL_CITY")
    private String arrivalCity;

    @Column(name="DATE_OF_DEPARTURE")
    private Date dateOfDeparture;

    @Column(name="ESTIMATED_DEPARTURE_TIME")
    private Timestamp estimatedDepartureTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getOperatingAirlines() {
        return operatingAirlines;
    }

    public void setOperatingAirlines(String operatingAirlines) {
        this.operatingAirlines = operatingAirlines;
    }

    public String getDepartureCity() {
        return departureCity;
    }

    public void setDepartureCity(String departureCity) {
        this.departureCity = departureCity;
    }

    public String getArrivalCity() {
        return arrivalCity;
    }

    public void setArrivalCity(String arrivalCity) {
        this.arrivalCity = arrivalCity;
    }

    public Date getDateOfDeparture() {
        return dateOfDeparture;
    }

    public void setDateOfDeparture(Date dateOfDeparture) {
        this.dateOfDeparture = dateOfDeparture;
    }

    public Timestamp getEstimatedDepartureTime() {
        return estimatedDepartureTime;
    }

    public void setEstimatedDepartureTime(Timestamp estimatedDepartureTime) {
        this.estimatedDepartureTime = estimatedDepartureTime;
    }
}
