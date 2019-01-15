package com.zl.pojo;

import java.io.Serializable;
/**
 * 部门表实体类
 * @author 
 *
 */
public class Demp implements  Serializable {
	private static final long serialVersionUID = 2846462167024372174L;
	private Integer dNO;//编号
	private String dName;//部门名称
	@Override
	public String toString() {
		return "Demp [dNO=" + dNO + ", dName=" + dName + "]";
	}
	public Integer getdNO() {
		return dNO;
	}
	public void setdNO(Integer dNO) {
		this.dNO = dNO;
	}
	public String getdName() {
		return dName;
	}
	public void setdName(String dName) {
		this.dName = dName;
	}
	
	
}
