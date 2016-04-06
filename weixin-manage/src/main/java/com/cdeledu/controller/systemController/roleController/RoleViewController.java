package com.cdeledu.controller.systemController.roleController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cdeledu.controller.BaseController;

/**
 * @类描述: 角色数据
 * @创建者: 独泪了无痕--duleilewuhen@sina.com
 * @创建日期: 2016年4月4日 下午8:13:20
 * @版本: V1.0
 * @since: JDK 1.7
 */
@Controller
@RequestMapping("/roleView")
public class RoleViewController  extends BaseController {
	/**
	 * @方法:角色列表页面跳转
	 * @创建人:独泪了无痕
	 * @return
	 */
	@RequestMapping(params = "roleInit")
	public ModelAndView role() {
		return new ModelAndView("system/role/roleInit");
	}
}
