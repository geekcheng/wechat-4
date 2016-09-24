package com.cdeledu.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cdeledu.dao.UserDao;
import com.cdeledu.model.personManage.UserInfoBean;
import com.cdeledu.model.rbac.ManagerUser;
import com.cdeledu.service.UserService;
import com.cdeledu.util.PasswordUtil;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	/** ----------------------------------------------------- Fields start */
	@Resource
	private UserDao userDao;
	/** ----------------------------------------------------- Fields end */

	@Override
	public ManagerUser checkUserExits(ManagerUser user) {
		// 密码加密
		String password = PasswordUtil.encrypt(user.getUserName(), user.getPassword());
		ManagerUser managerUser = new ManagerUser();
		managerUser.setUserName(user.getUserName());
		managerUser.setPassword(password);
		
		return userDao.checkUserExits(managerUser);
	}

	@Override
	public String getUserRole(ManagerUser managerUser) {
		return null;
	}

	@Override
	public UserInfoBean findUser(UserInfoBean user) {
		return null;
	}

	@Override
	public Integer getUserCount(UserInfoBean userBean) {
		return null;
	}

	@Override
	public List<UserInfoBean> userList(UserInfoBean user) {
		return null;
	}

	@Override
	public Integer saveUser(UserInfoBean user) {
		return null;
	}

	@Override
	public void updateUser(UserInfoBean user) {

	}

	@Override
	public Integer delUserIds(Integer[] delIds) {
		return null;
	}

	@Override
	public void saveLoginInfo(ManagerUser managerUser) {

	}

}
