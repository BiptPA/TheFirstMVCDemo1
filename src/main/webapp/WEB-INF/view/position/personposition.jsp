<%@ page language="java" contentType="text/html; charset=utf8"
         pageEncoding="utf8"%>
<%--<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>--%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf8">
    <title>Title</title>

</head>
<body>

        <style>
            body{text-align:left; line-height:22px}
        </style>
        <body>
                <h2>公司名称：${perposition.companyName}</h2>
                <h1>职位名称：${perposition.positions}</h1>
                <h3>发布时间：${perposition.posdate}</h3>
                <h3>职位类型：${perposition.postype}</h3>
                <h3>职位数量：${perposition.posnum}</h3>
                <h3>职位描述：${perposition.posdes}</h3>
                <h3>职位要求：${perposition.posreq}</h3>
                <h3>薪   资：${perposition.possal}</h3>
                <h3>联系电话：${perposition.posphone}</h3>
                <h3>公司描述：${perposition.comdes}</h3>
                <h3>工作地点：${perposition.posloc}</h3>
        </body>

<a href="/resume/getOneResume?positionid=${perposition.positionid}">投简历</a>


    </table>
</form>
</body>
</html>
