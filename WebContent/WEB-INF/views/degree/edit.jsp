<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles"%>
<div>
	<h2>编辑</h2>
	<form action="">
		<table>
			<tr>
				<td>ID</td>
				<td><input name="id" /></td>
			</tr>
			<tr>
				<td>编码</td>
				<td><input name="code" /></td>
			</tr>
			<tr>
				<td>名称</td>
				<td><input name="name" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="保存" /></td>
			</tr>
		</table>
	</form>
</div>