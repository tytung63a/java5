<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style>
	.error{
		color: red;
	}
</style>
<title>Insert title here</title>
</head>
<body>
	Edit Product
	${message}
	<form:form action="${pageContext.request.contextPath}/admin/products/edit" method="POST" modelAttribute="productForm" enctype="multipart/form-data">
		<input id="id" name="id" type="hidden"/>
		<div>
			Name : <form:input path="name" />
			<span><form:errors path="name" cssClass="error"/></span>
		</div>
		<div>
			Description : <form:input path="description" />
			<span><form:errors path="description" cssClass="error"/></span>
		</div>
		<div>
			Price : <form:input type="number" path="price" />
			<span><form:errors path="price" cssClass="error"/></span>
		</div>
		
		<div>
			Image : <form:input type="file" path="image" />
			<span><form:errors path="image" cssClass="error"/></span>
		</div>
		
		<div>
			<input type="submit" value="Submit" />
		</div>
	</form:form>
</body>
</html>