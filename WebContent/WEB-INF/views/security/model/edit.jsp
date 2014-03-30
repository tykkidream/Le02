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
				<td>姓</td>
				<td><sf:input path="firstName" /></td>
				<td><sf:errors path="firstName" /></td>
			</tr>
			<tr>
				<td>名</td>
				<td><sf:input path="lastName" /></td>
				<td><sf:errors path="lastName" /></td>
			</tr>
			<tr>
				<td>性别</td>
				<td><sf:input path="sex" /></td>
				<td><sf:errors path="sex" /></td>
			</tr>
			<tr>
				<td>电话</td>
				<td><sf:input path="telephone" /></td>
				<td><sf:errors path="telephone" /></td>
			</tr>
			<tr>
				<td>生日</td>
				<td><sf:input path="birthDate" /></td>
				<td><sf:errors path="birthDate" /></td>
			</tr>
			<tr>
				<td>籍贯</td>
				<td><sf:input path="hometown" /></td>
				<td><sf:errors path="hometown" /></td>
			</tr>
			<tr>
				<td>地址</td>
				<td><sf:input path="address" /></td>
				<td><sf:errors path="address" /></td>
			</tr>
			<tr>
				<td>免冠照</td>
				<td><input name="file" type="file" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="保存" /></td>
			</tr>
		</table>
	</sf:form>
</div>