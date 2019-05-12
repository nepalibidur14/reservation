<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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

<h2>flights details</h2>
<table>
    <tr>
        <th>Airlines</th>
        <th>Departure City</th>
        <th>Arrival City</th>
        <th>Departure Time</th>
        <th>Choose Flight</th>
    </tr>

    <c:forEach items="${flights}" var="flight">
        <tr>
        <td>${flight.operatingAirlines}</td>
        <td>${flight.departureCity}</td>
        <td>${flight.arrivalCity}</td>
        <td>${flight.dateOfDeparture}</td>
        <td><a href="showCompleteReservation?flightId=${flight.id}">Select</a> </td>

        </tr>
    </c:forEach>
</table>
</body>
</html>