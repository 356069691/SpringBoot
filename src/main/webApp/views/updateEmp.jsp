<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>update Emp</title>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="stylesheet" type="text/css"
			href="css/style.css" />
	</head>

	<body>
		<div id="wrap">
			<div id="top_content">
					<div id="header">
						<div id="rightheader">
							<p>
								2009/11/20
								<br />
							</p>
						</div>
						<div id="topheader">
							<h1 id="title">
								<a href="#">Main</a>
							</h1>
						</div>
						<div id="navigation">
						</div>
					</div>
				<div id="content">
					<p id="whereami">
					</p>
					<h1>
						update Emp info:
					</h1>
					<form action="${pageContext.request.contextPath}/product/update" method="post">
						ID:<input value="${requestScope.product.id}" type="text" name="id"/><br/>
						Name:<input value="${requestScope.product.productname}" type="text" name="productname"/><br/>
						Salary:<input value="${requestScope.product.productsalary}" type="text" name="productsalary"/><br/>
						Date:<input value="${requestScope.product.productdate}" type="text" name="productdate"/><br/>
						Addr:<input value="${requestScope.product.productaddr}" type="text" name="productaddr"/><br/>
						<input type="submit" class="button" value="修改" />
					</form>
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
