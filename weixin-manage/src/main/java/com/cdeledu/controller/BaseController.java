package com.cdeledu.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cdeledu.interceptors.DateConvertEditor;

/**
 * @类描述: 基础控制器，其他控制器需集成此控制器获得initBinder自动转换的功能
 * @创建者: 独泪了无痕--duleilewuhen@sina.com
 * @创建日期: 2016年4月4日 下午2:28:19
 * @版本: V1.0
 * @since: JDK 1.7
 */
@Controller
@RequestMapping("/baseController")
public class BaseController {
	/** ----------------------------------------------------- Fields start */

	/** ----------------------------------------------------- Fields end */
	/**
	 * @方法:将前台传递过来的日期格式的字符串,自动转化为Date类型
	 * @创建人:独泪了无痕
	 * @param binder
	 */
	@InitBinder
	public void initBinder(ServletRequestDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		// binder.registerCustomEditor(Date.class, new DateConvertEditor());
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
	}
}
