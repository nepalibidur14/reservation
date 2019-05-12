package com.flight.reservation.Controller;

import com.flight.reservation.dto.ReservationRequest;
import com.flight.reservation.entities.flightModel;
import com.flight.reservation.entities.reservationModel;
import com.flight.reservation.repos.FlightRepository;
import com.flight.reservation.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ReservationController {

    @Autowired
    FlightRepository flightRepository;

    @Autowired
    ReservationService reservationService;

    @RequestMapping("showCompleteReservation")
    public String showCompleteReservation(@RequestParam("flightId") long flightId, ModelMap modelMap)
    {
        flightModel flight=flightRepository.findById(flightId).get();
        modelMap.addAttribute("flight",flight);
        return "completeReservation";
    }

    @RequestMapping(value = "completeReservation" ,method= RequestMethod.POST)
    public String completeReservation(ReservationRequest reservationRequest, ModelMap modelMap)
    {
        reservationModel reservation=reservationService.bookFlight(reservationRequest);
        modelMap.addAttribute("msg","reservation confirmed successfully and the ID is:"+reservation.getId());
        return "reservationConfirmation";
    }
}
