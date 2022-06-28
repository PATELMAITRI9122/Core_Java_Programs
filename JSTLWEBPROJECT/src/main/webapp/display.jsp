<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver" 
	url="jdbc:mysql://localhost:3306/maitridb" user="root" password="root"/>
	<sql:query var="rs" dataSource="${db}">select * from student</sql:query>
	<c:forEach items="${rs.rows}" var="name">
		<c:out value="${name.rollNo}"></c:out> : <c:out value="${name.marks}"></c:out> : <c:out value="${name.name}"></c:out><br>
	</c:forEach>
	
	<c:set var="str" value="Maitri's Java JSTL Application"></c:set>
	Length: ${fn:length(str)}
	<br>
	<c:forEach items="${fn:split(str,' ')}" var="s">
		<br>
		${s}
	</c:forEach>
	
	<br>
	<c:forEach items="${fn:split(str,'a')}" var="s1">
		<br>
		${s1}
	</c:forEach>
	
	<br>
	index: ${fn:indexOf(str,"Java")}<br>
	is there: ${fn:contains(str,'JSp')}
	<br>
	
	<c:if test="${fn:contains(str,'JSP') }">
		String matched!!!! Happy
	</c:if>
	<br>
	
	<c:if test="${fn:endsWith(str,'Application') }">
		Yes.it's there
	</c:if>
	
	<br>
	${fn:toUpperCase(str)}
	
	

</body>
</html>