<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Hotel Listings</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/spacelab/bootstrap.min.css" />
</head>
<body>
	<h1>Hotels in ${city }:</h1>

	<table class="table">
		<thead>
			<tr>
				<th>Name</th>
				<th>City</th>
				<th>Price Per Night</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="hotels" items="${hotels}">
				<tr>
					<td>${hotels.name}</td>
					<td>${hotels.city}</td>
					<td>${hotels.pricePerNight}</td>
					<%-- <td>
						<!-- <a href="/products/update?id=${ product.id }" class="btn btn-light btn-sm">Edit</a> -->
						<a href="/restaurant/uprate?id=${ items.id }"
						class="btn btn-light btn-sm">Up Rating</a> <a
						href="/restaurant/downrate?id=${ items.id }"
						class="btn btn-light btn-sm">Down Rating</a>
					</td> --%>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<a href="/" class="btn btn-link"><button class="btn btn-primary">Home</button></a>
</body>
</html>