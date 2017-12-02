<dev class="wrapper row3"> <dev class="row"> <dev
	class="col-md-3">

<nav id="mainnav">


	<%@include file="./shared/display_products.jsp"%>


</nav>




</dev> <dev class="col-md-9">
<div class="row">

	<div class="col-lg-12">
		<c:if test="${userClickviewproducts == true }">


			<ol class="breadcrumb">
				<li><a href="${contextRoot}/home">Home</a></li>
				<li><a href="${contextRoot}/viewproducts"> /all products</a></li>
			</ol>
		</c:if>
		
		<c:if test="${userClickviewspecproducts == true }">


			<ol class="breadcrumb">
				<li><a href="${contextRoot}/home">Home</a></li>
				<li><a href="active"> /products/</a></li>
				<li><a href="active"> ${product.product_name}</a></li>
			</ol>
		</c:if>
		
		
	</div>

</div>

</dev> </dev>