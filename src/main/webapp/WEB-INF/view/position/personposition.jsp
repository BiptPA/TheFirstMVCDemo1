<%@ page language="java" contentType="text/html; charset=utf8"
         pageEncoding="utf8"%>
<%--<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>--%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf8">
    <title>Title</title>
    <script type="text/javascript">
        function updatePosition(id) {
            document.getElementById("listPosition").action="/position/updatepositionJsp?positionid="+ id;
            document.getElementById("listPosition").submit();
        }
    </script>

</head>
<body>
<div class="text" style=" text-align:center;"><h1>职位详情</h1></div>
<form id="listPosition" method="post">
    <table align="center" valign="center" border="1">
        <tr>
            <th>职位编号</th>
            <th>用户编号</th>
            <th>职位</th>
            <th>职位类型</th>
            <th>发布时间</th>
            <th>职位数量</th>
            <th>职位描述</th>
            <th>职位要求</th>
            <th>薪资</th>
            <th>联系电话</th>
            <th>工作地址</th>
            <th>公司名称</th>
            <th>公司描述</th>
        </tr>
        <%--<c:forEach items="${personposition}" var="po">--%>
            <tr>
                <td>${personposition.positionid}</td>
                <td>${personposition.userid}</td>
                <td>${personposition.positions}</td>
                <td>${personposition.postype}</td>
                <td>${personposition.posdate}</td>
                <td>${personposition.posnum}</td>
                <td>${personposition.posdes}</td>
                <td>${personposition.posreq}</td>
                <td>${personposition.possal}</td>
                <td>${personposition.posphone}</td>
                <td>${personposition.posloc}</td>
                <td>${personposition.company}</td>
                <td>${personposition.comdes}</td>
                <%--<td><a href="/position/getPosition">职位详情</a></td>--%>
                <%--<td><input type="button" value="修改" onclick="updatePosition(${p.positionid});"/></td>--%>
                <%--<td><a href="/position//deletePosition?id=${p.positionid}">删除</a></td>--%>
            </tr>
        <%--</c:forEach>--%>
        <div>
            <a href="/position/addPositionJsp">新增职位</a>

        </div>
    </table>
</form>
</body>
</html>
