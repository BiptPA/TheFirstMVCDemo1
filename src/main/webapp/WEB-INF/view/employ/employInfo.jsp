<%@ page language="java" contentType="text/html; charset=utf8"
         pageEncoding="utf8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf8">
    <title>Title</title>


</head>
<body>
<div class="text" style=" text-align:center;"><h2>简历投递反馈情况</h2></div>
<div class="text" style=" text-align:left;"><h2>${employ.account},你好！</h2></div>
<table align="center" valign="center" border="1">
    <tr>
        <th>职位名称</th>
        <th>投递反馈</th>
    </tr>
    <c:forEach items="${deliverinfo}" var="c">
        <tr>
            <td>${c.positions}</td>
            <td>${c.acceptorrefuse}</td>
        </tr>
    </c:forEach>
</table>

    <p>
        <div class="text" style=" text-align:center;"><h2><a href="/position/getPosition"/>继续投递</h2></div>
    </p>

</body>
</html>
