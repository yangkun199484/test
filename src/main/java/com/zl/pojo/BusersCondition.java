package com.zl.pojo;

import java.io.Serializable;
/**
 * 
 * ǰ̨������
 */
public class BusersCondition implements  Serializable {
	
	private static final long serialVersionUID = 2438519940637412538L;
	private Integer pageIndex = 1;//
	private Integer start;//
	private Integer  end;//
	private Integer startAge;//
	private Integer endAge;//
	private String nickname;//
	private Integer dNO;//
	private Integer utId;//
	private Integer buNo;//
	
	@Override
	public String toString() {
		return "BusersCondition [start=" + start + ", end=" + end + ", startAge=" + startAge + ", endAge=" + endAge
				+ ", nickname=" + nickname + ", dNO=" + dNO + ", utId=" + utId + ", buNo=" + buNo + "]";
	}
	
	public Integer getPageIndex() {
		return pageIndex;
	}
	public void setPageIndex(Integer pageIndex) {
		this.pageIndex = pageIndex;
	}
	public Integer getStart() {
		return start;
	}
	public void setStart(Integer start) {
		this.start = start;
	}
	public Integer getEnd() {
		return end;
	}
	public void setEnd(Integer end) {
		this.end = end;
	}
	public Integer getStartAge() {
		return startAge;
	}
	public void setStartAge(Integer startAge) {
		this.startAge = startAge;
	}
	public Integer getEndAge() {
		return endAge;
	}
	public void setEndAge(Integer endAge) {
		this.endAge = endAge;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public Integer getdNO() {
		return dNO;
	}
	public void setdNO(Integer dNO) {
		this.dNO = dNO;
	}
	public Integer getUtId() {
		return utId;
	}
	public void setUtId(Integer utId) {
		this.utId = utId;
	}
	public Integer getBuNo() {
		return buNo;
	}
	public void setBuNo(Integer buNo) {
		this.buNo = buNo;
	}
	
	
	
	
}
