<%@ page language="java" import="java.util.*" pageEncoding="utf-8" %>
<%@ page import="listener.SessionCounter" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>My JSP 'ApplicationTest.jsp' starting page</title>

</head>

<body>
在线人数为：<%=SessionCounter.getActiveSessions() %>
</body>
</html>
