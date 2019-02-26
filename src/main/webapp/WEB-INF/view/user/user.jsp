<%@ page language="java" contentType="text/html; charset=utf8"
         pageEncoding="utf8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf8">
    <title>Title</title>
    <script type="text/javascript">
        function updateUser(id) {
            document.getElementById("listForm").action = "/user/updateJsp?autoId="+ id;
            document.getElementById("listForm").submit();
            // form.action
            // $ajax({
            //
            // })

        }
    </script>
</head>
<body>
<h1></h1>
<form id="listForm" method="post">
    <table>
        <c:forEach items="${list}" var="data">
            <tr>
                <td>${data.autoId}</td>
                <td>${data.userName}</td>
                <td><input type="button" value="修改" onclick="updateUser(${data.autoId});"></td>
            </tr>
        </c:forEach>

    </table>
</form>
</body>
</html>
