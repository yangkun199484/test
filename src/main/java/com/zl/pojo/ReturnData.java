package com.zl.pojo;

import java.io.Serializable;

public class ReturnData implements Serializable {
	private static final long serialVersionUID = -6714599700776319539L;
	private  String  start;
	private  String  msg;
	@Override
	public String toString() {
		return "ReturnData [start=" + start + ", msg=" + msg + "]";
	}
	public String getStart() {
		return start;
	}
	public void setStart(String start) {
		this.start = start;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	

}
