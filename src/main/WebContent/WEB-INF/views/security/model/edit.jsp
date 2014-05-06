<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles"%>
<div>
	<h3><a href="../">首页</a>&nbsp;&nbsp;<a href="./">模块管理</a>&nbsp;&nbsp;编辑模块</h3>
	<sf:form  method="POST" modelAttribute="data" enctype="multipart/form-data">
		<table border="1">
			<tr>
				<td>ID&nbsp;</td>
				<td><sf:input path="id" />&nbsp;</td>
				<td><sf:errors path="id" />&nbsp;</td>
			</tr>
			<tr>
				<td>名称&nbsp;</td>
				<td><sf:input path="name" />&nbsp;</td>
				<td><sf:errors path="name" />&nbsp;</td>
			</tr>
			<tr>
				<td>表名&nbsp;</td>
				<td><sf:input path="tableName" />&nbsp;</td>
				<td><sf:errors path="tableName" />&nbsp;</td>
			</tr>
			<tr>
				<td colspan="3"><input type="submit" value="保存" /></td>
			</tr>
		</table>
	</sf:form>
</div>