package com.zl.pojo;

import java.io.Serializable;
import java.util.List;

public class PageVo<T> implements Serializable {
	private static final long serialVersionUID = 5597253675454781675L;
	private  Integer pageIndex;
	private  Integer pageSize = 3;
	private  Integer totalCount;
	private  Integer  totalPage;
	private  List<T>  datas;
	@Override
	public String toString() {
		return "PageVo [pageIndex=" + pageIndex + ", pageSize=" + pageSize + ", totalCount=" + totalCount
				+ ", totalPage=" + totalPage + ", datas=" + datas + "]";
	}
	public Integer getPageIndex() {
		return pageIndex;
	}
	public void setPageIndex(Integer pageIndex) {
		this.pageIndex = pageIndex;
	}
	public Integer getPageSize() {
		return pageSize;
	}
	public Integer getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}
	public Integer getTotalPage() {
		int temp =totalCount / pageSize;
		return  totalCount % pageSize == 0 ? temp : temp+1;
	}
	public List<T> getDatas() {
		return datas;
	}
	public void setDatas(List<T> datas) {
		this.datas = datas;
	}
	
	
}
