package com.cdeledu.model.system;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 * @类描述: 系统字典表类型
 * @创建者: 皇族灬战狼
 * @创建时间: 2016年4月14日 下午3:58:18
 * @版本: V1.0
 * @since: JDK 1.7
 * @see <a href="">TODO(连接内容简介)</a>
 */
@Entity
@Table(name = "sys_dictionary_type")
@PrimaryKeyJoinColumn(name = "id")
public class DictionaryType implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer id;
	// 字典类型名称
	private String dictName;
	// 字典编码(字典值 :固定的,不变的)
	private Integer dictCode;
	// 字典是否删除
	private Integer delStatus;
	// 字典使用的备注说明
	private String remark;
	// 创建时间
	private Date createTime;
	// 最后修改时间
	private Date lastEditTime;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDictName() {
		return dictName;
	}

	public void setDictName(String dictName) {
		this.dictName = dictName;
	}

	public Integer getDictCode() {
		return dictCode;
	}

	public void setDictCode(Integer dictCode) {
		this.dictCode = dictCode;
	}

	public Integer getDelStatus() {
		return delStatus;
	}

	public void setDelStatus(Integer delStatus) {
		this.delStatus = delStatus;
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

	public Date getLastEditTime() {
		return lastEditTime;
	}

	public void setLastEditTime(Date lastEditTime) {
		this.lastEditTime = lastEditTime;
	}
}
