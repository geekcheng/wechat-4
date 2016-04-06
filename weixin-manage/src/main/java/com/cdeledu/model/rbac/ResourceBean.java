package com.cdeledu.model.rbac;

import java.io.Serializable;

/**
 * 
 * @ClassName: ResourceBean
 * @Description: <ul>
 *               <li>RBAC（Role-Based Access Control:基于角色的访问控制）</li>
 *               <li>资源表实体类</li>
 *               </ul>
 * @author: 独泪了无痕
 * @date: 2015-8-23 下午10:08:30
 * @version: V1.0
 */
public class ResourceBean implements Serializable {
	private static final long serialVersionUID = 1L;
	// 资源名称
	private String text;
	// 图标名称
	private String iconClsName;
	// 资源地址
	private String resourceUrl;
	// 资源类型
	private int type;
	// 资源描述
	private String resourceDesc;
	// 状态
	private int state;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getIconClsName() {
		return iconClsName;
	}

	public void setIconClsName(String iconClsName) {
		this.iconClsName = iconClsName;
	}

	public String getResourceUrl() {
		return resourceUrl;
	}

	public void setResourceUrl(String resourceUrl) {
		this.resourceUrl = resourceUrl;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getResourceDesc() {
		return resourceDesc;
	}

	public void setResourceDesc(String resourceDesc) {
		this.resourceDesc = resourceDesc;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}
}
