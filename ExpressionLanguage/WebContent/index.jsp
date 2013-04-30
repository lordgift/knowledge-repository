<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%-- <%@taglib prefix="c" uri="http://java.sun.com/jstl/core" %> JSTL 1.0--%>   
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> <!-- JSTL 1.1 support JSTL with taglib -->

 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="./Servlet" method="post">
		<input type="submit"/>
	</form>
	post param a = ${param.a} <BR/>
	session param sesParam1 = ${sessionScope.sesParam1}
	
	<c:forEach items="${sessionScope.datas}" var="datas">
		<c:out value="${datas}"></c:out>
	</c:forEach>
	
</body>
</html>