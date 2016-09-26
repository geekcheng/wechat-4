package com.cdeledu.dao;

import com.cdeledu.model.rbac.ManagerUser;

public interface ManagerUserDao extends BaseDao<ManagerUser> {
	/** 检查用户是否存在 */
	public ManagerUser checkUserExits(ManagerUser managerUser);

	/** 获取用户的角色 */
	public String getUserRole(ManagerUser managerUser);

	/** 保存管理员登录信息 */
	public void saveLoginInfo(ManagerUser managerUser);
}
