<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
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

	<h3>Update User</h3>
	<hr>
	<div class="container" style="margin-top: 10vh">

		<sf:form action="updateUser" method="post" modelAttribute="User">
		
		<div class="form-group ">
				<label>ID </label>
				<sf:input path="id" cssClass="form-control"
					placeholder="Enter the id" type="text" readonly="true" />
			</div>
			<div class="form-group ">
				<label>Username </label>
				<sf:input path="username" cssClass="form-control"
					placeholder="Enter the Username" type="text" />
			</div>
			<div class="form-group ">
				<label>City </label>
				<sf:input path="city" cssClass="form-control"
					placeholder="Enter the City" type="text" />
			</div>
			<div class="form-group">
				<label>Password </label>
				<sf:input path="password" cssClass="form-control" 
					placeholder="Enter the Password" type="password" readonly="true" />
			</div>
		<button type="submit" class="btn btn-success">Update</button>	
		
		</sf:form>
	</div>
</body>
</html>