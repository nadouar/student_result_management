<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
	<link rel="stylesheet" type="text/css" href="css.css">

</head>
<body>
	<!-- <c:choose>
<c:when test="${sessionScope.nom!=null}">
   <c:redirect url="menu.jsp">
   </c:redirect>
</c:when>
<c:otherwise> -->
   <!--<form action="Authentification" method="post">
     username: <input type="text" name="username"/><br><br>
     password: <input type="password" name="password"/><br><br>
     <input type="submit" value="envoyer"/>
   </form>-->
  <form action="adminloginaction.jsp" method="POST">
			<br><br>
			<div class="loginbox">
				<img src="image/avatar.png" class="avatar">
				<form action="" method="post" >
					<h1>Login Here</h1>
					<p>user name</p>
						<input type="text" name="username">
					<p>Password</p>
						<input type="password" name="password">
					<form action="" method="POST">
						<input type="submit" name="submit" value="Login">
						</form>
					</form>
					<a href="">Don't have an account ?</a>
					</form>
			</div>
		</form>
</c:otherwise>
</c:choose>
</body>
</html>