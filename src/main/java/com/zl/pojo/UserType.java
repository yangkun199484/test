package com.zl.pojo;

import java.io.Serializable;

public class UserType implements Serializable {
	private static final long serialVersionUID = 9003927452218371601L;
	private Integer tId;//Ȩ��Id
	private String  tName;//Ȩ����
	@Override
	public String toString() {
		return "UserType [tId=" + tId + ", tName=" + tName + "]";
	}
	public Integer gettId() {
		return tId;
	}
	public void settId(Integer tId) {
		this.tId = tId;
	}
	public String gettName() {
		return tName;
	}
	public void settName(String tName) {
		this.tName = tName;
	}
	
}
