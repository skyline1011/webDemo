<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:choose>
    <c:when test="${flag== true}">
        <h2>欢迎${name}</h2>
    </c:when>
    <c:otherwise>
        <h2>登录失败</h2>
    </c:otherwise>
</c:choose>

<%-- <c:if test="${flag== true}"> --%>
<%--     <h6>欢迎${name}</h6> --%>
<%-- </c:if> --%>
</body>
</html>
