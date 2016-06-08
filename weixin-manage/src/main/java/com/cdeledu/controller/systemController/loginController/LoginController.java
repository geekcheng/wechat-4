package com.cdeledu.controller.systemController.loginController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.cdeledu.constant.Globals;
import com.cdeledu.controller.BaseController;
import com.cdeledu.model.common.AjaxJson;
import com.cdeledu.model.common.SessionInfo;
import com.cdeledu.model.rbac.ManagerUser;
import com.cdeledu.service.SystemService;
import com.cdeledu.service.UserService;
import com.cdeledu.util.ContextHolderUtils;
import com.cdeledu.util.ResourceUtil;

/**
 * @类描述: 登陆初始化控制器
 * @创建者: 独泪了无痕--duleilewuhen@sina.com
 * @创建日期: 2016年4月4日 下午5:55:06
 * @版本: V1.0
 * @since: JDK 1.7
 */
@Controller
@RequestMapping("/loginController")
public class LoginController extends BaseController {
	/** ----------------------------------------------------- Fields start */
	@Autowired
	private UserService userService;
	@Autowired
	private SystemService systemService;

	private String msg = null;

	/** ----------------------------------------------------- Fields end */
	/**
	 * @方法:登陆验证
	 *          <ul>
	 *          <li>① 缺少登录验证码</li>
	 *          <li>② 缺少密码加密</li>
	 *          </ul>
	 * @创建人:独泪了无痕
	 * @param request
	 * @param response
	 * @param user
	 * @return
	 */
	@RequestMapping(params = "checkuser")
	@ResponseBody
	public AjaxJson checkuser(HttpServletRequest request, HttpServletResponse response,
			ManagerUser user) {
		AjaxJson reslutMsg = new AjaxJson();
		HttpSession session = ContextHolderUtils.getSession();
		// 密码加密(暂时搁置)
		ManagerUser managerUser = userService.checkUserExits(user);
		if (null != managerUser) {
			msg = "用户: " + user.getUserName() + "登录成功";
			SessionInfo sessionInfo = new SessionInfo();
			sessionInfo.setManagerUser(managerUser);
			session.setMaxInactiveInterval(60 * 30);
			session.setAttribute(Globals.USER_SESSION, sessionInfo);

			// 添加登陆日志
			systemService.addLog(msg, Globals.Log_Type_LOGIN, Globals.Log_Leavel_INFO);
		} else {
			reslutMsg.setMsg("用户名或密码错误!");
			reslutMsg.setSuccess(false);
		}
		return reslutMsg;
	}

	/***
	 * @方法:用户登录
	 * @创建人:独泪了无痕
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(params = "doLogin")
	public String doLogin(HttpServletRequest request, HttpServletResponse response) {
		ManagerUser managerUser = ResourceUtil.getSessionUserName();
		if (null != managerUser) {
			request.setAttribute("roleName", userService.getUserRole(managerUser));
			request.setAttribute(Globals.USER_SESSION, managerUser);
			return "main/main";
		} else {
			return "login/login";
		}
	}

	/**
	 * @方法:退出系统
	 * @创建人:独泪了无痕
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(params = "doLogout")
	public ModelAndView doLogout(HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = ContextHolderUtils.getSession();
		ManagerUser managerUser = ResourceUtil.getSessionUserName();
		// 判断用户是否为空,不为空,则清空session中的用户object
		if (null != managerUser) {
			// 注销该操作用户
			session.removeAttribute(Globals.USER_SESSION);
			msg = "用户" + managerUser.getUserName() + "已退出";
			systemService.addLog(msg, Globals.Log_Type_EXIT, Globals.Log_Leavel_INFO);
		}
		return new ModelAndView(new RedirectView("loginController.shtml?doLogin"));
	}

	/**
	 * @方法:菜单跳转
	 * @创建人:独泪了无痕
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(params = "left")
	public ModelAndView left(HttpServletRequest request, HttpServletResponse response) {
		ManagerUser managerUser = ResourceUtil.getSessionUserName();
		HttpSession session = ContextHolderUtils.getSession();
		// 登陆者的权限
		if (null == managerUser) {
			session.removeAttribute(Globals.USER_SESSION);
			return new ModelAndView(new RedirectView("loginController.do?login"));
		}
		return new ModelAndView("main/left");
	}

	/**
	 * @方法:首页跳转
	 * @创建人:独泪了无痕
	 * @param request
	 * @return
	 */
	@RequestMapping(params = "home")
	public ModelAndView home(HttpServletRequest request, HttpServletResponse response) {
		return new ModelAndView("main/home");
	}

	/**
	 * @方法: 菜单权限控制:无权限页面提示跳转
	 * @创建人:独泪了无痕
	 * @param request
	 * @return
	 */
	@RequestMapping(params = "noAuth")
	@ResponseBody
	public ModelAndView noAuth(HttpServletRequest request,
			@RequestParam(value = "requestPath", required = false) String requestPath) {
		AjaxJson reslutMsg = new AjaxJson();
		reslutMsg.setMsg("您没有【" + requestPath + "】权限，请联系管理员给您赋予相应权限！");
		reslutMsg.setSuccess(false);
		return new ModelAndView("common/noAuth");
	}
}
