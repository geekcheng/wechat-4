package com.cdeledu.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cdeledu.dao.RoleDao;
import com.cdeledu.model.rbac.Role;
import com.cdeledu.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService {
	@Resource
	private RoleDao roleDao;

	@Override
	public int insertSelective(Role record) {
		return roleDao.insertSelective(record);
	}

	@Override
	public int delete(Role record) {
		return roleDao.delete(record);
	}

	@Override
	public int deleteByPrimaryKey(Object key) {
		return roleDao.deleteByPrimaryKey(key);
	}

	@Override
	public int updateByPrimaryKey(Role record) {
		return roleDao.updateByPrimaryKey(record);
	}

	@Override
	public List<Role> findForJdbc(Role record) {
		return roleDao.findForJdbc(record);
	}

	@Override
	public int getCountForJdbcParam(Role record) {
		return roleDao.getCountForJdbcParam(record);
	}

	@Override
	public Role findOneForJdbc(Role record) {
		return roleDao.findOneForJdbc(record);
	}

	@Override
	public Role selectByPrimaryKey(Object key) {
		return roleDao.selectByPrimaryKey(key);
	}

}
