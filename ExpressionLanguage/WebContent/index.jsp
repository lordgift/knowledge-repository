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
	<%
		pageContext.setAttribute("test", "page");
	%>
	
	<input type="button" value="setAttibutes" onclick="location.href='Servlet'"/>
	<input type="button" value="setParamTextbox" onclick="location.href='index.jsp?textbox=text'"/>
	<input type="button" value="setParamTextbox" onclick="location.href='index.jsp?textbox=textarea'"/>
	
	<BR/><BR/>
	applicationScope.test => ${applicationScope.test } <BR/>
	application.getAttribute("test") => <%=application.getAttribute("test") %><BR/><BR/>
	
	sessionScope.test => ${sessionScope.test} <BR/>
	session.getAttribute("test") => <%=session.getAttribute("test") %><BR/><BR/>
	
	requestScope.test => ${requestScope.test}<BR/>
	request.getAttribute("test") => <%=request.getAttribute("test") %><BR/><BR/>
	
	pageScope.test => ${pageScope.test }<BR/>
	pageContext.getAttribute("test") => <%= pageContext.getAttribute("test") %><BR/><BR/>

	test => ${test } <BR/>
	pageContext.findAttribute("test") => <%=pageContext.findAttribute("test") %><BR/><BR/>
	
	param.textbox => ${param.textbox}<BR/>
	request.getParameter("test") => <%=request.getParameter("test") %><BR/><BR/>
	
	======================= JSTL c:choose,c:when condition ======================= 
	<BR/>	
	<c:choose>
		<c:when test="${param.textbox eq 'text'}">
			<input type="text" />
		</c:when>
		<c:when test="${param.textbox eq 'textarea'}">
			<textarea></textarea>
		</c:when>
		<c:otherwise>
			Out of case
    	</c:otherwise>
	</c:choose>

	<BR/>
	======================= JSTL c:if condition ======================= 
	<BR/>
	<c:if test="${param.textbox eq 'text'}">
		<input type="text" />
	</c:if>
	<c:if test="${param.textbox eq 'textarea'}">
		<textarea></textarea>
	</c:if>
	
	<BR/>
	======================= JSTL c:forEach iteration =======================
	<BR/> 	
	<c:forEach items="${sessionScope.datas}" var="datas">
		<c:out value="${datas}"></c:out>
	</c:forEach>
	
</body>
</html>