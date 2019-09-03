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
<form action="/file/upload.do" method="post" enctype="multipart/form-data">
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
            <td>选择头像</td>
            <td><input type="file" name="pic"></td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" value="登陆"></td>
        </tr>
    </table>
</form>
</body>
</html>
