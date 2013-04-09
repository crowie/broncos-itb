<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>Broncos</title>
  </head>

  <body>
  	Welcome to the Broncos application
  	
  	<br/>
  	<c:forEach var="user" items="${users}">
            Name: 
            <c:out value="${user.name}" />
            <br />
     </c:forEach>
  </body>
</html>

