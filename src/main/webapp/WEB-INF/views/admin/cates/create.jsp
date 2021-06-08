<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="formCate"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<formCate:form action="create" method="POST" modelAttribute="cateForm">
	
		<div>
			Name : <formCate:input path="ten" />
		</div>
		
		<div>
			So : <formCate:input type="number" path="so" />
		</div>
		
		<div>
		
			<input type="submit" value="Submit"/>
			
		</div>
	</formCate:form>

</body>
</html>