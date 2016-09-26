package com.cdeledu.dao;

import java.util.List;

/**
 * @类描述: dao层基础接口
 * @创建者: 皇族灬战狼
 * @创建时间: 2016年9月26日 上午9:50:33
 * @版本: V1.0
 * @since: JDK 1.7
 * @param <T>
 */
public interface BaseDao<T> {
	/**
	 * 根据实体类不为null的字段进行查询,条件全部使用=号and条件
	 */
	List<T> findForJdbc(T record);

	/**
	 * 根据实体类不为null的字段查询总数,条件全部使用=号and条件
	 */
	int getCountForJdbcParam(T record);

	/**
	 * 查询,必须保证结果唯一
	 */
	T findOneForJdbc(T record);

	/**
	 * 根据主键进行查询,必须保证结果唯一<br/>
	 * 单个字段做主键时,可以直接写主键的值<br/>
	 * 联合主键时,key可以是实体类,也可以是Map
	 */
	T selectByPrimaryKey(Object key);

	/**
	 * 插入一条数据 <br/>
	 * 支持Oracle序列,UUID,类似Mysql的INDENTITY自动增长(自动回写)<br/>
	 * 优先使用传入的参数值,参数值空时,才会使用序列、UUID,自动增长
	 */
	int insertSelective(T record);

	/**
	 * 根据实体类中字段不为null的条件进行删除,条件全部使用=号and条件
	 */
	int delete(T key);

	/**
	 * 通过主键进行删除,这里最多只会删除一条数据 <br/>
	 * 单个字段做主键时,可以直接写主键的值 <br/>
	 * 联合主键时,key可以是实体类,也可以是Map
	 */
	int deleteByPrimaryKey(Object key);

	/**
	 * 根据主键进行更新,这里最多只会更新一条数据 <br/>
	 * 参数为实体类
	 */
	int updateByPrimaryKey(T record);
}
