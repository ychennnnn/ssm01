<%--
  Created by IntelliJ IDEA.
  User: ychen
  Date: 2020/2/11
  Time: 13:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h3>表现层执行了</h3>
<c:forEach items="${list}" var="account">
    ${account.name}
</c:forEach>
</body>
</html>
