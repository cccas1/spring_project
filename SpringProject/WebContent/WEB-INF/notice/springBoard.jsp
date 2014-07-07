<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"      uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<div>
	${message}  /  ${count}
</div>
<div>
	<a href="..${button}"><button type="button">이동</button></a>
	<a href="../index.jsp"><button type="button">Go To Index</button></a>
</div>
<c:forEach var="result" items="${results}">
	<div>
		<p>${result.BOARD_TYPE_SEQ}</p>
		<p>${result.BOARD_SEQ}</p>
		<p>${result.CREATE_BY}</p>
		<p>${result.CREATE_DATE}</p>
		<p>${result.UPDATE_DATE}</p>
		<p>${result.DISABLE}</p>
		<p>${result.CONTENT}</p>
	</div>
</c:forEach>
</body>
</html>