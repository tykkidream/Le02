<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles"%>
<div>
	<h3><a href="../">首页</a>&nbsp;&nbsp;<a href="./">模块管理</a>&nbsp;&nbsp;管理所有的模块</h3>
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
			<td>${item.id }&nbsp;</td>
			<td>${item.code }&nbsp;</td>
			<td>${item.name }&nbsp;</td>
			<td>${item.sex }&nbsp;</td>
			<td>${item.telephone }&nbsp;</td>
			<td><fmt:formatDate value="${item.birthDate }" var="_birthDate" type="both" />${_birthDate }&nbsp;</td>
			<td>
				<s:url var="manage_view" value="/persion/detail/${item.id }" /><a href="${manage_view }">查看</a>
				<s:url var="manage_view" value="/persion/detail/${item.id }?_method=post" /><a href="${manage_view }">修改</a>
			</td>
		</tr>
		</c:forEach>
		</tbody>
		<tr>
			<td colspan="7">&nbsp;</td>
		</tr>
	</table>
</div>