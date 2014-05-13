<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles"%>
<div>
	<h3><a href="/Le02">首页</a>&nbsp;&nbsp;<a href="/Le02/base/degree/">学位管理</a>&nbsp;&nbsp;${data.name }</h3>
	<h4>${data.name }的详细信息</h4>
	<table border="1">
		<tr>
			<td>ID</td>
			<td>${data.id }</td>
		</tr>
		<tr>
			<td>编码</td>
			<td>${data.code }</td>
		</tr>
		<tr>
			<td>名称</td>
			<td>${data.name }</td>
		</tr>
		<tr>
			<td colspan="2"><a href="../browse">返回</a></td>
		</tr>
	</table>
</div>