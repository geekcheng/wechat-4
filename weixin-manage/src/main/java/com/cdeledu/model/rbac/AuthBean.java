package com.cdeledu.model.rbac;

import java.util.Date;

import com.cdeledu.model.base.IdEntity;

/**
 * @类描述: 菜单表实体类
 * @创建者: 独泪了无痕
 * @创建时间: 2015年8月22日 下午5:16:57
 * @版本: V1.0
 * @since: JDK 1.7
 */
public class AuthBean extends IdEntity {

	private static final long serialVersionUID = 1L;
	// 菜单名称
	private String authName;
	// 菜单路径
	private String authPath;
	// 父菜单编号
	private Integer parentId;
	// 备注
	private String authDesc;
	// 状态(启用/禁用),不为空(0:false;1:true;默认是0)
	private Integer state;
	// 菜单图标样式
	private String iconCls;
	// 级别
	private Integer level;
	// 排序
	private Integer authSort;
	// 创建人
	private Integer creater;
	// 创建时间
	private Date createTime;
	// 修改人
	private Integer modifier;
	// 更新时间
	private Date modifyTime;

	public String getAuthName() {
		return authName;
	}

	public void setAuthName(String authName) {
		this.authName = authName;
	}

	public String getAuthPath() {
		return authPath;
	}

	public void setAuthPath(String authPath) {
		this.authPath = authPath;
	}

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public String getAuthDesc() {
		return authDesc;
	}

	public void setAuthDesc(String authDesc) {
		this.authDesc = authDesc;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public String getIconCls() {
		return iconCls;
	}

	public void setIconCls(String iconCls) {
		this.iconCls = iconCls;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public Integer getAuthSort() {
		return authSort;
	}

	public void setAuthSort(Integer authSort) {
		this.authSort = authSort;
	}

	public Integer getCreater() {
		return creater;
	}

	public void setCreater(Integer creater) {
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
