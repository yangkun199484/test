
package com.zl.service;

import com.zl.pojo.Busers;
import com.zl.pojo.BusersCondition;
import com.zl.pojo.PageVo;

public interface IBusersService {
	//��¼
	Busers selectALL(String name, String password);
	//��ҳ
	PageVo<Busers> selectAllUser(BusersCondition busersCondition);
	//ɾ��
	void deletBusers(Integer id);
	//�鿴
	Busers selcetBusersId(Integer cid);
	//����
	void updateUser(Busers buser);
	//ע��
	void addBusers(Busers buser);

}
