package com.cdeledu.interceptors;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.cdeledu.constant.Globals;
import com.cdeledu.model.common.SessionInfo;
import com.cdeledu.util.ContextHolderUtils;
import com.cdeledu.util.ResourceUtil;

/**
 * @类描述: 权限拦截器
 * @创建者: 独泪了无痕--duleilewuhen@sina.com
 * @创建日期: 2016年4月24日 下午2:37:01
 * @版本: V1.0
 * @since: JDK 1.7
 */
public class AuthInterceptor implements HandlerInterceptor {
	/** ----------------------------------------------------- Fields start */
	private static final Logger logger = Logger.getLogger(AuthInterceptor.class);
	private List<String> excludeUrls;

	public List<String> getExcludeUrls() {
		return excludeUrls;
	}

	public void setExcludeUrls(List<String> excludeUrls) {
		this.excludeUrls = excludeUrls;
	}

	/** ----------------------------------------------------- Fields end */

	/** ----------------------------------------------- privateMethod start */
	/**
	 * @方法:查询用户是否有权限
	 * @创建人:独泪了无痕
	 * @param request
	 * @return
	 */
	private boolean hasMenuAuth(HttpServletRequest request) {
		// 用户访问的资源地址
		String requestPath = ResourceUtil.getRequestPath(request);
		if(requestPath.indexOf("loginController.shtml") != -1){
			return true;
		}
		SessionInfo sessioninfo = (SessionInfo) ContextHolderUtils.getSession().getAttribute(Globals.USER_SESSION);
		Integer userid = sessioninfo.getManagerUser().getId();
		return false;
	}

	/** ----------------------------------------------- privateMethod end */
	
	/** ----------------------------------------------- PubilcMethod start */
	/**
	 * 在controller后拦截
	 */
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object object,
			Exception exception) throws Exception {

	}

	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object object,
			ModelAndView modelAndView) throws Exception {

	}

	/**
	 * 在controller前拦截
	 */
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object object) throws Exception {
		String requestUri = request.getRequestURI();
		String contextPath = request.getContextPath();
		String url = requestUri.substring(contextPath.length());
		// 用户访问的资源地址
		String requestPath = ResourceUtil.getRequestPath(request);
		HttpSession session = ContextHolderUtils.getSession();
		SessionInfo sessioninfo = (SessionInfo) session.getAttribute(Globals.USER_SESSION);
		if (excludeUrls.contains(requestPath)) {
			return true;
		} else {
			//----------------------------------------------------------------
			// 菜单权限控制
			//----------------------------------------------------------------
			if (null != sessioninfo && null != sessioninfo.getManagerUser()) {
				// 如果没有权限
				if(!hasMenuAuth(request)){
					response.sendRedirect("loginController.shtml?noAuth");
					return false;
				}
			//----------------------------------------------------------------
			// 按钮权限控制
			//----------------------------------------------------------------
			} else {
				
			}
		}
		return false;
	}
	/** ----------------------------------------------- PubilcMethod end */
}
