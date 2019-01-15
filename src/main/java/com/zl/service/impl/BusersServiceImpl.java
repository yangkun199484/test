package com.zl.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zl.mapper.BusersMapper;
import com.zl.pojo.Busers;
import com.zl.pojo.BusersCondition;
import com.zl.pojo.PageVo;
import com.zl.service.IBusersService;
@Service
public class BusersServiceImpl implements IBusersService {
	@Autowired
	private BusersMapper busersMapper;
	
	public Busers selectALL(String name, String password) {
		return busersMapper.qureyByNameOrPassword(name,password);
	}
	
	public PageVo<Busers> selectAllUser(BusersCondition busersCondition) {
		PageVo<Busers>  pageVo = new PageVo<Busers>();
		pageVo.setPageIndex(busersCondition.getPageIndex());
		busersCondition.setStart((busersCondition.getPageIndex()-1) * pageVo.getPageSize()+1);
		busersCondition.setEnd(busersCondition.getPageIndex() * pageVo.getPageSize());
		pageVo.setTotalCount(busersMapper.getCount(busersCondition));
		pageVo.setDatas(busersMapper.qureyByFy(busersCondition));
		return pageVo;
	}
	
	public void deletBusers(Integer id) {
		busersMapper.deleteById(id);
	}

	public Busers selcetBusersId(Integer cid) {
		
		return busersMapper.qureyByUser(cid);
	}

	public void updateUser(Busers buser) {
		busersMapper.updateById(buser);
	}

	public void addBusers(Busers buser) {
		busersMapper.insertBusers(buser);
	}

	
}
