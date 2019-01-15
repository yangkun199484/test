package com.zl.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zl.pojo.Demp;
import com.zl.service.IDempService;
import com.zl.mapper.DempMapper;
@Service
public class DempServiceImpl implements IDempService {
	@Autowired
	private DempMapper  DempMapper;
	
	public List<Demp> selectAll() {
		return DempMapper.qureyByAll();
	}

}
