package com.cdeledu.service.impl;

import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cdeledu.model.personManage.UserInfoBean;
import com.cdeledu.service.SystemService;
@Service
@Transactional
public class SystemServiceImpl implements SystemService {

	@Override
	public Integer getAllDbTableSize() {
		return null;
	}

	@Override
	public <T> void save(T entity) {
		
	}

	@Override
	public <T> void saveOrUpdate(T entity) {
		
	}

	@Override
	public <T> void delete(T entity) {
		
	}

	@Override
	public <T> void batchSave(List<T> entitys) {
		
	}

	@Override
	public UserInfoBean checkUserExits(UserInfoBean userInfo) throws Exception {
		return null;
	}

	@Override
	public void addLog(String LogContent, Short loglevel, Short operatetype) {
		
	}

	@Override
	public Set<String> getOperationCodesByUserIdAndFunctionId(String userId, String functionId) {
		return null;
	}

	@Override
	public Set<String> getOperationCodesByRoleIdAndFunctionId(String roleId, String functionId) {
		return null;
	}

}
