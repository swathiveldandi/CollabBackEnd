<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>

<!DOCTYPE html>
<html lang="en-US" data-ng-app="Myapp">
<head>

<%@include file="/WEB-INF/includes/Frameworks.jsp"%>
<script
	src="${pageContext.request.contextPath}/resources/js/AngularControllers/App.js"></script>
<title>CRAFTCLAN</title>
</head>
<body  style="padding-top: 50px; margin-bottom: 75px;background-image:url('resources/images/1.jpg')">
	<header><%@include file="/WEB-INF/includes/Header.jsp"%></header>
	
	 <div class="container" style="background:lavender">
	<div style="padding-top: 25px">
		<c:choose>
			<c:when test="${BlogClicked}">
				<div class="container">
					<c:import url="/WEB-INF/jsp/Blog.jsp">
					</c:import>
				</div>
			</c:when>
			<c:when test="${IndividualBlog}">
				<div class="container">
					<c:import url="/WEB-INF/jsp/IndividualBlog.jsp">
					</c:import>
				</div>
			</c:when>
			<c:when test="${ForumClicked}">
				<div class="container">
					<c:import url="/WEB-INF/jsp/Forum.jsp">
					</c:import>
				</div>
			</c:when>
			<c:when test="${IndividualForum}">
				<div class="container">
					<c:import url="/WEB-INF/jsp/IndividualForum.jsp">
					</c:import>
				</div>
			</c:when>
			<c:when test="${ChatClicked}">
				<div class="container">
					<c:import url="/WEB-INF/jsp/Chat.jsp">
					</c:import>
				</div>
			</c:when>
		<c:when test="${HomeClicked}">
				<div class="container">
					<c:import url="/WEB-INF/jsp/Home.jsp">
					</c:import>
				</div>
			</c:when>
 	<c:otherwise>
			<sec:authorize access="hasRole('ROLE_USER')">
				<div class="container">
					<c:import url="/WEB-INF/jsp/Body.jsp">
					</c:import>
				</div>
			</sec:authorize>
			</c:otherwise> 
 	
 </c:choose>
	</div></div>
	


	<Footer><%@include file="/WEB-INF/includes/Foot.jsp"%></Footer>

	<script type="text/javascript">
		$(document).ready(function() {
			if (window.location.href.indexOf('#login') != -1) {
				$('#login').modal('show');
			}
		});
	</script>


</body>
</html>
 --%>