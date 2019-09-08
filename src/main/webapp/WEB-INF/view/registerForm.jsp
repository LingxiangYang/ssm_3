<%--
  Created by IntelliJ IDEA.
  User: Arvin
  Date: 2019/9/7
  Time: 22:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=utf-8">
    <title>测试JSR 303</title>
</head>
<body>
<h3>注册页面</h3>
<form:form modelAttribute="user" method="post" action="login">
    <table>
        <tr>
            <td>登陆名：</td>
            <td><form:input path="loginname"/></td>
            <td><form:errors path="loginname" cssClass="color:red"/> </td>
        </tr>
        <tr>
            <td>密码：</td>
            <td><form:input path="password"/> </td>
            <td><form:errors path="password" cssClass="color:red"/> </td>
        </tr>
        <tr>
            <td>用户名：</td>
            <td><form:input path="username"/></td>
            <td><form:errors path="username" cssClass="color:red"/> </td>
        </tr>
        <tr>
            <td>年龄：</td>
            <td><form:input path="age"/></td>
            <td><form:errors path="age" cssClass="color:red"/> </td>
        </tr>
        <tr>
            <td>邮箱：</td>
            <td><form:input path="email"/></td>
            <td><form:errors path="email" cssClass="color:red"/> </td>
        </tr>
        <%--<tr>
            <td>生日：</td>
            <td><form:input path="birthday"/></td>
            <td><form:errors path="birthday" cssClass="color:red"/> </td>
        </tr>--%>
        <tr>
            <td>电话：</td>
            <td><form:input path="phone"></form:input></td>
            <td><form:errors path="phone" cssClass="color:red"/></td>
        </tr>
        <tr>
            <td><input type="submit" value="提交"></td>
        </tr>
    </table>
</form:form>
</body>
</html>
