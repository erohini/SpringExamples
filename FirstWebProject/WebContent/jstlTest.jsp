<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>

<%-- 
<c:set var="a" value="200"></c:set>
<c:if test="${a>150}">
	a value is greater than 150
</c:if> 
--%>
<%-- <c:forEach items="${itemsList}" var="n">
	ItemId: ${n.id}
	ItemIName: ${n.name}
	ItemPrice: ${n.price}<br>
	
</c:forEach> --%>


<%-- <c:set var="a" value="15"></c:set>

<c:choose>
	<c:when test="${a==5}">
		a value is 5...
	</c:when>

	<c:when test="${a==10}">
		a value is 10...
	</c:when>
	
	<c:when test="${a==15}">
		a value is 15...
	</c:when>
	<c:when test="${a==20}">
		a value is 20...
	</c:when>
	<c:otherwise>
	Default....
	</c:otherwise>
	
	
</c:choose>
--%>


<%-- <c:set var="msg" value="Hello good morning"></c:set>

${fn:toUpperCase(msg)} --%>



<%-- <jsp:useBean id="today" class="java.util.Date" scope="request"></jsp:useBean>

<fmt:formatDate value="${today}" pattern="dd/MM/yyyy hh:mm:ss"/> --%>


<sql:setDataSource var="mysqlDS"
					driver="oracle.jdbc.OracleDriver"
					url="jdbc:oracle:thin:@localhost:1522:orcl"
					user="hr"
					password="hr"/>
					
<sql:query var="records" dataSource="${mysqlDS}">
	select * from products;
</sql:query>

<c:forEach items="${records.rows}" var="row">
	ProductId: ${row.product_id}
	ProductName: ${row.product_name}<br>
</c:forEach>



