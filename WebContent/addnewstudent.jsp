<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<link rel="stylesheet" type="text/css" href="css.css">
		
		<title>Insert title here</title>
	</head>
	<body>
		<div class="header">
		<div class="container">
			<div class="navbar">
				<table class="center">
					<tr>
						<td>
							<div class="logo">
								<img src="image/fsegn.png" width="125px">
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
						<td><br><br>
						
							<table class="center" width="650" style="border:2px solid #0B173B;" align="center">
								<tr>
									<td style="text-align:center">
										<h2 class="title">add new student</h2>
									</td>
								</tr>
									
								<tr>
									<td style="text-align:center">
									<form action="save.do" method="post">
										 <div class="input" >
											<br><br>Course Name   <input type="text" name="coursename" ><br><br>
													Branche Name  <input type="text" name="branchename" ><br><br>
													First Name    <input type="text" name="firstname" ><br><br>
													Last Name     <input type="text" name="lastname" ><br><br>
													Gender        <input type="text" name="gender" ><br><br> 
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