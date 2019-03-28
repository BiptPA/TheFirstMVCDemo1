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

<p><div class="text" style=" text-align:center;"><h1>职位投递详情</h1></div></p>
<table align="center" valign="center" border="1">
    <tr>
        <th>职位编号</th>
        <th>职位</th>
        <th>职位类型</th>
        <th>发布时间</th>
        <th>职位数量</th>
        <th>职位描述</th>
        <th>职位要求</th>
        <th>薪资</th>
        <th>联系电话</th>
        <th>工作地址</th>

    </tr>
    <c:forEach items="${companyPosition}" var="p">
        <tr>
            <td>${p.positionid}</td>
            <td>${p.positions}</td>
            <td>${p.postype}</td>
            <td>${p.posdate}</td>
            <td>${p.posnum}</td>
            <td>${p.posdes}</td>
            <td>${p.posreq}</td>
            <td>${p.possal}</td>
            <td>${p.posphone}</td>
            <td>${p.posloc}</td>
        </tr>
    </c:forEach>
    </table>
    </form>
    <p>
        <div class="text" style=" text-align:center;"><h1>此职位的简历投递情况</h1></div>
    </p>
    <table align="center" valign="center" border="1">
        <tr>
            <th>投递编号</th>
            <th>用户编号</th>
            <th>简历编号</th>
            <th>投递权限</th>
            <th>具体操作</th>
        </tr>
        <c:forEach items="${deliveryrecord}" var="c">
            <tr>
                <td>${c.deliverid}</td>
                <td>${c.userid}</td>
                <td>${c.resumeid}</td>
                <td>${c.acceptorrefuse}</td>
                <td><a href="/deliveryrecord/updateDeliveryrecord?deliverid=${c.deliverid}&resumeid=${c.resumeid}&userid=${c.userid}">简历处理</a></td>
            </tr>
        </c:forEach>

</table>
</form>
</body>
</html>
