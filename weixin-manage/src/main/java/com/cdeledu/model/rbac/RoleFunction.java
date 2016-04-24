package com.cdeledu.model.rbac;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 * 
 * @ClassName: RolePower
 * @Description:
 * 				<ul>
 *               <li>RBAC（Role-Based Access Control，基于角色的访问控制）</li>
 *               <li>角色与权限中间表实体类F</li> </ul
 * @author: 独泪了无痕
 * @date: 2015-8-22 上午01:28:19
 * @version: V1.0
 */
@Entity
@Table(name = "t_system_role_function")
@PrimaryKeyJoinColumn(name = "id")
public class RoleFunction implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer id;
	// 角色id
	private Integer roleId;
	// 权限id
	private Integer powerId;
	// 操作权限代码
	private String operation;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public Integer getPowerId() {
		return powerId;
	}

	public void setPowerId(Integer powerId) {
		this.powerId = powerId;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}
}
