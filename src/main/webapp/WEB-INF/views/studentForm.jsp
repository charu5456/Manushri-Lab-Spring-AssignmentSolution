<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css"
	integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS"
	crossorigin="anonymous">

<title>Student Fest Event</title>
</head>
<body>

	<div class="container">
		<h2>Student Fest Event</h2>

		<p class="h4 mb-4">Student</p>

		<form action="/EventManagement/student/save" method="POST">

			<!-- Add hidden form field to handle update -->
			<input type="hidden" name="id" value="${Student.id}" />

			<div class="form-inline">
				<input type="text" name="name" value="${Student.name}"
					class="form-control mb-4 col-4" placeholder="Name" />
			</div>
			<div class="form-inline">
				<input type="text" name="dept" value="${Student.dept}"
					class="form-control mb-4 col-4" placeholder="Department" />
			</div>
			<div class="form-inline">
				<input type="text" name="country" value="${Student.country}"
					class="form-control mb-4 col-4" placeholder="Country" />
			</div>
			<button type="submit" class="btn btn-info col-2">Save</button>
		</form>

		<a href="/EventManagement/student/list">Back to Participants List</a>

	</div>
</body>
</html>
