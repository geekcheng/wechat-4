package com.cdeledu.model.rbac;

import java.io.Serializable;
import java.util.Date;

import org.springmodules.validation.bean.conf.loader.annotation.handler.NotBlank;

/**
 * 
 * @类描述: 系统管理员用户表
 * @创建者: 独泪了无痕--duleilewuhen@sina.com
 * @创建日期: 2015-8-23 下午08:34:19
 * @版本: V1.2
 * @since: JDK 1.7
 */
public class ManagerUser implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer id;
	// 用户名(数字与字母组成)
	@NotBlank(message = "登陆账号不能为空")
	private String userName;
	// 密码(真正的密码与用户名加密之后的结果)
	@NotBlank(message = "登陆密码不能为空")
	private String password;
	// 用户类型(超级管理员、系统管理员、管理员)
	private Integer UserType;
	// 最后登录时间
	private Date last_login_time;
	// 最后登录ip
	private String last_login_ip;
	// 登录次数(查询操作日志的结果数据)
	private Integer login_count;
	// 备注
	private String userDesc;
	/**
	 * 是否审核,不为空.默认是-1:<br>
	 * -1:未提交审核;0:提交审核;1:审核通过;
	 */
	private Integer status;
	@NotBlank(message = "账号创建时间")
	private Date createTime;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getUserType() {
		return UserType;
	}

	public void setUserType(Integer userType) {
		UserType = userType;
	}

	public Date getLast_login_time() {
		return last_login_time;
	}

	public void setLast_login_time(Date last_login_time) {
		this.last_login_time = last_login_time;
	}

	public String getLast_login_ip() {
		return last_login_ip;
	}

	public void setLast_login_ip(String last_login_ip) {
		this.last_login_ip = last_login_ip;
	}

	public Integer getLogin_count() {
		return login_count;
	}

	public void setLogin_count(Integer login_count) {
		this.login_count = login_count;
	}

	public String getUserDesc() {
		return userDesc;
	}

	public void setUserDesc(String userDesc) {
		this.userDesc = userDesc;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
}