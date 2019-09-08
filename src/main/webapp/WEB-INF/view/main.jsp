<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Arvin
  Date: 2019/9/8
  Time: 17:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=utf-8">
    <title>首页</title>
</head>
<body>
    <table border="1">
        <tr>
            <th>ID</th><th>NAME</th><th>SEX</th><th>AGE</th>
        </tr>
        <c:forEach items="${requestScope.user_2List}" var="user_2">
            <tr>
                <td>${user_2.id}</td>
                <td>${user_2.name}</td>
                <td>${user_2.sex}</td>
                <td>${user_2.age}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
