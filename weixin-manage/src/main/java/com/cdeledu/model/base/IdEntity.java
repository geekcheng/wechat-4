package com.cdeledu.model.base;

import java.io.Serializable;

public class IdEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer id;
	private int page = 1; // 当前页数:第几页
	private int rows = 10; // 每页记录数
	private String sort;// 排序字段名
	private String order;// 按什么排序(asc,desc)

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	public String getOrder() {
		return order;
	}

	public void setOrder(String order) {
		this.order = order;
	}
}
