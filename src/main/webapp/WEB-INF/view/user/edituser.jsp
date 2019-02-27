<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/user/updateUser" method="post">
    <fieldset>
        <legend>编辑用户</legend>
        用户ID：<input type="hidden" name="auto_id" value="${user.autoId}"><br>

        姓名：<input type="text" name="username" value="${user.userName}"><br>


        <input type="submit" value="提交">
    </fieldset>
</form>
</body>
</html>
