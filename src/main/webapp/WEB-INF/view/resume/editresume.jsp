<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <script type="text/javascript">
        function updateResume(id) {
            document.getElementById("listResume").action = "/resume/updateResumes?resumeid="+ id;
            document.getElementById("listResume").submit();
        }

    </script>


    <title>Title</title>
</head>
<body>
<form action="/resume/updateResumes" method="post">
    <fieldset>
        <legend>编辑用户</legend>
        简历ID：<input type="text" name="resumeid" value="<%=request.getParameter("resumeid")%>"/><br>

        修改真实姓名：<input type="text" name="realname" value="${resume.realname}"/><br>

        修改身份证号：<input type="text" name="idnum" value="${resume.idnum}"/><br>

        修改性别：<input type="text" name="sex" value="${resume.sex}"/><br>

        修改学历：<input type="text" name="education" value="${resume.education}"/><br>

        修改学校：<input type="text" name="school" value="${resume.school}"/><br>

        修改语言：<input type="text" name="languages" value="${resume.languages}"/><br>

        修改语言等级：<input type="text" name="lanlevel" value="${resume.lanlevel}"/><br>

        修改计算机等级：<input type="text" name="comlevel" value="${resume.comlevel}"/><br>

        修改专业：<input type="text" name="major" value="${resume.major}"/><br>

        修改工作经验：<input type="text" name="workexp" value="${resume.workexp}"/><br>

        修改职位：<input type="text" name="positions" value="${resume.positions}"/><br>

        修改期望薪资：<input type="text" name="exsalary" value="${resume.exsalary}"/><br>

        修改电话号：<input type="text" name="phonenum" value="${resume.phonenum}"/><br>

        修改电子邮件：<input type="text" name="email" value="${resume.email}"/><br>

        修改QQ号：<input type="text" name="qq" value="${resume.qq}"/><br>

        修改现住址：<input type="text" name="nowaddress" value="${resume.nowaddress}"/><br>

        <input type="submit" value="修改"/>
    </fieldset>
</form>
</body>
</html>
