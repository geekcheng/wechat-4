package com.cdeledu.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cdeledu.model.rbac.Role;
import com.cdeledu.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService {

	@Override
	public int insertSelective(Role record) {
		return 0;
	}

	@Override
	public int delete(Role record) {
		return 0;
	}

	@Override
	public int deleteByPrimaryKey(Object key) {
		return 0;
	}

	@Override
	public int updateEntitie(Role record) {
		return 0;
	}

	@Override
	public int updateByPrimaryKey(Role record) {
		return 0;
	}

	@Override
	public List<Role> findForJdbc(Role record) {
		return null;
	}

	@Override
	public int getCountForJdbcParam(Role record) {
		return 0;
	}

	@Override
	public Role findOneForJdbc(Role record) {
		return null;
	}

	@Override
	public Role selectByPrimaryKey(Object key) {
		return null;
	}

}
