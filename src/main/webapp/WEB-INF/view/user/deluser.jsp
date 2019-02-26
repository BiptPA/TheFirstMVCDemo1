<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/delUser" method="post">
    <fieldset>
        <legend>删除用户</legend>
        用户ID：<input type="hidden" name="auto_id"><br>

        姓名：<input type="text" name="username"><br>
        密码：<input type="text" name="password"><br>

        <input type="submit" value="提交">
    </fieldset>
</form>
</body>
</html>
