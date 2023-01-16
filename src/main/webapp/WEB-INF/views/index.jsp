<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!--
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
-->
<html xmlns:th="http://www.thymeleaf.org">

<head>
	<%@ include file="layout/header.jsp"%>
</head>

<div class="container">
	<c:forEach var="board" items="${boards.content}">
	<div class="card m-2" >
		<div class="card-body">
			<h4 class="card-title">${board.title}</h4>
			<a href="/board/${board.id}" class="btn btn-primary">상세 보기</a>
		</div>
	</div>
	</c:forEach>


<div class="container">

	<div class="card m-2" >
		<div class="card-body">
			<h4 class="card-title">제목 적는 부분 1</h4>
			<p class="card-text>내용 적는 부분</p>
			<a href="#" class="btn btn-primary">상세 보기</a>
		</div>
	</div>

	<div class="card m-2" >
		<div class="card-body">
			<h4 class="card-title">제목 적는 부분 2</h4>
			<p class="card-text>내용 적는 부분</p>
			<a href="#" class="btn btn-primary">상세 보기</a>
		</div>
	</div>


</div>



<%@ include file="layout/footer.jsp"%>
</html>
