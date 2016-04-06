package com.cdeledu.util;

import java.util.ResourceBundle;

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
	private static final ResourceBundle bundle = ResourceBundle.getBundle("sysConfig");

	/** ----------------------------------------------------- Fields end */
	/**
	 * @方法:获取数据库类型
	 * @创建人:独泪了无痕
	 * @return
	 */
	public static final String getJdbcUrl() {
		return bundle.getString("database.dbUrl").toLowerCase();
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
}
