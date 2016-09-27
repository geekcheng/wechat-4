package com.cdeledu.util;

import java.io.PrintWriter;
import java.io.StringWriter;

/**
 * @类描述: Exception工具类
 * @创建者: 独泪了无痕--duleilewuhen@sina.com
 * @创建日期: 2016年4月24日 下午9:07:21
 * @版本: V1.0
 * @since: JDK 1.7
 */
public class ExceptionHelperUtil {
	/** ----------------------------------------------------- Fields start */

	/** ----------------------------------------------------- Fields end */
	/**
	 * @方法:返回错误信息字符串
	 * @创建人:独泪了无痕
	 * @param exception
	 * @return
	 */
	public static String getExceptionMessage(Exception exception) {
		StringWriter sw = new StringWriter();
		PrintWriter pw = new PrintWriter(sw);
		exception.printStackTrace(pw);
		return sw.toString();
	}
}
