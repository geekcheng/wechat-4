package com.cdeledu.model.rbac;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 * 
 * @ClassName: AuthBean
 * @Description:
 *               <ul>
 *               <li>RBAC（Role-Based Access Control:基于角色的访问控制）</li>
 *               <li>菜单表实体类</li> </ul
 * @author: 独泪了无痕
 * @date: 2015年8月22日 下午5:16:57
 * @version: V1.0
 * @history:
 */
@Entity
@Table(name = "t_system_auth")
@PrimaryKeyJoinColumn(name = "id")
public class AuthBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer id;
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
	private Integer sort;
	// 创建时间
	private Date createTime;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
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
	public Integer getSort() {
		return sort;
	}
	public void setSort(Integer sort) {
		this.sort = sort;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
}
