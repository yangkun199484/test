package com.zl.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zl.mapper.UserTypeMapper;
import com.zl.pojo.UserType;
import com.zl.service.IUserTypeService;
@Service
public class UserTypeServiceImpl implements IUserTypeService {
	@Autowired
	private  UserTypeMapper userTypeMapper;
	
	public List<UserType> selectAll() {
		
		return userTypeMapper.qureyAllBy();
	}

}
