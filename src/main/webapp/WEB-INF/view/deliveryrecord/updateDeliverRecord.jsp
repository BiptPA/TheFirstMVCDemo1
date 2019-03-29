<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="/deliveryrecord/updateDeliverRecord" method="post">
    <fieldset>
        <legend>简历审核</legend>

        投递编号：<input type="text" name="deliverid" readonly="readonly" value="<%=request.getParameter("deliverid")%>"/><br>

        此求职者：<input type="text" name="realname" readonly="readonly" value="${deliver.realname}"/><br>

        拟用情况：<input type="text" name="acceptorrefuse" value="${deliver.acceptorrefuse}"/><br>

        <input type="submit" value="确认修改"/>
    </fieldset>
</form>
</body>
</html>
