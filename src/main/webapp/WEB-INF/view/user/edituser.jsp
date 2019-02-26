<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/user/editUser" method="post">
    <fieldset>
        <legend>编辑用户</legend>
        用户ID：<input type="hidden" name="auto_id" value="${user.autoId}"><br>

        姓名：<input type="text" name="username" value="${user.userName}"><br>
        密码：<input type="text" name="password" value="${user.password}"><br>

        <input type="submit" value="提交">
    </fieldset>
</form>
</body>
</html>
