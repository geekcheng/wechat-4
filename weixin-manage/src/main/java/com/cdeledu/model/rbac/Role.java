package com.cdeledu.model.rbac;

import java.util.Date;

import com.cdeledu.model.base.IdEntity;

/**
 * @类描述: 角色表实体类
 * @创建者: 独泪了无痕
 * @创建时间: 2015-8-22 上午01:21:17
 * @版本: V1.0
 * @since: JDK 1.7
 */
public class Role extends IdEntity {
	private static final long serialVersionUID = 1L;
	// 角色名称
	private String roleName;
	// 角色编码
	private String roleCode;
	// 角色分类
	private String categoryCode;
	// 角色说明或者备注
	private String roleDesc;
	// 是否禁用(0:false;1:true;默认值是0)
	private int stats;
	// 是否允许编辑(1:允许，默认值;0:不允许)
	private int allowEdit;
	// 是否允许删除(1:允许，默认值;0:不允许)
	private int allowDelete;
	// 排序码
	private int sortCode;
	// 是否有效:默认0无效；
	private int enabled;
	// 创建人
	private int creater;
	// 创建时间
	private Date createTime;
	// 修改人
	private Integer modifier;
	// 更新时间
	private Date modifyTime;

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getRoleCode() {
		return roleCode;
	}

	public void setRoleCode(String roleCode) {
		this.roleCode = roleCode;
	}

	public String getCategoryCode() {
		return categoryCode;
	}

	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
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

	public int getAllowEdit() {
		return allowEdit;
	}

	public void setAllowEdit(int allowEdit) {
		this.allowEdit = allowEdit;
	}

	public int getAllowDelete() {
		return allowDelete;
	}

	public void setAllowDelete(int allowDelete) {
		this.allowDelete = allowDelete;
	}

	public int getSortCode() {
		return sortCode;
	}

	public void setSortCode(int sortCode) {
		this.sortCode = sortCode;
	}

	public int getEnabled() {
		return enabled;
	}

	public void setEnabled(int enabled) {
		this.enabled = enabled;
	}

	public int getCreater() {
		return creater;
	}

	public void setCreater(int creater) {
		this.creater = creater;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Integer getModifier() {
		return modifier;
	}

	public void setModifier(Integer modifier) {
		this.modifier = modifier;
	}

	public Date getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}
}
