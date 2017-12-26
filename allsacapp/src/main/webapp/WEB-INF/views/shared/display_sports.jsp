<ul>

	<c:forEach items="${sports }" var="sport">
		<li><a href="${contextRoot}/${sport.id }">${sport.sport_name }</a></li>

	</c:forEach>

</ul>