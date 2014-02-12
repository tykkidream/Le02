<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles"%>
<div>
	<h3><a href="../">首页</a>&nbsp;&nbsp;<a href="./">人员管理</a>&nbsp;&nbsp;浏览所有的人员</h3>
	<table border="1" width="100%">
		<tr>
			<th>ID</th>
			<th>Code</th>
			<th>Name</th>
			<th>Sex</th>
			<th>Telephone</th>
			<th>BirthDate</th>
			<th>Manager</th>
		</tr>
		<tbody>
		<c:forEach var="item" items="${page.result }">
		<tr>
			<td><c:out value="${item.id }" /></td>
			<td><c:out value="${item.code }" /></td>
			<td><c:out value="${item.name }" /></td>
			<td><c:out value="${item.sex }" /></td>
			<td><c:out value="${item.telephone }" /></td>
			<td><c:out value="${item.birthDate }" /></td>
			<td><s:url var="manage_view" value="/persion/${item.id }" /><a href="${manage_view }">查看</a></td>
		</tr>
		</c:forEach>
		</tbody>
		<tr>
			<td colspan="4">&nbsp;</td>
		</tr>
	</table>
</div>