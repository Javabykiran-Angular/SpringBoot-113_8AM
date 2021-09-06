<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
	href="${pageContext.request.contextPath}/resources/bootstrap.min.css"
	type="text/css" rel="stylesheet">
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-light bg-success">


		<div class="collapse navbar-collapse" id="navbarTogglerDemo03">
			<ul class="navbar-nav mr-auto mt-2 mt-lg-0">

				<li class="nav-item active">
					<h2>
						Welcome User&nbsp; ${username} <span class="sr-only">(current)</span>
					</h2>
				</li>

			</ul>

		</div>
	</nav>

	<table
		class="table table-dark table-striped table-bordered table-hover">

		<thead>
			<tr>
				<th class="text-center">ID</th>
				<th>NAME</th>
				
				<th>CITY</th>
				<th>Action</th>
			</tr>
		</thead>

		<tbody>
			<c:forEach  var="user" items="${userlist}">
				<tr>
					<td class="text-center"><c:out value="${user.id}"></c:out></td>
					<td><c:out value="${user.username}"></c:out></td>
				
					<td><c:out value="${user.city}"></c:out></td>
					<td><a href="deleteUserById?id=${user.id}">Delete |</a>
					 <a href="getUserById?id=${user.id}">Update</a></td>

				</tr>

			</c:forEach>

		</tbody>

	</table>


</body>
</html>