<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles"%>
<div>
	<h2>${model.name }的详细信息</h2>
	<table border="1" width="100%">
		<tr>
			<td>ID</td>
			<td>${model.id }&nbsp;</td>
		</tr>
		<tr>
			<td>编码</td>
			<td>${model.code }&nbsp;</td>
		</tr>
		<tr>
			<td>姓名</td>
			<td>${model.name }&nbsp;</td>
		</tr>
		<tr>
			<td>性别</td>
			<td>${model.sex }&nbsp;</td>
		</tr>
		<tr>
			<td>电话</td>
			<td>${model.telephone }&nbsp;</td>
		</tr>
		<tr>
			<td>生日</td>
			<td><fmt:formatDate value="${model.birthDate }" var="_birthDate" type="both" />${_birthDate }&nbsp;</td>
		</tr>
		<tr>
			<td>籍贯</td>
			<td>${model.hometown }&nbsp;</td>
		</tr>
		<tr>
			<td>地址</td>
			<td>${model.address }&nbsp;</td>
		</tr>
		<tr>
			<td>免冠照</td>
			<td><c:if test="${model.hatPhoto != null }"><img src="/Le02/${model.hatPhoto }" /></c:if>&nbsp;</td>
		</tr>
		<tr>
			<td colspan="2"><a href="grid">返回</a></td>
		</tr>
	</table>
</div>