<%@page import="com.cjc.app.model.Product"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>success page</title>
<script type="text/javascript">
	function deleteData() {
		alert('Deleting Data');
		document.myForm.action = "delete";
		document.myForm.submit();
	}

</script>
</head>
<body>
	<h1 align="center">||.....Welcome to Success Page.....||</h1>

	<!-- Servlet tags -->
	<%
		List<Product> prodList = (List<Product>) request.getAttribute("data");
	%>


	<div align="center">

		<form name="myForm">
			<table border="2px">


				<thead>
					<tr>
						<th>Select</th>
						<th>ID</th>
						<th>Name</th>
						<th>Color</th>
						<th>Brand</th>
						<th>Price</th>
					</tr>
				</thead>

				<tbody>
					<%
						for (Product pro : prodList) {
					%>
					<tr>
						<td><input type="radio" name="pid"
							value="<%=pro.getPid()%>"></td>
						<td><%=pro.getPid()%></td>
						<td><%=pro.getName()%></td>
						<td><%=pro.getColor()%></td>
						<td><%=pro.getBrand()%></td>
						<td><%=pro.getPrice()%></td>
					</tr>
				</tbody>
				<%
					}
				%>
			</table>
			<br> <br>
			<button onclick="deleteData()">DELETE</button>
		</form>
	</div>
</body>
</html>