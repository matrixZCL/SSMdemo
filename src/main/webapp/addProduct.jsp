<%--
  Created by IntelliJ IDEA.
  User: chenliangzhou
  Date: 2019/7/21
  Time: 3:01 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="/product/add.do" method="post">
        <table>
            <tr>
                <td>商品id</td>
                <td><input type="text" name="id"></td>
            </tr>
            <tr>
                <td>商品名</td>
                <td><input type="text" name="name"></td>
            </tr>
            <tr>
                <td>库存</td>
                <td><input type="text" name="count"></td>
            </tr>
            <tr>
                <td>单价</td>
                <td><input type="text" name="price"></td>
            </tr>
            <tr>
                <td>出厂日期</td>
                <td><input type="text" name="birth"></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" name="添加"></td>
            </tr>
        </table>
    </form>
</body>
</html>
