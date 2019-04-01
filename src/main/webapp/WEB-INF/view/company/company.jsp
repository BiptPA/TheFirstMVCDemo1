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
<p><div class="text" style=" text-align:center;"><h2>公司名：${company.companyName}</h2></div></p>
<div class="text" style=" text-align:left;"><h2>${employer.employerAccount},你好！</h2></div>
    <table align="center" valign="center" border="1">
        <tr>
            <th>职位编号</th>
            <th>职位</th>
            <th>职位投递详情</th>
        </tr>
        <c:forEach items="${company.positionList}" var="c">
            <tr>
                <td>${c.positionid}</td>
                <td>${c.positions}</td>
                <td><a href="/position/getCompanyPositionDetail?positionid=${c.positionid}">职位投递详情</a></td>
            </tr>
        </c:forEach>

    </table>

</body>
</html>
