package com.cdeledu.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cdeledu.dao.BaseDao;

@Service
@Transactional
public class UserServiceImpl {
	/** ----------------------------------------------------- Fields start */
	@Resource
	private BaseDao<?> dao;

	/** ----------------------------------------------------- Fields end */
}
