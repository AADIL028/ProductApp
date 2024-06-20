<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<%@ include file="./base.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
</head>
<body>

	<div class="container mt-3">
		<form action="add-process" method="post">
			<h1 class="text-center">Insert Product Detail</h1>
			<div class="form-group mt-3">
				<label for="exampleFormControlInput1">Product Name</label> <input
					type="text" class="form-control" id="exampleFormControlInput1"
					name="name">
			</div>
			<div class="form-group">
				<label for="exampleFormControlTextarea1">Product Description</label>
				<textarea class="form-control" id="exampleFormControlTextarea1"
					rows="3" name="description"></textarea>
			</div>
			<div class="form-group">
				<label for="exampleFormControlInput2">Product Prize</label> <input
					type="text" class="form-control" id="exampleFormControlInput2"
					name="price">
			</div>
			<div class="container text-center mt-3">
				<a href="${pageContext.request.servletContext.contextPath }/" class="btn btn-outline-secondary">Back</a>
				<button class="btn btn-outline-success m-3" type="submit">Add</button>
			</div>
		</form>
	</div>

</body>
</html>