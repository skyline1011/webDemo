<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录页面</title>
</head>
<body>
<form method="post" action="<%=request.getContextPath()%>/LoginServlet">
    用户名：<input type="text" id="uname" name="uname"><br><br>
    密码：<input type="password" id="pwd" name="pwd"><br><br>
    <input type="submit" value="登录">  
    <input type="reset" value="重置">
</form>
</body>
</html>
