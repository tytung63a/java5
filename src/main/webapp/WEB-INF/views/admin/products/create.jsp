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

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
<!-- Font Awesome -->
<link
  href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/css/all.min.css"
  rel="stylesheet"
/>
<!-- Google Fonts -->
<link
  href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700&display=swap"
  rel="stylesheet"
/>
<!-- MDB -->
<link
  href="https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/3.3.0/mdb.min.css"
  rel="stylesheet"
/>
<!-- MDB -->
<script
  type="text/javascript"
  src="https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/3.3.0/mdb.min.js"
></script>

<title>Insert title here</title>
</head>
<body>

	<br><br>
	<div class="row">
            <div class="col-12">
                <div class="col-6 offset-3">
                	Create Product
					${message}
                    <form:form method="post" action="create" modelAttribute="productForm">        <!-- Ánh xạ với phương thức get -->          
                     	<div class="mt-3"><label  class="form-label">Name</label> <form:input class="form-control" path="name" /></div>                       
						<span><form:errors path="name" cssClass="error"/></span>
						
						<div class="mt-3"><label  class="form-label">Description</label> <form:input class="form-control"  path="description" /></div>
                      	<span><form:errors path="description" cssClass="error"/></span>
                      	
                      	<div class="mt-3"><label  class="form-label">Price</label> <form:input type="number" class="form-control" path="price" /></div>     
                      	<span><form:errors path="price" cssClass="error"/></span>

                        <div class="mt-3">
                            <button type="submit" class="btn btn-primary mb-3">
                                Submit
                            </button>
                        </div>
                    </form:form>
                </div>
            </div>
        </div>
</body>
</html>