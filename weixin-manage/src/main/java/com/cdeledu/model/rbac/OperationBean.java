package com.cdeledu.model.rbac;

import java.io.Serializable;

/**
 * 
 * @ClassName: OperationBean
 * @Description: <ul>
 *               <li>RBAC（Role-Based Access Control:基于角色的访问控制）</li>
 *               <li>功能操作表 实体类</li>
 *               </ul>
 * @author: 独泪了无痕
 * @date: 2015-8-23 下午08:29:56
 * @version: V1.0
 */
public class OperationBean implements Serializable {
	private static final long serialVersionUID = 1L;
	// 操作名称
	private String opName;
	// 操作编码
	private String opEncode;
	// 拦截URL前缀
	private String intercept;

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

	public String getIntercept() {
		return intercept;
	}

	public void setIntercept(String intercept) {
		this.intercept = intercept;
	}

}
