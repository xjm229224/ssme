<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path;
%>
<script type="text/javascript">
	var path = '${pageContext.request.contextPath }';
</script>


<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resource/jquery-easyui-1.5/themes/default/easyui.css" />
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resource/jquery-easyui-1.5/themes/icon.css" />

<script src="${pageContext.request.contextPath}/resource/jquery-easyui-1.5/jquery.easyui.min.js"
	type="text/javascript" charset="utf-8"></script>
<script src="${pageContext.request.contextPath}/resource/jquery-easyui-1.5/jquery.easyui.min.js"
	type="text/javascript" charset="utf-8"></script>
<script src="${pageContext.request.contextPath}/resource/jquery-easyui-1.5/locale/easyui-lang-zh_CN.js"
	type="text/javascript" charset="utf-8"></script>




