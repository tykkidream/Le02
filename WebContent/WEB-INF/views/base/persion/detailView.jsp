<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles"%>
<div>
	<h2>${data.name }的详细信息</h2>
	<table border="1" width="100%">
		<tr>
			<td>ID</td>
			<td>${data.id }&nbsp;</td>
		</tr>
		<tr>
			<td>编码</td>
			<td>${data.code }&nbsp;</td>
		</tr>
		<tr>
			<td>姓名</td>
			<td>${data.name }&nbsp;</td>
		</tr>
		<tr>
			<td>性别</td>
			<td>${data.sex }&nbsp;</td>
		</tr>
		<tr>
			<td>电话</td>
			<td>${data.telephone }&nbsp;</td>
		</tr>
		<tr>
			<td>生日</td>
			<td><fmt:formatDate value="${data.birthDate }" var="_birthDate" type="both" />${_birthDate }&nbsp;</td>
		</tr>
		<tr>
			<td>籍贯</td>
			<td>${data.hometown }&nbsp;</td>
		</tr>
		<tr>
			<td>地址</td>
			<td>${data.address }&nbsp;</td>
		</tr>
		<tr>
			<td>免冠照</td>
			<td><c:if test="${data.hatPhoto != null }"><img src="/Le02/${data.hatPhoto }" /></c:if>&nbsp;</td>
		</tr>
		<tr>
			<td colspan="2"><a href="../manage">返回</a></td>
		</tr>
	</table>
</div>