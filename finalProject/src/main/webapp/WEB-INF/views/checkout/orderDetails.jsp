  <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>訂單明細</title>
<style>
div {
	width: 400px;
	margin: 50px auto;
	text-align: center;
}
table{
border-collapse: collapse;
}
td{
width:100px;
border: 1px solid black;
}
th{
border: 1px solid black;
}
</style>
</head>
<body>
<div>
<table>
<tr><th>訂單編號</th><th>訂單金額</th></tr>
<c:forEach varStatus="vs" var="orderBean" items="${orderList}">
<tr><td><a href="<c:url value='/showOrderItem/${orderBean.oId}'/>">${orderBean.oId}</a></td><td>${orderBean.oTotalAmount}</td></tr>
</c:forEach>
</table>
</div>
</body>
</html>