<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="<c:url value='/j_spring_security_check' />" method="post">
		<table>
			<tr>
				<td>User Name Nhat Nguyen :</td>
				<td><input type="text" name="j_username"></td>
			</tr>
			<tr>
				<td>Password Nhat Nguyen :</td>
				<td><input type="password" name="j_password"></td>
			</tr>
			<tr>
				<td>Remember me :</td>
				<td><input type="checkbox" name="_spring_security_remember_me"></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Login"></td>
			</tr>
		</table>
	</form>
</body>
</html>