package com.cdeledu.model.system;

import java.io.Serializable;
import java.util.Date;

/**
 * @类描述: 登录日志表
 * @创建者: 皇族灬战狼
 * @创建时间: 2016年4月15日 上午11:55:37
 * @版本: V1.0
 * @since: JDK 1.7
 * @see <a href="">TODO(连接内容简介)</a>
 */
public class LoginLog implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer id;
	// 登录人
	private Integer userCode;
	// 登录时间
	private Date loginTime;
	// 登录的IP地址
	private String ipAddress;
	// 登录是否成功的标识位
	private Integer loginStatus;
	// 登录浏览器
	private Integer brower;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUserCode() {
		return userCode;
	}

	public void setUserCode(Integer userCode) {
		this.userCode = userCode;
	}

	public Date getLoginTime() {
		return loginTime;
	}

	public void setLoginTime(Date loginTime) {
		this.loginTime = loginTime;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public Integer getLoginStatus() {
		return loginStatus;
	}

	public void setLoginStatus(Integer loginStatus) {
		this.loginStatus = loginStatus;
	}

	public Integer getBrower() {
		return brower;
	}

	public void setBrower(Integer brower) {
		this.brower = brower;
	}
}
