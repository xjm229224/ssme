<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@ include file="../common/common.jsp"%>

<script src="<%=path %>/resource/js/user/login.js"></script>
<link rel="stylesheet" href="<%=path %>resource/css/user/login.css" />
<title>用户登录</title>
</head>
<body style="margin: 0 auto; padding: 0px;">
	<form method="post" id="login_form">
		<div id="login_div">
			<table id="login_table">
				<tr>
					<th><span>用户名:</span></th>
					<td><input type="text" placeholder="请输入用户名"
						id="login_username" name="username" missingMessage="用户名不能为空" /></td>
				</tr>
				<tr>
					<th><span>密&nbsp;码:</span></th>
					<td><input type="password" placeholder="请输入密码"
						id="login_password" name="password" missingMessage="密码不能为空" /></td>
				</tr>
				<tr>
					<th><span>验证码:</span></th>
					<td><input type="text" id="login_code" maxlength="4"
						placeholder="验证码" name="code" missingMessage="验证码不能为空" /></td>
					<td><img src="<%=path %>/user/getcode"></td>
				</tr>
			</table>
			<div id="login_btn">
				<a id="submit_btn" onclick="login()"></a> <a id="registered_btn"
					onclick="reset()"></a>
			</div>
		</div>
	</form>
</body>
</html>