package com.cdeledu.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpSession;

import com.cdeledu.constant.Globals;
import com.cdeledu.model.common.SessionInfo;
import com.cdeledu.util.ContextHolderUtils;

/**
 * @类描述: 登录过滤器
 * @创建者: 皇族灬战狼
 * @创建时间: 2016年5月26日 下午2:28:49
 * @版本: V1.0
 * @since: JDK 1.7
 */
public class AjaxAuthenticationFilter implements Filter {

	@Override
	public void destroy() {

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain)
			throws IOException, ServletException {
		System.out.println("用于检查用户是否登录了系统，如果未登录，则重定向到指的登录页面。");
		HttpSession session = ContextHolderUtils.getSession();
		SessionInfo sessioninfo = (SessionInfo) session.getAttribute(Globals.USER_SESSION);
		if (null != sessioninfo && null != sessioninfo.getManagerUser()) {
			filterChain.doFilter(request, response);
		} else {
			filterChain.doFilter(request, response);
		}
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {

	}

}
