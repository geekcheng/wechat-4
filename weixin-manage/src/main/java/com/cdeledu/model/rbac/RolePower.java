package com.cdeledu.model.rbac;

import java.io.Serializable;

/**
 * 
 * @ClassName: RolePower
 * @Description: <ul>
 *               <li>RBAC（Role-Based Access Control，基于角色的访问控制）</li>
 *               <li>角色与权限中间表实体类F</li>
 *               </ul
 * @author: 独泪了无痕
 * @date: 2015-8-22 上午01:28:19
 * @version: V1.0
 */
public class RolePower implements Serializable {
	private static final long serialVersionUID = 1L;
	// 角色id
	private int roleId;
	// 权限id
	private int powerId;

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public int getPowerId() {
		return powerId;
	}

	public void setPowerId(int powerId) {
		this.powerId = powerId;
	}
}
