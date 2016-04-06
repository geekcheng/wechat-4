package com.cdeledu.service;

import java.util.List;

import com.cdeledu.model.personManage.UserInfoBean;
import com.cdeledu.model.rbac.ManagerUser;

/**
 * 
 * @ClassName: UserService
 * @Description: 管理员以及普通用户业务处理接口
 * @author: 独泪了无痕
 * @date: 2015年8月20日 下午12:57:41
 * @version: V1.0
 * @history:
 */
public interface UserService extends CommonService {
	/** 检查用户是否存在 */
	public ManagerUser checkUserExits(ManagerUser managerUser);

	/** 获取用户的角色 */
	public String getUserRole(ManagerUser managerUser);

	/** 获取用户信息(单独一个) */
	public UserInfoBean findUser(UserInfoBean user);

	/** 获取用户列表的个数 */
	Integer getUserCount(UserInfoBean userBean);

	/** 返回用户列表 */
	public List<UserInfoBean> userList(UserInfoBean user);

	/** 保存用户基本信息 */
	public Integer saveUser(UserInfoBean user);

	/** 更新用户信息 */
	public void updateUser(UserInfoBean user);

	/** 除删除用户 */
	public Integer delUserIds(Integer[] delIds);
}
