package com.cdeledu.dao;

import com.cdeledu.model.rbac.ManagerUser;

/**
 * @类描述: 数据处理接口--管理员
 * @创建者: 独泪了无痕--duleilewuhen@sina.com
 * @创建日期: 2016年6月11日 下午6:06:09
 * @版本: V1.0
 * @since: JDK 1.7
 * @see <a href="">TODO(连接内容简介)</a>
 */
public interface UserDao extends commonMapper<ManagerUser>{
	/** 检查用户是否存在 */
	public ManagerUser checkUserExits(ManagerUser managerUser);
}
