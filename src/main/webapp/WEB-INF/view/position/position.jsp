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
<div class="text" style=" text-align:center;"><h1>所有职位</h1></div>
<form id="listPosition" method="post">
    <table align="center" valign="center" border="1">
        <tr>
            <th>职位编号</th>
            <th>职位</th>
            <th>职位详情<th>
        </tr>
        <c:forEach items="${positions}" var="p">
            <tr>
                <td>${p.positionid}</td>
                <td>${p.positions}</td>
                <td><a href="/position/getPersonPosition?positionid=${p.positionid}">职位详情</a></td>
            </tr>
        </c:forEach>
        <div>
            <a href="/position/addPositionJsp" >新增职位</a>

        </div>
    </table>
</form>
</body>
</html>
