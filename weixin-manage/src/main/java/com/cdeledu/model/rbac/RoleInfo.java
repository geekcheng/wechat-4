package com.cdeledu.model.rbac;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 * 
 * @ClassName: UserRoleId
 * @Description:
 * 				<ul>
 *               <li>RBAC（Role-Based Access Control:基于角色的访问控制）</li>
 *               <li>角色表实体类</li> </ul
 * @author: 独泪了无痕
 * @date: 2015-8-22 上午01:21:17
 * @version: V1.0
 */
@Entity
@Table(name = "t_system_role")
@PrimaryKeyJoinColumn(name = "id")
public class RoleInfo implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer id;
	// 角色名称
	private String roleName;
	// 角色说明或者备注
	private String roleDesc;
	// 是否禁用(0:false;1:true;默认值是0)
	private int stats;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getRoleDesc() {
		return roleDesc;
	}

	public void setRoleDesc(String roleDesc) {
		this.roleDesc = roleDesc;
	}

	public int getStats() {
		return stats;
	}

	public void setStats(int stats) {
		this.stats = stats;
	}
}
