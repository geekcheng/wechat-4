package com.cdeledu.model.system;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 * @类描述: 系统字典数据表
 * @创建者: 皇族灬战狼
 * @创建时间: 2016年4月14日 下午3:58:18
 * @版本: V1.0
 * @since: JDK 1.7
 * @see <a href="">TODO(连接内容简介)</a>
 */
@Entity
@Table(name = "sys_dictionary_data")
@PrimaryKeyJoinColumn(name = "id")
public class DictionaryData implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer id;
	// 字典类型编码
	private Integer dictValue;
	// 字典名字
	private String dictDateName;
	// 字典数据编码(同一类型是唯一的)
	private String dictDateCode;
	// 字段值描述
	private String dictDateDesc;
	// 是否固定(0:默认为不固定;1:固定,固定就不能再修改)
	private Integer isfixed;
	// 父节点ID
	private Integer parentId;
	// 用于逻辑删除数据
	private Integer iscancle;
	//用于指定显示顺序
	private Integer sort;
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
	public Integer getDictValue() {
		return dictValue;
	}
	public void setDictValue(Integer dictValue) {
		this.dictValue = dictValue;
	}
	public String getDictDateName() {
		return dictDateName;
	}
	public void setDictDateName(String dictDateName) {
		this.dictDateName = dictDateName;
	}
	public String getDictDateCode() {
		return dictDateCode;
	}
	public void setDictDateCode(String dictDateCode) {
		this.dictDateCode = dictDateCode;
	}
	public String getDictDateDesc() {
		return dictDateDesc;
	}
	public void setDictDateDesc(String dictDateDesc) {
		this.dictDateDesc = dictDateDesc;
	}
	public Integer getIsfixed() {
		return isfixed;
	}
	public void setIsfixed(Integer isfixed) {
		this.isfixed = isfixed;
	}
	public Integer getParentId() {
		return parentId;
	}
	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}
	public Integer getIscancle() {
		return iscancle;
	}
	public void setIscancle(Integer iscancle) {
		this.iscancle = iscancle;
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
	public Date getLastEditTime() {
		return lastEditTime;
	}
	public void setLastEditTime(Date lastEditTime) {
		this.lastEditTime = lastEditTime;
	}
}
