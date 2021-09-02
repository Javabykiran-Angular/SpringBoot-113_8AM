<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h2>Login Page...</h2>

	<!-- <form action="loginuser" method="post"> -->
	<form action="login" method="post">
		
		<label>User Name:: &nbsp;&nbsp;</label> 
		<input type="text" 
		placeholder="Enter the username" name="username"> <br><br>
		
		<label>Password:: &nbsp;&nbsp;</label>
		<input type="password" 
		placeholder="Enter the Password" name="password">
		<br><br>
		<button type="submit">Login</button>
	
	</form>


</body>
</html>