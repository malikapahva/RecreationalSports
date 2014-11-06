<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Teams</title>
</head>
<body>
<h2>Showing Teams</h2>

<c:forEach var="team" items="${teams}">
    <p>${team.teamName}</p>
</c:forEach>

</body>
</html>