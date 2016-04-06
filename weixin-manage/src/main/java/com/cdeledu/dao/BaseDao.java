package com.cdeledu.dao;

import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

public interface BaseDao<T> {

	/**
	 * select count(*) from 类
	 * 
	 * @param hql
	 * @param param
	 * @return Long
	 */
	public Integer countByJdbc(String sql, Object... param);

	/**
	 * 返回 JdbcTemplate
	 * 
	 * @return
	 */
	public JdbcTemplate getJdbcTemplate();

	/**
	 * 执行SQL
	 */
	public Integer executeSql(String sql, List<Object> param);

	/**
	 * 执行SQL
	 */
	public Integer executeSql(String sql, Object... param);

	/**
	 * 通过JDBC查找对象集合 使用指定的检索标准检索数据返回数据
	 */
	public List<Map<String, Object>> findForJdbc(String sql, Object... objs);

	/**
	 * 通过JDBC查找对象集合 使用指定的检索标准检索数据返回数据
	 */
	public Map<String, Object> findOneForJdbc(String sql, Object... objs);

	/**
	 * 通过JDBC查找对象集合,带分页 使用指定的检索标准检索数据并分页返回数据
	 */
	public List<Map<String, Object>> findForJdbc(String sql, int page, int rows);

	/**
	 * 通过JDBC查找对象集合,带分页 使用指定的检索标准检索数据并分页返回数据
	 */
	public List<T> findObjForJdbc(String sql, int page, int rows, Class<T> clazz);

	/**
	 * 使用指定的检索标准检索数据并分页返回数据-采用预处理方式
	 * 
	 * @param criteria
	 * @param firstResult
	 * @param maxResults
	 * @return
	 * @throws DataAccessException
	 */
	public List<Map<String, Object>> findForJdbcParam(String sql, int page, int rows, Object... objs);

	/**
	 * 使用指定的检索标准检索数据并分页返回数据For JDBC
	 */
	public Long getCountForJdbc(String sql);

	/**
	 * 使用指定的检索标准检索数据并分页返回数据For JDBC-采用预处理方式
	 * 
	 */
	public Long getCountForJdbcParam(String sql, Object[] objs);
}
