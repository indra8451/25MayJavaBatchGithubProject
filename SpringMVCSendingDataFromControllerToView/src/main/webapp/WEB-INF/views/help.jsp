<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %> <!-- for using jstl -->
<%@ page import="java.util.Set" %> <!-- Importing the Set class from java.util package -->
<!DOCTYPE html>
<html>
<head>
    <!-- Setting the charset for the HTML page to ISO-8859-1 -->
    <meta charset="ISO-8859-1">
    <!-- Title of the page displayed in the browser tab -->
    <title>Welcome Page</title>
</head>
<body>

<%
    // Retrieving the "name" attribute from the request scope,
    // which could have been set in the Spring controller or in a standard HttpServlet request
    String name = (String) request.getAttribute("name");

    // Retrieving the "idset" attribute (a set of IDs) from the request scope
    // This attribute was passed from the Spring controller (HomeController) as a Set<Integer>
    Set<Integer> idset = (Set<Integer>) request.getAttribute("idset");
%>

<!-- Displaying the "name" attribute retrieved from the request -->
<h1>Welcome to this page, <%= name %></h1>

<%
    // Checking if the "idset" is not null before trying to iterate over it
    if (idset != null) {
        // Iterating over the Set of IDs and displaying each ID in an h2 tag
        for (Integer id : idset) {
            out.println("<h2>Welcome to this page, ID: " + id + "</h2>");
        }
    } else {
        // If "idset" is null (no IDs found), this message is displayed
        out.println("<h2>No IDs found.</h2>");
    }
%>

</body>
</html>
