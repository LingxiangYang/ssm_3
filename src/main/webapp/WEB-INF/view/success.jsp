<%--
  Created by IntelliJ IDEA.
  User: Arvin
  Date: 2019/9/7
  Time: 22:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html>
<head>
    <title>测试JSR 303</title>
</head>
<body>
<h3>测试JSR 303</h3>
登录名：${requestScope.user.loginname}<br>
密码：${requestScope.user.password}<br>
用户名：${requestScope.user.username}<br>
年龄：${requestScope.user.age}<br>
邮箱：${requestScope.user.email}<br>
<%--生日：${fmt:formatDate value="${requerstScope.user.birthday}"
pattern="yyyy年MM月dd日"}<br>--%>
电话：${requestScope.user.phone}
</body>
</html>
