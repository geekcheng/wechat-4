package com.cdeledu.model.rbac;

import java.io.Serializable;

/**
 * 
 * @ClassName: AuthBean
 * @Description: <ul>
 *               <li>RBAC（Role-Based Access Control:基于角色的访问控制）</li>
 *               <li>菜单表实体类</li>
 *               </ul
 * @author: 独泪了无痕
 * @date: 2015年8月22日 下午5:16:57
 * @version: V1.0
 * @history:
 */
public class AuthBean implements Serializable {

	private static final long serialVersionUID = 1L;
	// 菜单名称
	private String authName;
	// 菜单路径
	private String authPath;
	// 父菜单编号
	private int parentId;
	// 备注
	private String authDescription;
	// 是否禁用(0:false;1:true;默认是0)
	private int  state;
	// 菜单图标样式
	private String iconCls;
	// 级别
	private String level;
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
	public int getParentId() {
		return parentId;
	}
	public void setParentId(int parentId) {
		this.parentId = parentId;
	}
	public String getAuthDescription() {
		return authDescription;
	}
	public void setAuthDescription(String authDescription) {
		this.authDescription = authDescription;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public String getIconCls() {
		return iconCls;
	}
	public void setIconCls(String iconCls) {
		this.iconCls = iconCls;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
}
