<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles"%>
<div>
	<h2>${degree.name }的详细信息</h2>
	<table border="1" width="100%">
		<tr>
			<td>ID</td>
			<td>${degree.id }</td>
		</tr>
		<tr>
			<td>编码</td>
			<td>${degree.code }</td>
		</tr>
		<tr>
			<td>名称</td>
			<td>${degree.name }</td>
		</tr>
		<tr>
			<td colspan="2"><a href="grid">返回</a></td>
		</tr>
	</table>
</div>