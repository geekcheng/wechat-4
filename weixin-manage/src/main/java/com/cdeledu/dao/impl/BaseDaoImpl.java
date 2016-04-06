package com.cdeledu.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.cdeledu.dao.BaseDao;
import com.cdeledu.util.JdbcDao;
import com.cdeledu.util.MyBeanUtils;

@Repository("BaseDao")
public class BaseDaoImpl<T> implements BaseDao<T> {

	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	@Autowired
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	/**
	 * 使用指定的检索标准检索数据并分页返回数据
	 */
	public List<Map<String, Object>> findForJdbc(String sql, int page, int rows) {
		// 封装分页SQL
		sql = JdbcDao.jeecgCreatePageSql(sql, page, rows);
		return this.jdbcTemplate.queryForList(sql);
	}

	/**
	 * 使用指定的检索标准检索数据并分页返回数据
	 * 
	 * @throws IllegalAccessException
	 * @throws InstantiationException
	 */
	public List<T> findObjForJdbc(String sql, int page, int rows, Class<T> clazz) {
		List<T> rsList = new ArrayList<T>();
		// 封装分页SQL
		sql = JdbcDao.jeecgCreatePageSql(sql, page, rows);
		List<Map<String, Object>> mapList = jdbcTemplate.queryForList(sql);

		T po = null;
		for (Map<String, Object> m : mapList) {
			try {
				po = clazz.newInstance();
				MyBeanUtils.copyMap2Bean_Nobig(po, m);
				rsList.add(po);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return rsList;
	}

	/**
	 * 使用指定的检索标准检索数据并分页返回数据-采用预处理方式
	 * 
	 * @param criteria
	 * @param firstResult
	 * @param maxResults
	 * @return
	 * @throws DataAccessException
	 */
	public List<Map<String, Object>> findForJdbcParam(String sql, int page, int rows, Object... objs) {
		// 封装分页SQL
		sql = JdbcDao.jeecgCreatePageSql(sql, page, rows);
		return this.getJdbcTemplate().queryForList(sql, objs);
	}

	/**
	 * 使用指定的检索标准检索数据并分页返回数据For JDBC
	 */
	@SuppressWarnings("deprecation")
	public Long getCountForJdbc(String sql) {
		return this.getJdbcTemplate().queryForLong(sql);
	}

	/**
	 * 使用指定的检索标准检索数据并分页返回数据For JDBC-采用预处理方式
	 * 
	 */
	@SuppressWarnings("deprecation")
	public Long getCountForJdbcParam(String sql, Object[] objs) {
		return this.getJdbcTemplate().queryForLong(sql, objs);
	}

	public List<Map<String, Object>> findForJdbc(String sql, Object... objs) {
		return this.jdbcTemplate.queryForList(sql, objs);
	}

	public Integer executeSql(String sql, List<Object> param) {
		return this.jdbcTemplate.update(sql, param);
	}

	public Integer executeSql(String sql, Object... param) {
		return this.jdbcTemplate.update(sql, param);
	}

	@SuppressWarnings("deprecation")
	public Integer countByJdbc(String sql, Object... param) {
		return this.jdbcTemplate.queryForInt(sql, param);
	}

	public Map<String, Object> findOneForJdbc(String sql, Object... objs) {
		try {
			return this.jdbcTemplate.queryForMap(sql, objs);
		} catch (EmptyResultDataAccessException e) {
			return null;
		}
	}
}
