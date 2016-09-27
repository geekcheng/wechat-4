package com.cdeledu.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cdeledu.dao.ManagerUserDao;
import com.cdeledu.model.rbac.ManagerUser;
import com.cdeledu.model.rbac.ManagerUserRole;
import com.cdeledu.service.ManagerUserService;
import com.cdeledu.util.PasswordUtil;

/**
 * @类描述: 业务处理层-系统管理员
 * @创建者: 皇族灬战狼
 * @创建时间: 2016年9月26日 上午10:17:32
 * @版本: V1.0
 * @since: JDK 1.7
 */
@Service
@Transactional
public class ManagerUserServiceImpl implements ManagerUserService {
	/** ----------------------------------------------------- Fields start */
	@Resource
	private ManagerUserDao managerUserDao;

	/** ----------------------------------------------------- Fields end */
	/**
	 * 保存用户基本信息
	 */
	public int insertSelective(ManagerUser record) {
		return managerUserDao.insertSelective(record);
	}

	/**
	 * 删除用户
	 */
	public int delete(ManagerUser record) {
		return managerUserDao.delete(record);
	}

	/**
	 * 删除用户通过主键
	 */
	public int deleteByPrimaryKey(Object key) {
		return managerUserDao.deleteByPrimaryKey(key);
	}
	public int updateEntitie(ManagerUser record) {
		return managerUserDao.updateEntitie(record);
	}

	/**
	 * 更新用户信息
	 */
	public int updateByPrimaryKey(ManagerUser record) {
		return managerUserDao.updateByPrimaryKey(record);
	}

	/**
	 * 返回用户列表
	 */
	public List<ManagerUser> findForJdbc(ManagerUser record) {
		return managerUserDao.findForJdbc(record);
	}

	/**
	 * 获取用户列表的个数
	 */
	public int getCountForJdbcParam(ManagerUser record) {
		return managerUserDao.getCountForJdbcParam(record);
	}

	/**
	 * 获取用户信息(单独一个)
	 */
	public ManagerUser findOneForJdbc(ManagerUser record) {
		return managerUserDao.findOneForJdbc(record);
	}

	/**
	 * 获取用户信息(单独一个)
	 */
	public ManagerUser selectByPrimaryKey(Object key) {
		return managerUserDao.selectByPrimaryKey(key);
	}

	/**
	 * 检查用户是否存在
	 */
	public ManagerUser checkUserExits(ManagerUser user) {
		// 密码加密
		String password = PasswordUtil.encrypt(user.getUserName(), user.getPassword());
		ManagerUser managerUser = new ManagerUser();
		managerUser.setUserName(user.getUserName());
		managerUser.setPassword(password);

		return managerUserDao.checkUserExits(managerUser);
	}

	/**
	 * 获取用户的角色
	 */
	public ManagerUserRole getUserRole(ManagerUser managerUser) {
		return managerUserDao.getUserRole(managerUser);
	}

	/**
	 * 保存管理员登录信息
	 */
	public void saveLoginInfo(ManagerUser managerUser) {

	}

	/**
	 * admin账户初始化
	 */
	public void pwdInit(ManagerUser managerUser) {
	}

}
