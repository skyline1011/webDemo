<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>文件上传实例</title>
</head>
<body>
<h1>文件上传实例</h1>
<form method="post" action="<%=request.getContextPath()%>/UploadServlet" enctype="multipart/form-data">
    选择一个文件:
    <input type="file" name="uploadFile"/>
    <br/><br/>
    <input type="submit" value="上传"/>
</form>
</body>
</html>
