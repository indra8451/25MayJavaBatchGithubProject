<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> <!-- Importing JSTL core library -->
<!DOCTYPE html>
<html>
<head>
    <!-- Setting the charset for the HTML page to ISO-8859-1 -->
    <meta charset="ISO-8859-1">
    <!-- Title of the page displayed in the browser tab -->
    <title>Welcome Page</title>
</head>
<body>

<!-- Using JSTL core tag to display the "name" attribute -->

<h1>Welcome to this page, ${name}</h1>

<h1>Priting Data using jstl (jsp expression language)</h1>

<!-- Using JSTL core tag to iterate over the "Names" list -->

    
        <!-- Iterating over the "Names" list and displaying each name in an h2 tag -->
        <c:forEach var="personName" items="${Names}">
            <h2>Welcome to this page, ${personName}</h2>
        </c:forEach>

</body>
</html>
