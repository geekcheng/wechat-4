package com.cdeledu.model.system;

import java.io.Serializable;

/**
 * @类描述: 资源表实体类
 * @创建者: 皇族灬战狼
 * @创建时间: 2016年4月15日 下午12:03:36
 * @版本: V2.0
 * @since: JDK 1.7
 * @see <a href="">TODO(连接内容简介)</a>
 */
public class ResourceBean implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer id;
	// 资源名称
	private String text;
	// 图标名称
	private String iconClsName;
	// 资源地址
	private String resourceUrl;
	// 资源类型
	private Integer type;
	// 资源描述
	private String resourceDesc;
	// 状态
	private Integer state;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

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

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getResourceDesc() {
		return resourceDesc;
	}

	public void setResourceDesc(String resourceDesc) {
		this.resourceDesc = resourceDesc;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

}
