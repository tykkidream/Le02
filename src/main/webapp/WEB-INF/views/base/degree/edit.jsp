<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles"%>
<div>
	<h3><a href="../">首页</a>&nbsp;&nbsp;<a href="./">学位管理</a>&nbsp;&nbsp;编辑学位</h3>
	<sf:form action="save" method="POST" modelAttribute="degree">
		<table>
			<tr>
				<td>ID</td>
				<td><sf:input path="id" /></td>
				<td><sf:errors path="id" /></td>
			</tr>
			<tr>
				<td>编码</td>
				<td><sf:input path="code" /></td>
				<td><sf:errors path="code" /></td>
			</tr>
			<tr>
				<td>名称</td>
				<td><sf:input path="name" /></td>
				<td><sf:errors path="name" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="保存" /></td>
			</tr>
		</table>
	</sf:form>
</div>