package com.cdeledu.service.impl;

import java.util.Set;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cdeledu.model.personManage.UserInfoBean;
import com.cdeledu.service.SystemService;

@Service
@Transactional
public class SystemServiceImpl implements SystemService {

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
