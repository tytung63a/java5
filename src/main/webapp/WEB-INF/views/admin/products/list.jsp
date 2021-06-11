<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body> 
	<p>${message}</p>
	List Page for ADMIN
	<a href="${pageContext.request.contextPath}/admin/products/create">Create Product</a>
  <table class="table">
    <thead>
      <tr>
        <th>Id</th>
        <th>name</th>
        <th>price</th>
        <th>quantity</th>
        <th>image</th>
        <th>avaiable</th>
        <th>category_id</th>
        <th>create_date</th>
        <th>Action</th>
      </tr>
    </thead>
    <tbody>
    	<c:forEach var="product" items="${list}">
	      <tr>
	        <td>${product.id}</td>
			<td>${product.name}</td>
			<td>${product.price}</td>
			<td>${product.quantity}</td>
			<td>${product.image}</td>
			<td>${product.avaiable}</td>
			<td>${product.category.name}</td>
			<td>${product.createDate}</td>
			<td>
				<a href="${pageContext.request.contextPath}/admin/products/edit/${product.id}" class="btn btn-info" >Edit</a>
				<a href="${pageContext.request.contextPath}/admin/products/delete/${product.id}" class="btn btn-danger" onclick="confirmDelete();">Delete</a>
			</td>
	      </tr>
	     </c:forEach>
    </tbody>
    
  </table>
  
  <script>
  		
  	function confirmDelete() {
  		alert("Bạn có muốn xóa không");
  	}
  	
  	$(function() {
  		$('.btn-danger').on('click', confirmDelete());
  	});
  </script>
  
</body>
</html>