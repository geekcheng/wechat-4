<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../../context/common.jsp"%>
<%@ include file="../../context/easyUI.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>${_currProject }</title>
<link rel="stylesheet" href="${_currConText }/static/main/css/global.css" type="text/css"/>
<link rel="stylesheet" href="${_currConText }/static/main/css/index.css" type="text/css"/>
<link rel="stylesheet" href="${_currConText }/static/main/css/lanrenzhijia.css" type="text/css"/>
<script src="${_currConText }/static/main/js/cfcoda.js" language="javascript"></script>
<script src="${_currConText }/static/main/js/time.js" language="javascript"></script>
<script src="${_currConText }/static/main/js/leftMenu.js" language="javascript"></script>
<!--[if lt IE 7]>       
 <script src="${_currConText }/static/main/js/fixPNG.js"></script>         
 <script>
 DD_belatedPNG.fix('img,.nav ul li a,.nav ul li a:hover');
 </script>     
<![endif]-->
</head>
<body class="easyui-layout" style="overflow-y: hidden" scroll="no">
	<!-- 顶部 -->
	<div class="header" region="north" border="true" style="height: 70px; padding: 1px; overflow: hidden;">
		<div class="logo fleft">
			<img src="${_currConText }/static/main/images/logo.png" width="344"
				height="49" />
		</div>
		<div class="header_right">
			<ul>
				<li><a href="javascript:void(0)" title="首页" id="home"></a></li>
 				<li><a href="javascript:void(0)" title="更换皮肤" id="theme"></a></li>
				<li><a href="javascript:void(0)" title="设置" id="Setup"></a></li>
				<li><a href="javascript:void(0)" title="刷新" id="refresh"></a></li>
				<li><a href="javascript:void(0)" title="注销登录" id="logout"></a></li>
			</ul>
		</div>
	</div>

	<!-- 左侧-->
	<div region="west" style="width: 230px;background: none repeat scroll 0 0 #efefef;"
		data-options="title:'菜单导航栏',split:false,iconCls:'ext-icon-standard-map'">
		<div id="navTabs_tools" class="tabs-tool">
			<table>
				<tr>
					<td>
						<a id="navMenu_refresh" title="刷新该选项卡及其导航菜单"
							class="easyui-linkbutton easyui-tooltip"
							data-options="plain: true, iconCls: 'icon-reload'"></a>
					</td>
				</tr>
			</table>
		</div>
		<div class="easyui-tabs" id="navTabs"
			data-options="fit: true, border: true, tools: '#navTabs_tools'">
			<div title="菜单导航" iconCls="ext-icon-application-view-title"
				refreshable="false" selected="true">
				<div id="westLayout" class="easyui-layout" data-options="fit: true">
					<div data-options="region: 'north', split: false, border: false"
						style="height: 30px; padding-left: 5px;">
						<div class="easyui-toolbar"
							style="background: none repeat scroll 0 0 #efefef;">
							<a id="navMenu_expand" class="easyui-splitbutton"
									menu="#navMenu_toggleMenu"
									data-options="iconCls: 'ext-icon-metro-expand2'">展开</a>
								<a id="navMenu_Favo" class="easyui-linkbutton"
									data-options="plain: true, iconCls: 'ext-icon-standard-feed-add'">
									收藏
								</a>
								<div id="navMenu_toggleMenu" class="easyui-menu"
									style="width: 120px;">
									<div id="navMenu_collapse"
										data-options="iconCls: 'icon-metro-contract2'">
										折叠当前
									</div>
									<div class="menu-sep"></div>
									<div id="navMenu_expandCurrentAll"
										data-options="iconCls: 'icon-metro-expand'">
										展开当前所有
									</div>
									<div id="navMenu_collapseCurrentAll"
										data-options="iconCls: 'icon-metro-contract'">
										折叠当前所有
									</div>
									<div class="menu-sep"></div>
									<div id="navMenu_expandAll"
										data-options="iconCls: 'icon-standard-arrow-out'">
										展开所有
									</div>
									<div id="navMenu_collapseAll"
										data-options="iconCls: 'icon-standard-arrow-in'">
										折叠所有
									</div>
								</div>
						</div>
					</div>
					<div data-options="region: 'center'"
						style="border-bottom-width: 1px;padding: 0 20px 0 5px;">
					</div>
				</div>
			</div>
		</div>
	</div>

	<!-- 中间-->
	<div id="mainPanle" region="center" href="webpage/main/center.jsp"></div>

	<!-- 右侧 -->
	<div collapsed="true" region="east" iconCls="icon-reload" title="辅助工具"
		split="true" style="width: 190px;"></div>

	<!-- 底部 --> 
	<div region="south" border="false" class="cs-south"
		style="height: auto; overflow: hidden;">
		<div align="center" style="color: #CC99FF; padding-top: 2px">
			&copy; 版权所有 <span class="tip">(推荐谷歌浏览器，获得更快响应速度) </span>
		</div>
	</div>
</body>
</html>