<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.Date" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>emplist</title>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link rel="stylesheet" type="text/css" href="css/style.css" />
</head>
	<body>
		<div id="wrap">
			<div id="top_content"> 
				<div id="header">
					<div id="rightheader">
						<p>
							<%=new Date()%>
							<br/>
						</p>
					</div>
					<div id="topheader">
						<h1 id="title">
							<a href="${pageContext.request.contextPath}/product/findAll">main</a>
						</h1>
					</div>
					<div id="navigation">
					</div>
				</div>
				<div id="content">
					<p id="whereami">
					</p>
					<h1>
						Welcome!:${sessionScope.admin.username}
					</h1>
					<table class="table">
						<tr class="table_header">
							<td>ID</td>
							<td>Name</td>
							<td>Salary</td>
							<td>DATE</td>
							<td>Addr</td>
							<td>其他操作</td>
						</tr>
						<c:forEach items="${requestScope.list}" var="s">
						<tr>
							<td>${s.id}</td>
							<td>${s.productname}</td>
							<td>${s.productsalary}</td>
							<td><fmt:formatDate value="${s.productdate}" pattern="yyyy-MM-dd"/></td>
							<td>${s.productaddr}</td>
							<td><a href="${pageContext.request.contextPath}/product/delete?id=${s.id}">delete</a>&nbsp;<a href="${pageContext.request.contextPath}/product//selectOne?id=${s.id}">update</a></td>
						</tr>
						</c:forEach>
					</table>
					<p>
						<a href="${pageContext.request.contextPath}/views/addEmp.jsp">添加</a>
					</p>
				</div>
			</div>
			<div id="footer">
				<div id="footer_bg">
				ABC@126.com
				</div>
			</div>
		</div>
	</body>
</html>
