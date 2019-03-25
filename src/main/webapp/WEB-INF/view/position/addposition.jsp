<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/position/addPosition" method="post">
    <fieldset>
        <legend>添加职位</legend>

        职位名称：<input type="text" name="positions"><br>
        职位类型：<input type="text" name="postype"><br>
        发布时间：<input type="date" name="posdate"><br>
        职位数量：<input type="text" name="posnum"><br>
        职位描述：<input type="text" name="posdes"><br>
        职位要求：<input type="text" name="posreq"><br>
        薪资：<input type="text" name="possal"><br>
        联系电话：<input type="text" name="posphone"><br>
        工作地点：<input type="text" name="posloc"><br>
        公司名称：<input type="text" name="companyName"><br>
        公司描述：<input type="text" name="comdes"><br>

        <input type="submit" value="提交">

    </fieldset>
</form>
</body>
</html>
