<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
         <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Insert title here</title>
		<link rel="stylesheet" type="text/css" href="css.css">
		
	</head>
	<body>
		<div class="header">
			<div class="container">
				<div class="navbar">
					<table class="center" >
						<tr>
							<td>
								<div class="logo">
									<img src="image/fsegn.png" width="125px" >
								</div>
							</td>
						</tr>
						<tr>
							<td><br><br>
								<nav>
									<ul>
										<li><a href="addnewstudent.jsp">Add new student</a></li>
										<li><a href="insertnewresult.jsp">insert new result</a></li>
										<li><a href="registeredstudent.jsp">registered student</a></li>
										<li><a href="allstudentresult.jsp">All student result</a></li>
										<li><a href="homepage.jsp">logout</a></li>
									</ul>
								</nav>
							</td>
						</tr>
						<tr>
							<td>
								<tr>
						<td ><br><br>
							<table class="center" width="650" style="border:2px solid #0B173B;" align="center">
								<tr>
									<td style="text-align:center">
										<h2 class="title">insert new result</h2>
									</td>
								</tr>
								<tr>
									<td style="text-align:center">
									<form action="save1.do" method="post">
										 <div class="input" >
											<br><br>
													JEE <input type="text" name="devjee" ><br><br>
													SOA <input type="text" name="soa" ><br><br>
													dev mobile <input type="text" name="devmobile" ><br><br>
													
										</div>
										<div>
											 <button type="submit" class="form-submit-button">save</button>
										</div>
										<br><br>
										</form>
      						</td>
								</tr>
							</table>
						</td>
					</tr>
					</table>
				</div>
			</div>
		</div>
	</body>
</html>