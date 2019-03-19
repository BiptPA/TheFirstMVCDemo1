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
<%--<div class="text" style=" text-align:center;"><h1>职位详情</h1></div>--%>
<%--<form id="listPosition" method="post">--%>
    <%--<table align="center" valign="center" border="1">--%>
        <%--<tr>--%>
            <%--<th>职位编号</th>--%>
            <%--<th>用户编号</th>--%>
            <%--<th>职位</th>--%>
            <%--<th>职位类型</th>--%>
            <%--<th>发布时间</th>--%>
            <%--<th>职位数量</th>--%>
            <%--<th>职位描述</th>--%>
            <%--<th>职位要求</th>--%>
            <%--<th>薪资</th>--%>
            <%--<th>联系电话</th>--%>
            <%--<th>工作地址</th>--%>
            <%--<th>公司名称</th>--%>
            <%--<th>公司描述</th>--%>
        <%--</tr>--%>
        <%--&lt;%&ndash;<c:forEach items="${personposition}" var="po">&ndash;%&gt;--%>
            <%--<tr>--%>
                <%--<td>${perposition.positionid}</td>--%>
                <%--<td>${perposition.userid}</td>--%>
                <%--<td>${perposition.positions}</td>--%>
                <%--<td>${perposition.postype}</td>--%>
                <%--<td>${perposition.posdate}</td>--%>
                <%--<td>${perposition.posnum}</td>--%>
                <%--<td>${perposition.posdes}</td>--%>
                <%--<td>${perposition.posreq}</td>--%>
                <%--<td>${perposition.possal}</td>--%>
                <%--<td>${perposition.posphone}</td>--%>
                <%--<td>${perposition.posloc}</td>--%>
                <%--<td>${perposition.company}</td>--%>
                <%--<td>${perposition.comdes}</td>--%>
                <%--&lt;%&ndash;<td><a href="/position/getPosition">职位详情</a></td>&ndash;%&gt;--%>
                <%--&lt;%&ndash;<td><input type="button" value="修改" onclick="updatePosition(${p.positionid});"/></td>&ndash;%&gt;--%>
                <%--&lt;%&ndash;<td><a href="/position//deletePosition?id=${p.positionid}">删除</a></td>&ndash;%&gt;--%>
            <%--</tr>--%>


        <style>
            body{text-align:left; line-height:22px}
        </style>
        <body>
                <h2>公司名称：${perposition.company}</h2>
                <h1>职位名称：${perposition.positions}</h1>
                <h3>发布时间：${perposition.posdate}</h3>
                <h3>职位类型：${perposition.postype}</h3>
                <h3>职位数量：${perposition.posnum}</h3>
                <h3>职位描述：${perposition.posdes}</h3>
                <h3>职位要求：${perposition.posreq}</h3>
                <h3>薪   资：${perposition.possal}</h3>
                <h3>联系电话：${perposition.posphone}</h3>
                <h3>公司描述：${perposition.comdes}</h3>
                <h3>工作地点：${perposition.company}</h3>
        </body>

<a href="/resume/getOneResume?positionid=${perposition.positionid}">投简历</a>

    <%--</c:forEach>--%>
        <%--<div>--%>
            <%--<a href="/position/addPositionJsp">新增职位</a>--%>

        <%--</div>--%>
    </table>
</form>
</body>
</html>
