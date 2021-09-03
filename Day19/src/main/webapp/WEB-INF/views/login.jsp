<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
  <link href="${pageContext.request.contextPath}/resources/bootstrap.min.css"
type="text/css" rel="stylesheet"
>

</head>
<body>

<h2>Login User</h2>

	<div class="container" style="margin-top: 10px;">
	
	<%
		String msg=(String)request.getAttribute("msg");
		if(msg!=null){
	%>
	<span style="color: red;font-weight: bold;">${msg}</span>
	<%} %>
	<hr>
	
	<div class="card bg-light" style="max-width: 300px;">


			<article class="card-body mx-auto" style="max-width: 500px;">
				
				<!-- <form action="login" method="post"> -->
				<sf:form action="login" method="post" modelAttribute="user">
				
					<div class="form-group input-group">
						
						<!-- <input name="username" class="form-control"
							placeholder="Enter the Username" type="text"> -->
					<sf:input path="username" cssClass="form-control"
					placeholder="Enter the Username" type="text"/>		
					</div>

					<div class="form-group input-group">
						
						<!-- <input type="password" class="form-control" name="password"
							placeholder="Enter the Password"> -->
						<sf:input path="password" cssClass="form-control"
						 placeholder="Enter the Password"
						type="password" />	
					</div>
					
					 <button type="submit" class="btn btn-success">Login</button>

				</sf:form>
				<!-- </form> -->


			</article>

		</div>

	</div>
	

</body>
</html>