<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>登录成功页面</title>
</head>
<body>
登录成功！${name},${pwd}
<form method="get" action="<%=request.getContextPath()%>/LoginServlet">
    <input type="submit" value="注销登录">
</form>
</body>
</html>
