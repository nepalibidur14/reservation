<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title></title>
</head>
<body>
<h2>Flight Details</h2>
Airline:${flight.operatingAirlines}<br>
Departure City:${flight.departureCity}<br>
Arrival City:${flight.arrivalCity}<br>

<form action="completeReservation" method="post">
    <input type="text"  name="passengerFirstName" placeholder="enter firstname">
    <input type="text"  name="passengerLastName" placeholder="enter lastname">
    <input type="email"  name="passengerEmail" placeholder="enter email">
    <input type="text"  name="passengerPhone" placeholder="enter phone">
    <input type="text"  name="nameOnTheCard" placeholder="your card name">
    <input type="text"  name="cardNumber" placeholder="your card no.">
    <input type="text"  name="expirationDate" placeholder="card exp date">
    <input type="text"  name="securityCode" placeholder="your card security code">
    <input type="hidden" name="flightId" value="${flight.id}">
    <input type="submit" value="Confirm">

</form>
</body>
</html>