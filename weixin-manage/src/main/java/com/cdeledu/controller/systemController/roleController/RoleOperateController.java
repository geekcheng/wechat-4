package com.cdeledu.controller.systemController.roleController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cdeledu.constant.Globals;
import com.cdeledu.model.common.AjaxJson;
import com.cdeledu.model.rbac.ManagerUser;
import com.cdeledu.model.rbac.Role;
import com.cdeledu.service.SystemService;
import com.cdeledu.util.ResourceUtil;

/**
 * @类描述: 角色处理类
 * @创建者: 独泪了无痕--duleilewuhen@sina.com
 * @创建日期: 2016年4月4日 下午8:10:56
 * @版本: V1.0
 * @since: JDK 1.7
 */
@Controller
@RequestMapping("/roleOperate")
public class RoleOperateController {
	/** ----------------------------------------------------- Fields start */
	@SuppressWarnings("unused")
	private static final Logger logger = Logger.getLogger(RoleOperateController.class);
	@Autowired
	private SystemService systemService;
	// private RoleService roleService;
	private String msg = null;
	/** ----------------------------------------------------- Fields end */

	/**
	 * @方法:删除角色权限
	 * 			<ul>
	 *            <li>1.删除角色具有的权限、菜单</li>
	 *            <li>2.删除角色与用户的之间的关联</li>
	 *            </ul>
	 * @创建人:独泪了无痕
	 * @param role
	 */
	protected void delRoleFunction(Role role) {

	}

	/**
	 * @方法:角色录入
	 * @创建人:独泪了无痕
	 * @param request
	 * @param response
	 * @param role
	 * @return
	 */
	@RequestMapping(params = "saveRole")
	@ResponseBody
	public AjaxJson saveRole(HttpServletRequest request, HttpServletResponse response, Role role) {
		AjaxJson resultMsg = new AjaxJson();
		if (null != role) {
			if (StringUtils.isNotEmpty(String.valueOf(role.getId()))) {
				msg = "角色: " + role.getRoleName() + "被更新成功";
				systemService.addLog(msg, Globals.Log_Type_UPDATE, Globals.Log_Leavel_INFO);
			} else {
				msg = "角色: " + role.getRoleName() + "被添加成功";
				systemService.addLog(msg, Globals.Log_Type_INSERT, Globals.Log_Leavel_INFO);
			}
		}
		return resultMsg;
	}

	/**
	 * @方法:删除角色
	 * @创建人:独泪了无痕
	 * @param request
	 * @param response
	 * @param role
	 * @return
	 */
	@RequestMapping(params = "delRole")
	@ResponseBody
	public AjaxJson delRole(HttpServletRequest request, HttpServletResponse response, Role role) {
		AjaxJson resultMsg = new AjaxJson();
		ManagerUser managerUser = ResourceUtil.getSessionUserName();
		// 删除角色之前先删除角色权限关系
		delRoleFunction(role);

		msg = "角色: " + role.getRoleName() + "被【" + managerUser.getId() + "】删除成功";
		systemService.addLog(msg, Globals.Log_Type_DEL, Globals.Log_Leavel_INFO);
		return resultMsg;
	}

}
