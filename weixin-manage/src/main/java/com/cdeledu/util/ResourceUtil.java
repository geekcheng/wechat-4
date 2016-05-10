package com.cdeledu.util;

import java.util.ResourceBundle;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.cdeledu.constant.Globals;
import com.cdeledu.model.common.SessionInfo;
import com.cdeledu.model.rbac.ManagerUser;

/**
 * @类描述: 项目参数工具类
 * @创建者: 独泪了无痕--duleilewuhen@sina.com
 * @创建日期: 2016年4月4日 下午6:28:19
 * @版本: V1.0
 * @since: JDK 1.7
 */
public class ResourceUtil {
	/** ----------------------------------------------------- Fields start */
	private static final ResourceBundle sysConfig = ResourceBundle.getBundle("sysConfig");
	private static final ResourceBundle dbConfig = ResourceBundle.getBundle("dbConfig");

	/** ----------------------------------------------------- Fields end */
	/**
	 * @方法:获取项目配置文件参数
	 * @创建人:独泪了无痕
	 * @param name
	 * @return
	 */
	public static final String getConfigByName(String name) {
		return sysConfig.getString(name);
	}

	/**
	 * @方法:TODO(这里用一句话描述这个方法的作用)
	 * @创建人:独泪了无痕
	 * @param sessionName
	 * @return
	 */
	public static final String getSessionattachmenttitle(String sessionName) {
		return sysConfig.getString(sessionName);
	}

	/**
	 * @方法:获取数据库类型
	 * @创建人:独泪了无痕
	 * @return
	 */
	public static final String getJdbcUrl() {
		return dbConfig.getString("database.dbUrl").toLowerCase();
	}

	/**
	 * @方法:获取session里的用户对象
	 * @创建人:独泪了无痕
	 * @return
	 */
	public static final ManagerUser getSessionUserName() {
		HttpSession session = ContextHolderUtils.getSession();
		session.setMaxInactiveInterval(-1);
		if (session.getAttributeNames().hasMoreElements()) {
			SessionInfo sessionInfo = (SessionInfo) session.getAttribute(Globals.USER_SESSION);
			if (null != sessionInfo) {
				if (null != sessionInfo.getManagerUser()) {
					return sessionInfo.getManagerUser();
				}
			}
		}
		return null;
	}

	/**
	 * @方法:获得请求路径
	 * @创建人:独泪了无痕
	 * @param request
	 * @return
	 */
	public static String getRequestPath(HttpServletRequest request) {
		String requestPath = request.getRequestURI() + "?" + request.getQueryString();
		if (requestPath.indexOf("&") > -1) {// 去掉其他参数
			requestPath = requestPath.substring(0, requestPath.indexOf("&"));
		}
		requestPath = requestPath.substring(request.getContextPath().length() + 1);// 去掉项目路径
		return requestPath;
	}
}
