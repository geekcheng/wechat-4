package com.cdeledu.model.system;

import java.io.Serializable;
import java.util.Date;

/**
 * @类描述: 系统字典表类型
 * @创建者: 皇族灬战狼
 * @创建时间: 2016年4月14日 下午3:58:18
 * @版本: V1.0
 * @since: JDK 1.7
 * @see <a href="">TODO(连接内容简介)</a>
 */
public class DictionaryType implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer id;
	// 资源名称:同种类型下唯一性
	private String itemName;
	// 资源名称:同种类型下唯一性
	private String itemCode;
	// 是否有效:1:有效,默认值;-1:无效
	private Integer enabled;
	// 用于指定显示顺序
	private Integer sortCode;
	// 允许编辑:默认1.允许;0:不允许
	private Integer allowEdit;
	// 是否允许删除:默认是1
	private Integer allowDelete;
	// 父节点ID
	private Integer parentId;
	// 创建时间
	private Date createTime;
	// 最后修改时间
	private Date lastEditTime;
	// 字典使用的备注说明
	private String remark;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public Integer getEnabled() {
		return enabled;
	}

	public void setEnabled(Integer enabled) {
		this.enabled = enabled;
	}

	public Integer getSortCode() {
		return sortCode;
	}

	public void setSortCode(Integer sortCode) {
		this.sortCode = sortCode;
	}

	public Integer getAllowEdit() {
		return allowEdit;
	}

	public void setAllowEdit(Integer allowEdit) {
		this.allowEdit = allowEdit;
	}

	public Integer getAllowDelete() {
		return allowDelete;
	}

	public void setAllowDelete(Integer allowDelete) {
		this.allowDelete = allowDelete;
	}

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
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

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
}
