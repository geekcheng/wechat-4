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
	public UserInfoBean checkUserExits(UserInfoBean userInfo) throws Exception {
		return null;
	}

	@Override
	public void addLog(String LogContent, Short loglevel, Short operatetype) {

	}

	@Override
	public Set<String> getOperationCodesByUserIdAndFunctionId(Integer userId, Integer functionId) {
		return null;
	}

	@Override
	public Set<String> getOperationCodesByRoleIdAndFunctionId(Integer roleId, Integer functionId) {
		return null;
	}

	@Override
	public Integer getAuthByuserIdAndAuthPath(Integer userId, String requestPath) {
		return null;
	}

}
