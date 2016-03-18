<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

hello:<a href="${pageContext.request.contextPath}/hello234">hello</a>


<br>
<br>
testParams:<a href="${pageContext.request.contextPath}/testParams?age=21&tell=112">testParams</a>
<br>
<br>
testParams:<a href="${pageContext.request.contextPath}/testParams2?age=121&tell=123">testParams</a>
<br>
<br>
testHeaders:<a href="${pageContext.request.contextPath}/testHeaders">testHeaders</a>
<br>
<br>
testAnt:<a href="${pageContext.request.contextPath}/testAnt##menqijnqiu##">testAnt</a>
<br>
<br>
testPathVariable:<a href="${pageContext.request.contextPath}/testPathVariable/{10212121231}">testPathVariable</a>
<br>
<br>
<fieldset>
Rest风格<br>
POST<br>
<form action="${pageContext.request.contextPath}/order" method="post">
<input type="submit" value="post_commit">
</form>
<br>
<br>
DELET<br>
<form action="${pageContext.request.contextPath}/order/1290" method="post">
	<input type="hidden" name="_method" value="DELETE">
	<input type="submit" value="delet_commit">
</form>
<br>
<br>
PUT<br>
<form action="${pageContext.request.contextPath}/order/3814" method="post">
	<input type="hidden" name="_method" value="PUT">
	<input type="submit" value="put_commit">
</form>
<br>
<br>
GET<br>
<a href="${pageContext.request.contextPath}/order/1022?num=88">GET</a>
<br>
<br>
testParams:<a href="${pageContext.request.contextPath}/testParams?age=111&email=hah@yahoo.com">testParams</a>
<br>
<br>
testCookieValue:<a href="${pageContext.request.contextPath}/testCookieValue">testCookieValue</a>
<br>
<br>
testPojo:<form action="${pageContext.request.contextPath}/testPojo" method="post">
	<input type="text" name="userName" value="mingren">
	<input type="password" name="passWorld" value="123">
	<input type="text" name="email" value="mren@yahoo.com">
	<input type="text" name="age" value="16">
	<input type="text" name="id" value="1007">
	<input type="submit" value="提交">

</form>
<br>
<br>
testModelAndView:<a href="${pageContext.request.contextPath}/testModelAndView">testModelAndView</a>
































testMAV:<a href="${pageContext.request.contextPath}/testMAV">testMAV</a>



</fieldset>
<br>
<br>
<br>



</body>
</html>