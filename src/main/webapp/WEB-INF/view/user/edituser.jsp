<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <script type="text/javascript">
        function updateUser(id) {
            document.getElementById("listForm").action = "/user/updateUsers?autoid="+ id;
            document.getElementById("listForm").submit();}
    </script>
    <title>Title</title>
</head>
<body>
<form action="/user/updateUsers" method="post">
    <fieldset>
        <legend>编辑用户</legend>
        用户ID：<input type="hidden" name="auto_id" value="${user.autoid}"><br>

        姓名：<input type="text" name="username" value="<%=request.getAttribute("user")%>"><br>


        <input type="button" value="修改" onclick="updateUser(<%=request.getAttribute("autoId")%>);">
    </fieldset>
</form>
</body>
</html>
