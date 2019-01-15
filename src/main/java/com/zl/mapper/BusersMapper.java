package com.zl.mapper;

import java.util.List;

import com.zl.pojo.Busers;
import com.zl.pojo.BusersCondition;

public interface BusersMapper {
	//��¼
	Busers qureyByNameOrPassword(String name, String password);
	//�ܼ�¼
	Integer getCount(BusersCondition busersCondition);
	//��ҳ
	List<Busers> qureyByFy(BusersCondition busersCondition);
	//ɾ��
	void deleteById(Integer id);
	//�鿴
	Busers qureyByUser(Integer cid);
	//����
	void updateById(Busers buser);
	//ע��
	void insertBusers(Busers buser);
	

}
