<%-- 
  User: 78143
  Date: 2019/10/26
  Time: 17:00
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>ssm整合success</title>
</head>
<body>
<h1>SSM整合成功</h1>

<c:forEach items="${account}" varStatus="account" var="ac">
    ${ac.id}
    ${ac.name}
    ${ac.money}
</c:forEach>
<br>
</body>
</html>
