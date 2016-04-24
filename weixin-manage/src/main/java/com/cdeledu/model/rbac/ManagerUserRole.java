package com.cdeledu.model.rbac;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 * 
 * @ClassName: UserRole
 * @Description:
 *               <ul>
 *               <li>RBAC（Role-Based Access Control:基于角色的访问控制）</li>
 *               <li>用户角色实体类</li> </ul
 * @author: 独泪了无痕
 * @date: 2015-8-22 上午01:20:34
 * @version: V1.0
 */
@Entity
@Table(name = "t_system_managerUser_role")
@PrimaryKeyJoinColumn(name = "id")
public class ManagerUserRole implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer id;
	// 管理员id
	private Integer userId;
	// 角色id
	private Integer roleId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
}
