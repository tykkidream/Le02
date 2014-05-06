<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>

<div>
	<sf:form >
		<h1>Login</h1>
		<h4>Username</h4>
		<p>
			<input type="text" name="username"  value="${username}"/>
		</p>
		<h4>Password</h4>
		<p>
			<input type="password" name="password"/>
		</p>
		<p>
			<input type="submit" value="Login" />
		</p>
	</sf:form>
</div>