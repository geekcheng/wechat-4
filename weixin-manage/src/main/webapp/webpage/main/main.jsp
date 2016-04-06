<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>微信后台管理系统-wechatManageSystem</title>
</head>
<body class="easyui-layout" style="overflow-y: hidden" scroll="no">
	<!-- 顶部-->
	<div region="north" border="false" title="微信后台管理系统"
		style="background: #E6E6FA; height: 85px; padding: 1px; overflow: hidden;">
	</div>

	<!-- 左侧-->
	<div region="west" split="true" href="#" title="导航菜单"
		style="width: 150px; padding: 1px;"></div>

	<!-- 中间-->
	<div id="mainPanle" region="center" style="overflow: hidden;"></div>

	<!-- 右侧 -->
	<div collapsed="true" region="east" iconCls="icon-reload" title="辅助工具"
		split="true" style="width: 190px;"></div>

	<!-- 底部 -->
	<div region="south" border="false"
		style="height: 25px; overflow: hidden;">
		<div align="center" style="color: #CC99FF; padding-top: 2px">
			&copy; 版权所有 <span class="tip">(推荐谷歌浏览器，获得更快响应速度) </span>
		</div>
	</div>

	<!-- 右键菜单 -->
	<div id="mm" class="easyui-menu" style="width: 150px;">
		<div id="mm-tabclose">关闭</div>
		<div id="mm-tabcloseall">全部关闭</div>
		<div id="mm-tabcloseother">除此之外全部关闭</div>
		<div class="menu-sep"></div>
		<div id="mm-tabcloseright">当前页右侧全部关闭</div>
		<div id="mm-tabcloseleft">当前页左侧全部关闭</div>
	</div>
</body>
</html>