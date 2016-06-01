package com.cdeledu.service.common;

import java.util.List;

/**
 * @类描述: 通用业务处理接口(适用于单个实体类表)
 * @创建者: 独泪了无痕--duleilewuhen@sina.com
 * @创建日期: 2016年4月5日 下午11:26:23
 * @版本: V1.0
 * @since: JDK 1.7
 */
public interface CommonService {
	/** 获取对象集合 */
	public <T> List<T> findForJdbc(T entity);

	/** 获取对象 */
	public <T> T findOneForJdbc(T entity);

	/** 插入 */
	public <T> void save(T entity);

	/** 保存或者更新 */
	public <T> void saveOrUpdate(T entity);

	/** 删除 */
	public <T> void delete(T entity);

	/** 批量插入 */
	public <T> void batchSave(List<T> entitys);
}
