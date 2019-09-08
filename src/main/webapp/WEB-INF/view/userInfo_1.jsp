<%--
  Created by IntelliJ IDEA.
  User: Arvin
  Date: 2019/9/8
  Time: 11:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>文件下载</title>
</head>
<body>
    <h3>文件下载</h3>
    <a href="download?fileName=${requestScope.user_1.image.originalFilename}">
        ${requestScope.user_1.image.originalFilename}
    </a>
</body>
</html>
