package com.cdeledu.model.common;

import java.io.Serializable;

/**
 * 
 * @ClassName: PageInfo
 * @Description: 用于分页
 * @author: 独泪了无痕
 * @date: 2015年8月20日 下午2:18:04
 * @version: V1.0
 * @history:
 */
public class PageInfo implements Serializable {
	private static final long serialVersionUID = 1L;
	private int page = 1; // 当前页数:第几页
	private int rows = 10; // 每页记录数
	private String sort;// 排序字段名
	private String order;// 按什么排序(asc,desc)

	public PageInfo() {
		this.page = 1;
		this.rows = 10;
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
