<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>
<%@ page import="java.util.List" %> <!-- Importing the List class from java.util package -->
<!DOCTYPE html>
<html>
<head>
    <!-- Setting the charset for the HTML page to ISO-8859-1 -->
    <meta charset="ISO-8859-1">
    <!-- Title of the page displayed in the browser tab -->
    <title>Welcome Page</title>
</head>
<h1>Priting Data using java  it not best approach go for jstl(jsp expression language)</h1>
<body>

<%
    // Retrieving the "name" attribute from the request scope, which was set in the controller
    String name = (String) request.getAttribute("name");

    // Retrieving the "Names" attribute (a list of names) from the request scope
    // The attribute was passed from the controller (HomeController) as a List<String>
    List<String> Names = (List<String>) request.getAttribute("Names");
%>

<!-- Displaying the name attribute retrieved from the request -->
<h1>Welcome to this page, <%= name %></h1>

<%
    // Checking if the "Names" list is not null before trying to iterate over it
    if (Names != null) {
        // Iterating over the list of names and displaying each name in an h2 tag
        for (String personName : Names) {
            out.println("<h2>Welcome to this page, " + personName + "</h2>");
        }
    } else {
        // If "Names" is null (no names found), this message is displayed
        out.println("<h2>No names found.</h2>");
    }
%>

</body>
</html>
