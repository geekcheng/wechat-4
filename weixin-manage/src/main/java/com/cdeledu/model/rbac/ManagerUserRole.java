package com.cdeledu.model.rbac;

import java.io.Serializable;

/**
 * 
 * @ClassName: UserRole
 * @Description: <ul>
 *               <li>RBAC（Role-Based Access Control:基于角色的访问控制）</li>
 *               <li>用户角色实体类</li>
 *               </ul
 * @author: 独泪了无痕
 * @date: 2015-8-22 上午01:20:34
 * @version: V1.0
 */
public class ManagerUserRole implements Serializable {
	private static final long serialVersionUID = 1L;
	// 管理员id
	private int userId;
	// 角色id
	private int roleId;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
}
