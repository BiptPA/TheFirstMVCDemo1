<%@ page language="java" contentType="text/html; charset=utf8"
         pageEncoding="utf8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf8">
    <title>Title</title>
    <script type="text/javascript">
        // function updateResume(id) {
        //     document.getElementById("listResume").action="/resume/updatereJsp?resumeid="+ id;
        //     document.getElementById("listResume").submit();
        // }

         function RWes() {
            var obj1 = document.getElementsByName("res");
            for(var i=0;i<obj1.length;i++){
                if(obj1[i].checked){
                    var res=obj1[i].value;
                    res.action="";
                    console.log("参数为："+res);
                   // window.alert(res);
                }
            }

        }


    </script>




</head>
<body>
<div class="text" style=" text-align:center;"><h1>个人简历详情</h1></div>
<form id="listResume" method="post">
    <table align="center" valign="center" border="1">
        <tr>
            <th>选用简历</th>
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
        <c:forEach items="${oneresume}" var="resume">
            <tr>
                <td><input type="radio" name="res" value="${resume.resumeid}" checked="checked" onclick="RWes()"/></td>
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
                <td><a href="/deliveryrecord/addDeliveryrecord?positionid=<%=request.getParameter("positionid")%>&resumeid=${resume.resumeid}&userid=${resume.userid}">提交简历</a></td>
                <td><input type="button" value="修改" onclick="updateResume(${resume.resumeid});"/></td>
                <td><a href="/resume/deleteresume?id=${resume.resumeid}">删除</a></td>
            </tr>
        </c:forEach>
        <div>
            <a href="/resume/addreJsp">新增简历</a>
            <%--<a href="/user/getUser">修改简历</a>--%>
            <%--<a href="/user/getUser">删除简历</a>--%>
        </div>
        <%--<p>--%>
        <%--<td><a href="/deliveryrecord/addDeliveryrecord?positionid=<%=request.getParameter("positionid")%>&resumeid=${resume.resumeid}&userid=${resume.userid}">提交简历</a></td>--%>
        <%--</p>--%>
    </table>
</form>
</body>
</html>
