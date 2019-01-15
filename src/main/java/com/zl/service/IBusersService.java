
package com.zl.service;

import com.zl.pojo.Busers;
import com.zl.pojo.BusersCondition;
import com.zl.pojo.PageVo;

public interface IBusersService {
	//登录
	Busers selectALL(String name, String password);
	//分页
	PageVo<Busers> selectAllUser(BusersCondition busersCondition);
	//删除
	void deletBusers(Integer id);
	//查看
	Busers selcetBusersId(Integer cid);
	//更新
	void updateUser(Busers buser);
	//注册
	void addBusers(Busers buser);

}
