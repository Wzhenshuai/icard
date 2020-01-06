
package com.icard.common.core.dao;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * DAO支持类实现
 * @author
 * @version 2014-05-16
 * @param <T>
 */
public interface CrudDao<T> {

	/**
	 * 获取单条数据
	 * @param id
	 * @return
	 */
	public T get(String id);

	public T getByIntId(Integer id);

	public T getByLongId(Long id);

	public T getBean(T entity);
	
	/**
	 * 查询数据列表，如果需要分页，请设置分页对象，如：entity.setPage(new Page<T>());
	 * @param entity
	 * @return
	 */
	public List<T> findList(T entity);
	
	/**
	 * 查询所有数据列表
	 * @param entity
	 * @return
	 */
	public List<T> findAllList(T entity);

	
	/**
	 * 插入数据
	 * @param entity
	 * @return
	 */
	public int insert(T entity);

	public int insertList(@Param("paramList") List<T> paramList);

	/**
	 * 更新数据
	 * @param entity
	 * @return
	 */
	public int update(T entity);
	
	/**
	 * 删除数据（一般为逻辑删除，更新del_flag字段为1）
	 * @param id
	 * @see public int delete(T entity)
	 * @return
	 */
	@Deprecated
	public int delete(Long id);

	public int delete(T entity);
	
}