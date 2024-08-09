<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>success</title>
</head>
<body>
<%--  simply printing from model object
 <h1>login successfully</h1>
<h1>Welcome, ${name}</h1>
<h1>Your Email, ${email}</h1>
<h1>Your Password, ${pass}</h1> --%>


<!-- below code for using User class user object -->
<h1>login successfully</h1>
<h1>Welcome, ${user.name}</h1>
<h1>Your Email, ${user.email}</h1>
<h1>Your Password, ${user.pass}</h1>
</body>
</html>