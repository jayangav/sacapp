<div class="bgded overlay"
		style="background-image:url('${images}/timthumb.png');">
		<!-- ################################################################################################ -->
		<div class="wrapper row1">
			<header id="header" class="hoc clear">
				<!-- ################################################################################################ -->
				<div id="logo" class="fl_left">
					<h1>
						<a href="${contextRoot}/content1">St.Aloysius college Galle</a>
					</h1>
				</div>
				<nav id="mainav" class="fl_right">
					<ul class="clear">
						<li><a href="${contextRoot}/content1">About</a></li>
						<li class="active"><a class="drop" href="#">Admissions</a>
							<ul>
								<li><a href="${contextRoot}/gallery">Grade 1</a></li>
								<li><a href="${contextRoot}/page1">Grade 6</a></li>
								<li><a href="${contextRoot}/page2">Grade 12</a></li>
								<li><a href="${contextRoot}/page3">Other</a></li>
								
							</ul></li>
						
						<li class="active"><a class="drop" href="#">Sports</a>
							<%-- <ul>
								<li><a href="${contextRoot}/gallery">Cricket</a></li>
								<li><a href="${contextRoot}/page1">Football</a></li>
								<li><a href="${contextRoot}/page2">Rugby</a></li>
								<li><a href="${contextRoot}/page3">Hockey</a></li>
								<li><a href="${contextRoot}/page3">Basketball</a></li>
								<li><a href="${contextRoot}/page3">Swimming</a></li>
								<li><a href="${contextRoot}/page3">Other</a></li>
								
							</ul> --%>
						<%@include file="display_sports.jsp"%>
						
						
						 </li>
						
						
						
						<li><a class="drop" href="${contextRoot}/viewproducts">Shop Products</a>
						<!-- displaying products -->
						<%@include file="display_products.jsp"%>
						
						</li>
						
						<li><a href="#">Login</a></li>
					</ul>
				</nav>
				<!-- ################################################################################################ -->
			</header>
		</div>
		<!-- ################################################################################################ -->
	</div>
	<!-- End Top Background Image Wrapper -->
	<!-- ################################################################################################ -->
	<!-- ################################################################################################ -->
	<!-- ################################################################################################ -->