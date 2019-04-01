<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <title></title>
</head>
<body>
<br>
<br>
<br>
<br>
<br>
<form action="/employ/login" method="POST" >
    <table width="300" border="1" align="center">
        <tr>
            <td colspan="2">求职者登录</td>
        </tr>
        <tr>
            <td>用户名:</td>
            <td><input type="text" name="account" value="${employ.account}"/>
            </td>
        </tr>
        <tr>
            <td>密码:</td>
            <td><input type="password" name="pwd" value="${employ.pwd}"/>
            </td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" name="submit" value="登录"/>
            </td>


        </tr>
    </table>
</form>
</body>
</html>
