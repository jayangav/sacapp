<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<spring:url var="css" value="/resources/css/"></spring:url>
<spring:url var="js" value="/resources/js/"></spring:url>
<spring:url var="images" value="/resources/images/"></spring:url>

<c:set var="contextRoot" value="${pageContext.request.contextPath}" />

<!DOCTYPE html>
<!--
Template Name: Merciano
Author: <a href="http://www.os-templates.com/">OS Templates</a>
Author URI: http://www.os-templates.com/
Licence: Free to use under our free template licence terms
Licence URI: http://www.os-templates.com/template-terms
-->
<html>
<head>
<title>sac ${title}</title>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
<link href="${css}/layout.css" rel="stylesheet" type="text/css"
	media="all">
<style type="text/css">
/* DEMO ONLY */
.container .demo {
	text-align: center;
}

.container .demo div {
	padding: 8px 0;
}

.container .demo div:nth-child(odd) {
	color: #FFFFFF;
	background: #CCCCCC;
}

.container .demo div:nth-child(even) {
	color: #FFFFFF;
	background: #979797;
}

@media screen and (max-width:900px) {
	.container .demo div {
		margin-bottom: 0;
	}
}
/* DEMO ONLY */
</style>
</head>
<body id="top">
	<!-- ################################################################################################ -->
	<!-- ################################################################################################ -->
	<!-- ################################################################################################ -->
	<!-- Top Background Image Wrapper -->
	
	<!-- header 1 -->
	<%@include file="./shared/header1.jsp"%>
	
	
	<!-- header 2 -->
	<%@include file="./shared/header2.jsp"%>
	
	<!-- content1  -->
	
	 <c:if test="${userClickHome == true }">
	<%@include file="content1.jsp"%>
	</c:if>
	
	<c:if test="${userClickcontent1 == true }">
	<%@include file="content1.jsp"%>
	</c:if>
	
	
	
	<c:if test="${userClickgallery == true }">
	<%@include file="gallery.jsp"%>
	</c:if>
	
	<!-- footer -->
	<%@include file="./shared/footer1.jsp"%>
	
	
	<!-- bottom -->
	<%@include file="./shared/bottom.jsp"%>
	
	<!-- JAVASCRIPTS -->
	<script src="${js}/jquery.min.js"></script>
	<script src="${js}/jquery.backtotop.js"></script>
	<script src="${js}/jquery.mobilemenu.js"></script>
</body>
</html>