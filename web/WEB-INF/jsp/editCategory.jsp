
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.*" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<div style="width:500px;margin:0px auto;text-align:center">
 
<div style="text-align:center;margin:40px">
	<form method="post" action="updateCategory">
	分类名称：<input type="text" name="name" value="${c.name }" /><br><br>
	<input type="hidden" name="id" value="${c.id}"  />
	<input type="submit" value="增加分类">
	</form>
</div>

</div>