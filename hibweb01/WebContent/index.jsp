<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="showresults.jsp">show</a>
<h1>Registration Form</h1>
<form action="register" method="post">
<table>
<tr>
<td>User Name</td>
<td><input type="text" name="userName" size="30" /></td>
</tr>
<tr>
<td>Password</td>
<td><input type="password" name="password1" size="30" /></td>
</tr>
<tr>
<td>Confirm Password</td>
<td><input type="password" name="password2" size="30" /></td>
</tr>
<tr>
<td>Email</td>
<td><input type="text" name="email" size="30" /></td>
</tr>
<tr>
<td>Phone</td>
<td><input type="text" name="phone" size="30" /></td>
</tr>
<tr>
<td>City</td>
<td><input type="text" name="city" size="30" /></td>
</tr>
</table>
<p>
<input type="submit" value="Register" />
</p>
</form>
</body>
</html>