$(function() {
	$("#login_form").dialog({
		title: '用户登录',
		closable: false,
		modal: true,
		draggable: false,
	});

	$("#submit_btn").linkbutton({
		toggle: true,
		text: "登录",
		iconCls: "icon-add",
	});

	$("#registered_btn").linkbutton({
		toggle: true,
		text: "重置",
		iconCls: "icon-reload",
	});
});

function login() {
	var username = $("#login_username").val();
	var password = $("#login_password").val();
	var code = $("#login_code").val();
	var urdata;
	$('#login_username').validatebox({
		required: true,
	});
	urdata = urdata + "&username="+username;
	$('#login_password').validatebox({
		required: true,
	});
	urdata = urdata + "&password="+password;
	$("#login_code").validatebox({
		required: true,
	});
	urdata = urdata + "&code="+code;
	
	alert(urdata);
	$.ajax({
		type:"post",
		url:"/user/login?1=1",
		data:"urdata",
		success:function(){
			
		}
	});
}

function reset(){
	$("#login_username").val('');
	$("#login_password").val('');
	$("#login_code").val('');
}
