<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/resume/addResume" method="post">
    <fieldset>
        <legend>添加简历</legend>

        真实姓名：<input type="text" name="realname"><br>
        身份证号：<input type="text" name="idnum"><br>
        性别：<input type="text" name="sex"><br>
        学历：<input type="text" name="education"><br>
        学校：<input type="text" name="school"><br>
        语言：<input type="text" name="languages"><br>
        语言级别：<input type="text" name="lanlevel"><br>
        计算机级别：<input type="text" name="comlevel"><br>
        专业：<input type="text" name="major"><br>
        工作经验：<input type="text" name="workexp"><br>
        职位：<input type="text" name="positions"><br>
        期望薪资：<input type="text" name="exsalary"><br>
        电话号：<input type="text" name="phonenum"><br>
        电子邮件：<input type="text" name="email"><br>
        QQ：<input type="text" name="qq"><br>
        现住址：<input type="text" name="nowaddress"><br>
        <input type="submit" value="确认增加">

    </fieldset>
</form>
</body>
</html>
