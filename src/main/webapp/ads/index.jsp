<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: michaelmeyer
  Date: 11/8/20
  Time: 8:43 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="/partials/head.jsp">
        <jsp:param name="title" value="Ads Index"/>
    </jsp:include>
</head>
<body>
<jsp:include page="/partials/navbar.jsp" />
    <h1>Current Ads:</h1>

    <c:forEach var="ad" items="${ads}">
        <div class="ad mb-5">
            <h3>${ad.title}</h3>
            <p>${ad.description}</p>
        </div>
    </c:forEach>

</body>
</html>
