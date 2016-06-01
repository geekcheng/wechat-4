package com.cdeledu.service;

import java.util.Set;

import com.cdeledu.model.personManage.UserInfoBean;

/**
 * @类描述: 系统业务处理接口
 * @创建者: 皇族灬战狼
 * @创建时间: 2016年6月1日 下午4:58:15
 * @版本: V1.0
 * @since: JDK 1.7
 */
public interface SystemService {
	/**
	 * @方法: 登陆用户检查
	 * @创建人:独泪了无痕
	 * @param userInfo
	 * @return
	 * @throws Exception
	 */
	public UserInfoBean checkUserExits(UserInfoBean userInfo) throws Exception;

	/**
	 * @方法: 日志添加
	 * @创建人:独泪了无痕
	 * @param LogContent
	 *            内容
	 * @param loglevel
	 *            级别
	 * @param operatetype
	 *            类型
	 */
	public void addLog(String LogContent, Short loglevel, Short operatetype);

	/**
	 * @方法:根据用户ID 和 菜单Id 获取 具有操作权限的按钮Codes
	 * @创建人:独泪了无痕
	 * @param userId
	 * @param functionId
	 * @return
	 */
	public Set<String> getOperationCodesByUserIdAndFunctionId(String userId, String functionId);

	/**
	 * @方法: 根据角色ID 和 菜单Id 获取 具有操作权限的按钮Codes
	 * @创建人:独泪了无痕
	 * @param roleId
	 * @param functionId
	 * @return
	 */
	public Set<String> getOperationCodesByRoleIdAndFunctionId(String roleId, String functionId);
}
