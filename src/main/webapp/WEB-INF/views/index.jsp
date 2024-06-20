<%@ include file="./base.jsp"%>
<%@ page isELIgnored="false"%>
<html>
<body>
	<div class="Container mt-3">
		<div class="row">
			<div class="col-md-12">
				<h1 class="text-center">Welcome to Product App</h1>

				<table class="table">
					<thead class="thead-dark">
						<tr>
							<th scope="col">ID</th>
							<th scope="col">Name</th>
							<th scope="col">Description</th>
							<th scope="col">Price</th>
							<th scope="col">Action</th>
						</tr>
					</thead>
					<tbody>
					<c:forEach items="${products }" var="p">
						<tr>
							<th scope="row">${p.id }</th>
							<td>${p.name }</td>
							<td>${p.description }</td>
							<td>${p.price }</td>
							<td>
								<a href="delete-product/${p.id }"><i style="font-size: 30px;" class="fa-solid fa-trash text-danger mr-2"></i></a>
								<a href="update/${p.id }"><i style="font-size: 30px;" class="fa-solid fa-pen-nib text-primary ml-3"></i></a>
							</td>
						</tr>
					</c:forEach>
					</tbody>
				</table>
			</div>
			<div class="container mt-3 text-center">
				<a class="btn btn-outline-success" href="add-product">Add-Product</a>
			</div>
		</div>
	</div>
</body>
</html>
