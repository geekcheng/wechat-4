package com.cdeledu.model.system;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 * @类描述: 操作日志
 * @创建者: 皇族灬战狼
 * @创建时间: 2016年4月14日 上午11:55:10
 * @版本: V1.0
 * @since: JDK 1.7
 */
@Entity
@Table(name = "sys_operate_log")
@PrimaryKeyJoinColumn(name = "id")
public class OperateLog implements Serializable {
	private static final long serialVersionUID = 1L;
	// 编号(主键)
	private Integer id;
	// 操作人
	private Integer userCode;
	// Mac地址
	private String macAddress;
	// 日志描述类型(增加、删除、修改,可放在通用字典表)
	private String opType;
	// 操作日日志内容
	private String content;
	// 备注信息，一些其他的需要说明的信息
	private String remark;
	// 记录时间
	private Date createTime;
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
	public String getMacAddress() {
		return macAddress;
	}
	public void setMacAddress(String macAddress) {
		this.macAddress = macAddress;
	}
	public String getOpType() {
		return opType;
	}
	public void setOpType(String opType) {
		this.opType = opType;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
}
