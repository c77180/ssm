<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
<!-- 引入bootstrap美丽的样式 -->  
<script src="http://how2j.cn/study/js/jquery/2.0.0/jquery.min.js"></script>
<link href="http://how2j.cn/study/css/bootstrap/3.3.6/bootstrap.min.css" rel="stylesheet">
<script src="http://how2j.cn/study/js/bootstrap/3.3.6/bootstrap.min.js"></script>
    
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<div class="table table-hover" ;style="width:500px;magrin: 0px auto;text-align: center;">
<table class="table table-striped table-bordered table-hover  table-condensed" align='center' border='1' cellspacing='0'>
	<tr align='center' style='color:red' >
		<td>id</td>
		<td>name</td>
		<td>edit</td>
		<td>delete</td>
	</tr>
	<c:forEach items="${cs}" var="c" varStatus="st">
		<tr   align="center">
			<td>${c.id}</td>
			<td>${c.name}</td>
			<td><a href="editCategory?id=${c.id}">edit</a></td>
			<td><a href="deleteCategory?id=${c.id}">delete</a></td>
		</tr>
	</c:forEach>
</table>
<div style="text-align:center">
	<a href="?start=0"><button type="button" class="btn btn-warn">首页</button></a>
	<a href="?start=${page.start-page.count}"><button type="button" class="btn btn-success">上一页</button></a>
	<a href="?start=${page.start+page.count}"><button type="button" class="btn btn-success">下一页</button></a>
	<a href="?start=${page.last}"><button type="button" class="btn btn-warn">末页</button></a>
</div>

<div style="text-align:center;margin-top:40px">
	<form method="post" action="addCategory">
		分类名称:<input name="name" value="" type="text"><br><br>
		<input type="submit" value="增加分类" class="btn btn-primary" />	
	</form>
	
</div>
</div>
