package com.cdeledu.util;

import javax.servlet.http.HttpServletRequest;

/**
 * @类描述: 浏览器工具类
 * @创建者: 皇族灬战狼
 * @创建时间: 2016年6月12日 上午10:21:17
 * @版本: V1.0
 * @since: JDK 1.7
 */
public class BrowserUtils {
	/** ----------------------------------------------------- Fields start */
	/**
	 * ****************** 浏览器系列 ******************
	 */
	public final static String IE6 = "MSIE 6.0";
	public final static String IE7 = "MSIE 7.0";
	public final static String IE8 = "MSIE 8.0";
	public final static String IE9 = "MSIE 9.0";
	public final static String IE10 = "MSIE 10.0";

	/** ----------------------------------------------------- Fields end */

	/** ----------------------------------------------- private Method start */

	private static boolean getBrowserType(HttpServletRequest request, String brosertype) {
		return request.getHeader("USER-AGENT").toLowerCase().indexOf(brosertype) > 0 ? true : false;
	}

	/** ----------------------------------------------- private Method end */

	/**
	 * @方法描述: 判断是否是IE浏览器
	 * @创建者: 皇族灬战狼
	 * @创建时间: 2016年6月12日 上午11:02:40
	 * @param request
	 * @return
	 */
	public static boolean isIE(HttpServletRequest request) {
		return request.getHeader("USER-AGENT").toLowerCase().indexOf("msie") > 0 ? true : false;
	}

	/**
	 * @方法描述: 获取IE版本
	 * @创建者: 皇族灬战狼
	 * @创建时间: 2016年6月14日 下午6:57:06
	 * @param request
	 * @return
	 */
	public static Double getIEversion(HttpServletRequest request) {
		Double version = 0.0;
		if (getBrowserType(request, IE10)) {
			version = 10.0;
		}
		if (getBrowserType(request, IE9)) {
			version = 9.0;
		}
		if (getBrowserType(request, IE8)) {
			version = 8.0;
		}
		if (getBrowserType(request, IE7)) {
			version = 7.0;
		}
		if (getBrowserType(request, IE6)) {
			version = 6.0;
		}
		return version;
	}
}
