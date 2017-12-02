
<ul>

	<c:forEach items="${products }" var="product">
		<li><a href="${contextRoot}/${product.id }">${product.product_name }</a></li>

	</c:forEach>

</ul>