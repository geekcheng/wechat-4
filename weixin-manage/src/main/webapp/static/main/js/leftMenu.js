/**
 * 左侧菜单
 */

$(function() {
	var mainMenuTree = $('#mainMenuTree');

	// 刷新该选项卡及其导航菜单
	$("#navMenu_refresh").click(function() {
		alert("刷新该选项卡及其导航菜单");
	});
	// 收藏
	$("#navMenu_Favo").click(function() {
		alert("收藏");
	});

	// 展开当前
	$("#navMenu_expand").click(function() {
		navMenu_expand();
	});

	// 折叠当前
	$("#navMenu_collapse").click(function() {
		navMenu_collapse();
	});

	// 展开当前所有
	$("#navMenu_collapseCurrentAll").click(function() {
		navMenu_collapseCurrentAll();
	});

	// 折叠当前所有
	$("#navMenu_expandCurrentAll").click(function() {
		navMenu_expandCurrentAll();
	});

	// 折叠所有
	$("#navMenu_collapseAll").click(function() {
		mainMenuTree.tree("collapseAll");
	});

	// 展开所有
	$("#navMenu_expandAll").click(function() {
		mainMenuTree.tree("expandAll");
	});
});

/**
 * 展开当前
 */
function navMenu_expand() {
}
/**
 * 折叠当前
 */
function navMenu_collapse() {
}

/**
 * 展开当前所有
 */
function navMenu_collapseCurrentAll() {
}
/**
 * 展开当前所有
 */
function navMenu_expandCurrentAll() {
}