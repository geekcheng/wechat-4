<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<script type="text/javascript">
$(function() {
	/**
	 * 绑定tabs的右键菜单
	 */
	$("#centertabs").tabs( {
		onContextMenu : function(e, title) {
			e.preventDefault();
			$('#tabsMenu').menu('show', {
				left : e.pageX,
				top : e.pageY
			}).data("tabTitle", title);
		}
	});
	/**
	 * 实例化menu的onClick事件
	 */
	$("#tabsMenu").menu( {
		onClick : function(item) {
			var curTabTitle =$(this).data("tabTitle");
			var tabs = $("#centertabs");
			// 关闭 当前选项卡 左侧全部 菜单 
			if (item.name == 'left') {
				dllwh.WebReason();
			}
			// 关闭 当前选项卡 右侧 侧全部 菜单 
			if (item.name == 'right') {
				dllwh.WebReason();
			}
			// 关闭当前 Tab
			if (item.name === "close") {
				var tab = tabs.tabs("getTab", tabs.tabs("getTabIndex", tabs
						.tabs("getSelected")));
				if (tab.panel('options').closable) {
					tabs.tabs("close", curTabTitle);
					return;
				} else {
					$.messager.alert("提示", "[<font color='red' size='4'>"
							+ tab.panel('options').title + "</font>]不可以被关闭！",
							'info');
				}
				
				var allTabs = tabs.tabs("tabs");
				var closeTabsTitle = [];
				$.each(allTabs, function() {
					var opt = $(this).panel("options");
					// 关闭 除当前Tab 之外的 其余Tab
						if (opt.closable && opt.title != curTabTitle
								&& type === "Other") {
							closeTabsTitle.push(opt.title);
						} else if (opt.closable && type === "All") {
							// 关闭 除当前Tab 之外的 其余Tab
						closeTabsTitle.push(opt.title);
					}
				});
				for ( var i = 0; i < closeTabsTitle.length; i++) {
					tabs.tabs("close", closeTabsTitle[i]);
				}
			}
		}
	});
});
</script>
<div class="easyui-tabs " fit="true" border="false" id="centertabs"
	data-options="tools:'#tab-tools'">
	<div title="我的桌面" data-options="iconCls:'icon-home'">
		<div id="frame">
			<div id="scroller">
				<div id="content">
					<div class="section" id="pane-0">
						<div class="page1">
							<div class="content">
								<div class="first_screen">
									<div class="time">
										<span id="h1"></span>
										<span id="h2"></span>
										<strong>:</strong>
										<span id="m1"></span>
										<span id="m2"></span>
										<strong>:</strong>
										<span id="s1"></span>
										<span id="s2"></span>
									</div>
									<div class="date" id="currentime"></div>
									<div class="welcome_wz">
										<img src="static/main/images/welcome_wz.png" width="400" height="112" />
									</div>
								</div>
							</div>
						</div>
					</div>
					<div class="section" id="pane-1" style="display:none">
						<div class="page1">
							<div class="content">
								<div class="second_screen">
								
								</div>
							</div>
						</div>
					</div>
					<div class="section" id="pane-2" style="display:none">
						<div class="page1">
							<div class="content">
								<div class="second_screen">
								
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			<div id="switch">
				<div id="switch-content">
					<ul id="toolbar" class="navigation">
						<li id="tab-0" class="active">
							<a href="javascript:void(0)" id="aaa" 
								onclick="javascript:ScrollSection(0, 'scroller', 'home-pane'); return false">
							</a>
						</li>
						<li id="tab-1" class="inactive">
							<a href="javascript:void(0)" 
								onclick="javascript:ScrollSection(1, 'scroller', 'home-pane'); return false">
							</a>
						</li>
						<li id="tab-2" class="inactive">
							<a href="javascript:void(0)"
								onclick="javascript:ScrollSection(2, 'scroller', 'home-pane'); return false">
							</a>
						</li>
					</ul>
				</div>
			</div>
			<div class="clear"></div>
			<div class="main_desktop">
				<ul class="desktop_wrap">
					<li>
						<p>系统说明</p>
						<a href="javascript:void(0)" onclick="return false;">
							<img src="static/main/images/icon_2.png" width="56" height="58" />
						</a>
					</li>
					<li>
						<p>工作任务</p>
						<a href="javascript:void(0)" onclick="return false;">
							<img src="static/main/images/icon_3.png" width="56" height="58" />
						</a>
					</li>
					<li>
						<p>项目管理</p>
						<a href="javascript:void(0)" onclick="return false;">
							<img src="static/main/images/icon_4.png" width="56" height="58" />
						</a>
					</li>
					<li>
						<p>控制面板</p>
						<a href="javascript:void(0)" onclick="return false;">
							<img src="static/main/images/icon_5.png" width="56" height="58" />
						</a>
					</li>
					<li>
						<p>即时提醒</p>
						<a href="javascript:void(0)" onclick="return false;">
							<img src="static/main/images/icon_6.png" width="56" height="58" />
						</a>
					</li>
				</ul>
			</div>
		</div>
	</div>
</div>

<!--************	用于右键菜单	************-->
<div id="tabsMenu" class="easyui-menu" style="width: 130px;">
	<div name="close"
		data-options="iconCls:'ext-icon-standard-application-form-delete'">
		<!--  关闭当前选中的选项卡-->
		关闭选项卡
	</div>
	<div name="Other" data-options="iconCls:'icon-standard-cancel'">
		<!--  关闭除当前选中外的其他所有选项卡-->
		关闭其他选项卡
	</div>
	<div class="menu-sep"></div>
	<div name="reload"
		data-options="iconCls:'icon-standard-table-refresh',disabled:true">
		刷新选项卡
	</div>
	<div class="menu-sep"></div>
	<div name="left"
		data-options="iconCls:'icon-standard-tab-close-left',disabled:true">
		关闭左侧选项卡
	</div>
	<div name="right"
		data-options="iconCls:'icon-standard-tab-close-right',disabled:true">
		关闭右侧选项卡
	</div>
	<div name="All" data-options="iconCls:'icon-standard-cross'">
		关闭所有选项卡
	</div>
</div>