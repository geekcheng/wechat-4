<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
</head>
<body>
	<script type="text/javascript">
		// 菜单权限拦截器
		var _sun_selectedTab = $('#maintabs').tabs('getSelected');
		var _sun_selectedTab_title = _sun_selectedTab.panel('options').title;
		$.dialog.alert("提醒：用户权限不足，请联系管理员!");
		$('#maintabs').tabs('close', _sun_selectedTab_title);
	</script>
</body>
</html>