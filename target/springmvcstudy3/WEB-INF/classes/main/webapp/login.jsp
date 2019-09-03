<%--
  Created by IntelliJ IDEA.
  User: chenliangzhou
  Date: 2019/7/21
  Time: 4:23 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="/user/login.do" method="post">
        <table>
            <tr>
                <td>用户名</td>
                <td><input type="text" name="username"></td>
            </tr>
            <tr>
                <td>密码</td>
                <td><input type="text" name="password"></td>
            </tr>
            <tr>
                <td><img src="${pageContext.request.contextPath}/captcha/code.do" ></td>
                <td><input type="text" name="code"></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="登陆"></td>
            </tr>
        </table>
    </form>
</body>
</html>
