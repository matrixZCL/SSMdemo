<%--
  Created by IntelliJ IDEA.
  User: chenliangzhou
  Date: 2019/7/21
  Time: 2:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="/address/add.do">
        <table>
            <tr>
                <td>邮编</td>
                <td><input type="text" name="list[0].zipCode"></td>
            </tr>
            <tr>
                <td>城市</td>
                <td><input type="text" name="list[0].city"></td>
            </tr>

            <tr>
                <td>邮编</td>
                <td><input type="text" name="list[1].zipCode"></td>
            </tr>
            <tr>
                <td>城市</td>
                <td><input type="text" name="list[1].city"></td>
            </tr>

            <tr>
                <td><input type="button" value="+"></td>
                <td><input type="submit" value="提交"></td>
            </tr>
        </table>
    </form>
</body>
</html>
