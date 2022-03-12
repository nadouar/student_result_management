<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri= "http://java.sun.com/jsp/jstl/core" prefix ="c" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
				<link rel="stylesheet" type="text/css" href="css.css">

</head>
	<body>
		<div align="center">
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
								<td >
								<br><br>	
								<form action="chercher1.do" method="get">
							        <label>Roll number</label>
							        <input type="text" name="motCle1" value="${model1.motCle1}"/>
							        <button type="submit" class="btn">Chercher</button>
							      </form>   
									<table class="center" width="650" border="2px	 solid #0B173B;" align="center">
										<tr>
												<td style="text-align:center"><h4 class="col-4">Roll Number</h4></td>
												<td style="text-align:center"><h4 class="col-4">JEE</h4></td>
												<td style="text-align:center"><h4 class="col-4">SOA</h4></td>
												<td style="text-align:center"><h4 class="col-4">dev mobile</h4></td>
											</tr>
											<c:forEach items="${model1.results}" var="c">
											<tr>
											
												<td class="col-4">${c.rollnumber}</td>
												<td class="col-4">${c.devjee}</td>
												<td class="col-4">${c.soa}</td>
												<td class="col-4">${c.devmobile}</td>
											</tr>
											</c:forEach>
										</table>
										 
											
							</table>
						</div>
					</div>
				 </div>	
			</div>	
	</body>
</html>