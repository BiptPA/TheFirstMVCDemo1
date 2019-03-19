<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <script type="text/javascript">
        function updatePosition(id) {
            document.getElementById("listPosition").action="/position/updatepositionJsp?positionid="+ id;
            document.getElementById("listPosition").submit();
        }
    </script>


    <title>Title</title>
</head>
<body>
<form action="/position//updatePosition" method="post">
    <fieldset>
        <legend>编辑用户</legend>
        职位编号：<input type="text" name="positionid" value="${position.positionid}"/><br>

        职位名称：<input type="text" name="positions" value="${position.positions}"/><br>

        职位类型：<input type="text" name="postype" value="${position.postype}"/><br>

        发布时间：<input type="date" name="posdate" value="${position.posdate}"/><br>

        职位数量：<input type="text" name="posnum" value="${position.posnum}"/><br>

        职位描述：<input type="text" name="posdes" value="${position.posdes}"/><br>

        职位要求：<input type="text" name="posreq" value="${position.posreq}"/><br>

        薪资：<input type="text" name="possal" value="${position.possal}"/><br>

        联系电话：<input type="text" name="posphone" value="${position.posphone}"/><br>

        工作地点：<input type="text" name="posloc" value="${position.posloc}"/><br>

        公司名称：<input type="text" name="company" value="${position.company}"/><br>

        公司描述：<input type="text" name="comdes" value="${position.comdes}"/><br>

        <input type="submit" value="确认修改"/>
    </fieldset>
</form>
</body>
</html>
