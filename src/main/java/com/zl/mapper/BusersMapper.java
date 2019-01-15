package com.zl.mapper;

import java.util.List;

import com.zl.pojo.Busers;
import com.zl.pojo.BusersCondition;

public interface BusersMapper {
	//登录
	Busers qureyByNameOrPassword(String name, String password);
	//总记录
	Integer getCount(BusersCondition busersCondition);
	//分页
	List<Busers> qureyByFy(BusersCondition busersCondition);
	//删除
	void deleteById(Integer id);
	//查看
	Busers qureyByUser(Integer cid);
	//更新
	void updateById(Busers buser);
	//注册
	void insertBusers(Busers buser);
	

}
