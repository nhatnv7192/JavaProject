<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
	table,th,td
	{
		border: 1px solid black;
		border-collapse: collapse;
	}
</style>
</head>
<body>
	<h1>Hello world</h1>
	
	<a href='<c:url value="admin.html"></c:url>'>Link Admin</a>
	<h2>In ra mang Category </h2>
	<table>
		<c:forEach var="category" items="${listCategory}">
			<tr>
			<td>${category.categoryId}</td>
			<td>${category.name}</td>
			<td>${category.status}</td>
			</tr>
		</c:forEach>
	</table>
	
	<h2>In ra mang OrderDetail </h2>
	<table>
		<c:forEach var="orderDetail" items="${listOrderDetail}">
			<tr>
				<td>${orderDetail.orderDetailsId}</td>
				<td>${orderDetail.orderId}</td>
				<td>${orderDetail.productId}</td>
				<td>${orderDetail.quantity}</td>
				<td>${orderDetail.price}</td>
				<td>${orderDetail.discount}</td>
				<td>${orderDetail.notes}</td>
			</tr>
		</c:forEach>
	</table>
	
	<h2>In ra mang OrderProduct </h2>
	<table>
		<c:forEach var="orderProduct" items="${listOrderProduct}">
			<tr>
				<td>${orderProduct.orderId}</td>
				<td>${orderProduct.orderCode}</td>
				<td>${orderProduct.orderDate}</td>
				<td>${orderProduct.shippingCost}</td>
				<td>${orderProduct.contactName}</td>
				<td>${orderProduct.contactPhone}</td>
				<td>${orderProduct.contactEmail}</td>
				<td>${orderProduct.description}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>