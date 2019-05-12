package com.flight.reservation.repos;

import com.flight.reservation.entities.flightModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import java.util.Date;
import java.util.List;

public interface FlightRepository extends JpaRepository<flightModel, Long> {
        @Query("from flightModel where departureCity=:departureCity and arrivalCity=:arrivalCity and dateOfDeparture=:dateOfDeparture")
    List<flightModel> findFlights(@Param("departureCity")String from, @Param("arrivalCity") String to, @Param("dateOfDeparture") Date departureDate);
}
