/**
 * 扩展javsScript工具函数
 */
var dllwh = dllwh || {};
dllwh.data = dllwh.data || {};// 用于存放临时的数据或者对象


/**
 * 用于在无前台javascript 代码的情况下的提示
 * 
 * @return
 */
dllwh.WebReason = function() {
	$.messager.alert("操作提醒", "基于JavaSctrpt原因，该扩展功能尚未实现，敬请期待！", "info");
}
/**
 * js获取项目根路径
 */
dllwh.getRootPath = function() {
	// 获取当前网址，如： http://localhost:8083/uimcardprj/share/meun.jsp
	var curWwwPath = window.document.location.href;
	// 获取主机地址之后的目录，如： uimcardprj/share/meun.jsp
	var pathName = window.document.location.pathname;
	var pos = curWwwPath.indexOf(pathName);
	// 获取主机地址，如： http://localhost:8083
	var localhostPaht = curWwwPath.substring(0, pos);
	// 获取带"/"的项目名，如：/uimcardprj
	var projectName = pathName
			.substring(0, pathName.substr(1).indexOf('/') + 1);
	return (localhostPaht + projectName);
}

/**
 * 公共工具类 <br/>
 * http://www.htmleaf.com/ziliaoku/qianduanjiaocheng/201505311944.html
 */
var publicUtil = {
	isNotEmpty : function(val) {
		return !this.isEmpty(val);
	},
	isEmpty : function(val) {
		if ((val == null || typeof (val) == "undefined")
				|| (typeof (val) == "string" && val == "" && val != "undefined")) {
			return true;
		} else {
			return false;
		}
	},
	// 去除元素内所有内容 strIds："#id1,#id2,#id3"
	emptyHtml : function(strIds) {
		try {
			var ids = strIds.trim(",").split(",");
			$(ids).each(function() {
				var obj = $(this.toString());
				if (obj.length > 0) {
					$(obj).each(function() {
						$(this).html("");
					});
				} else {
					obj.html("");
				}
			});
		} catch (ex) {
			throw new Error("js方法:【publicUtil.emptyHtml(strIds)】,error！")
		}
	},
	// 去除元素的值 strIds："#id1,#id2,#id3"
	emptyValue : function(strIds) {
		try {
			var ids = strIds.trim(",").split(",");
			$(ids).each(function() {
				var obj = $(this.toString());
				if (obj.length > 0) {
					$(obj).each(function() {
						$(this).val("");
					});
				} else {
					obj.val("");
				}
			});
		} catch (ex) {
			if (PublicUtil.isDebug()) {
				throw new Error("js方法:【publicUtil.emptyValue(strIds)】,error！");
			}
		}
	},
	// 去除Textarea内所有内容 strIds："#id1,#id2,#id3"
	emptyTextarea : function(strIds) {
		try {
			var ids = strIds.trim(",").split(",");
			$(ids).each(function() {
				var obj = $(this.toString());
				if (obj.length > 0) {
					$(obj).each(function() {
						$(this).empty();
						$(this).val("");
					});
				} else {
					obj.empty();
					obj.val("");
				}
			});
		} catch (ex) {
			if (PublicUtil.isDebug()) {
				throw new Error(
						"js方法:【publicUtil.emptyTextarea(strIds)】,error！");
			}
		}
	}
}

/**
 * 判断是否为空 不是一个空对象，或者未定义，或者不等于空字符串
 */
dllwh.isNull = function(exp) {
	if (exp !== null && typeof (exp) !== undefined && exp !== '')
		return false;
	return true;
}

/**
 * 将指定form参数转换为json对象
 * 
 * @param conditionFormId
 * @return
 */
function getQueryParams(conditionFormId) {
	var searchCondition = getJqueryObjById(conditionFormId).serialize();
	var obj = {};
	var pairs = searchCondition.split('&');
	var name, value;

	$.each(pairs, function(i, pair) {
		pair = pair.split('=');
		name = decodeURIComponent(pair[0]);
		value = decodeURIComponent(pair[1]);

		obj[name] = !obj[name] ? value : [].concat(obj[name]).concat(value); // 若有多个同名称的参数，则拼接
		});

	return obj;
}