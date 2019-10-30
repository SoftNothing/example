<%-- 
  User: 78143
  Date: 2019/10/26
  Time: 17:01
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>SSM</title>
</head>
<body>
    <a href="account/findAll">查询所有</a>
<br>
    <form action="account/saveAccount" method="post">
        姓名：<input type="text" name="name">
        金额：<input type="text" name="money">
        <input type="submit" value="提交">
    </form>

<br>
</body>
</html>
