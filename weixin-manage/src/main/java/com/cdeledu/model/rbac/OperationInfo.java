package com.cdeledu.model.rbac;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 * 
 * @ClassName: OperationBean
 * @Description:
 * 				<ul>
 *               <li>RBAC（Role-Based Access Control:基于角色的访问控制）</li>
 *               <li>功能操作表 实体类</li>
 *               </ul>
 * @author: 独泪了无痕
 * @date: 2015-8-23 下午08:29:56
 * @version: V1.0
 */
@Entity
@Table(name = "t_system_operation")
@PrimaryKeyJoinColumn(name = "id")
public class OperationInfo implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer id;
	// 菜单ID
	private String functionid;
	// 操作名称
	private String opName;
	// 操作编码
	private String opEncode;
	// 操作图标
	private String opIcon;
	// 拦截URL前缀
	private String intercept;
	// 状态
	private Integer status;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFunctionid() {
		return functionid;
	}

	public void setFunctionid(String functionid) {
		this.functionid = functionid;
	}

	public String getOpName() {
		return opName;
	}

	public void setOpName(String opName) {
		this.opName = opName;
	}

	public String getOpEncode() {
		return opEncode;
	}

	public void setOpEncode(String opEncode) {
		this.opEncode = opEncode;
	}

	public String getOpIcon() {
		return opIcon;
	}

	public void setOpIcon(String opIcon) {
		this.opIcon = opIcon;
	}

	public String getIntercept() {
		return intercept;
	}

	public void setIntercept(String intercept) {
		this.intercept = intercept;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}
}
