<%@ page language="java" contentType="text/html; charset=utf8"
         pageEncoding="utf8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf8">
    <title>Title</title>
</head>
<body>
<div class="text" style=" text-align:center;"><h1>个人简历详情</h1></div>

<table align="center" valign="center" border="1">
    <tr>
        <th>简历编号</th>
        <th>用户编号</th>
        <th>真实姓名</th>
        <th>身份证号</th>
        <th>性别</th>
        <th>教育经历</th>
        <th>毕业院校</th>
        <th>掌握语言</th>
        <th>语言等级</th>
        <th>计算机等级</th>
        <th>专业</th>
        <th>工作经验</th>
        <th>职位</th>
        <th>期望薪资</th>
        <th>电话号</th>
        <th>邮箱</th>
        <th>qq</th>
        <th>现住址</th>
    </tr>
    <c:forEach items="${resume}" var="resume">
        <tr>
            <td>${resume.resumeid}</td>
            <td>${resume.userid}</td>
            <td>${resume.realname}</td>
            <td>${resume.idnum}</td>
            <td>${resume.sex}</td>
            <td>${resume.education}</td>
            <td>${resume.school}</td>
            <td>${resume.languages}</td>
            <td>${resume.lanlevel}</td>
            <td>${resume.comlevel}</td>
            <td>${resume.major}</td>
            <td>${resume.workexp}</td>
            <td>${resume.positions}</td>
            <td>${resume.exsalary}</td>
            <td>${resume.phonenum}</td>
            <td>${resume.email}</td>
            <td>${resume.qq}</td>
            <td>${resume.nowaddress}</td>
        </tr>
    </c:forEach>
    <div>
        <a href="/user/addUser">新增简历</a>
        <a href="/user/getUser">修改简历</a>
        <a href="/user/getUser">删除简历</a>
    </div>
</table>

</body>
</html>
