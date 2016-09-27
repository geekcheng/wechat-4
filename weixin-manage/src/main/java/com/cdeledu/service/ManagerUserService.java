package com.cdeledu.service;

import com.cdeledu.model.rbac.ManagerUser;
import com.cdeledu.model.rbac.ManagerUserRole;

public interface ManagerUserService extends BaseService<ManagerUser> {
	/** 检查用户是否存在 */
	public ManagerUser checkUserExits(ManagerUser managerUser);

	/** 获取用户的角色 */
	public ManagerUserRole getUserRole(ManagerUser managerUser);

	/** 保存管理员登录信息 */
	public void saveLoginInfo(ManagerUser managerUser);

	/** admin账户初始化 */
	public void pwdInit(ManagerUser managerUser);

	/** 保存用户-角色关联关系 */
	public void saveRoleUser(ManagerUserRole managerUserRole);

}
