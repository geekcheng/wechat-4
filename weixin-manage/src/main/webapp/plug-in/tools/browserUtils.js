var browserUtils = browserUtils || {};// 用于存放临时的数据或者对象
/**
 * 浏览器相关操作
 */

// 进入全屏模式, 判断各种浏览器，找到正确的方法
browserUtils.launchFullScreen = function(element) {
	if (element.requestFullscreen) {
		element.requestFullscreen();
	} else if (element.mozRequestFullScreen) {
		element.mozRequestFullScreen();
	} else if (element.webkitRequestFullscreen) {
		element.webkitRequestFullscreen();
	} else if (element.msRequestFullscreen) {
		element.msRequestFullscreen();
	}
	return true;
}

// 退出全屏模式
browserUtils.exitFullScreen = function() {
	if (document.exitFullscreen) {
		document.exitFullscreen();
	} else if (document.mozCancelFullScreen) {
		document.mozCancelFullScreen();
	} else if (document.webkitExitFullscreen) {
		document.webkitExitFullscreen();
	}
	return false;
}

// cookie操作
