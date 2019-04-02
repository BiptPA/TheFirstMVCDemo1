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
<p><div class="text" style=" text-align:center;"><h2>求职者简历</h2></div></p>
    <table align="center" valign="center" border="1">
        <tr>
            <th>用户编号</th>
            <th>真实姓名</th>
            <th>身份证号</th>
            <th>性别</th>
            <th>学历</th>
            <th>毕业院校</th>
            <th>外语</th>
            <th>语言等级</th>
            <th>计算机等级</th>
            <th>专业</th>
            <th>工作经验</th>
            <th>意向职位</th>
            <th>期望薪水</th>
            <th>电话号</th>
            <th>电子邮件</th>
            <th>个人QQ</th>
            <th>现住址</th>
        </tr>
        <c:forEach items="${employresume}" var="e">
            <tr>
                <td>${e.userid}</td>
                <td>${e.realname}</td>
                <td>${e.idnum}</td>
                <td>${e.sex}</td>
                <td>${e.education}</td>
                <td>${e.school}</td>
                <td>${e.languages}</td>
                <td>${e.lanlevel}</td>
                <td>${e.comlevel}</td>
                <td>${e.major}</td>
                <td>${e.workexp}</td>
                <td>${e.positions}</td>
                <td>${e.exsalary}</td>
                <td>${e.phonenum}</td>
                <td>${e.email}</td>
                <td>${e.qq}</td>
                <td>${e.nowaddress}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
