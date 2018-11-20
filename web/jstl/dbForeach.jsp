<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>数据库信息查询</title>
</head>
<body>
<%-- <c:forEach var="i" begin="1" end="100" step="1">    --%>
<%-- 第<c:out value="${i}" />行 --%>
<!-- <br>    -->
<%-- </c:forEach>  --%>
<table border="2" height="100" width="400">
    <caption>用户信息</caption>
    <tr>
        <th>顺序</th>
        <th>id</th>
        <th>用户名</th>
        <th>密码</th>
    </tr>
    <c:forEach items="${userList}" var="user" step="1" varStatus="xh">
        <tr align="center">
            <td>${xh.count}</td>
            <td>${user.uid}</td>
            <td>${user.loginname}</td>
            <td>${user.loginpass}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
