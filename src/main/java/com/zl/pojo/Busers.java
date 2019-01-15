package com.zl.pojo;
/**
 * 员工表实体类
 *
 */

import java.io.Serializable;
import java.util.Date;

public class Busers implements  Serializable{
	private static final long serialVersionUID = -2187542993016309252L;
	private Integer buNo;//员工编号
	private String userName;//用户名
	private String password;//密码
	private String nickname;//昵称
	private Integer busersType;//状态
	private String  name;//姓名
	private String sex;//性别
	private Integer age;//年龄
	private Integer dpNo;//部门编号
	private Integer  utId;//权限id
	private Date  startTime;//创建时间
	private Date endTime;//更新时间
	
	@Override
	public String toString() {
		return "Busers [buNo=" + buNo + ", userName=" + userName + ", password=" + password + ", nickname=" + nickname
				+ ", busersType=" + busersType + ", name=" + name + ", sex=" + sex + ", age=" + age + ", dpNo=" + dpNo
				+ ", utId=" + utId + ", startTime=" + startTime + ", endTime=" + endTime + "]";
	}
	public Integer getBuNo() {
		return buNo;
	}
	public void setBuNo(Integer buNo) {
		this.buNo = buNo;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public Integer getBusersType() {
		return busersType;
	}
	public void setBusersType(Integer busersType) {
		this.busersType = busersType;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Integer getDpNo() {
		return dpNo;
	}
	public void setDpNo(Integer dpNo) {
		this.dpNo = dpNo;
	}
	public Integer getUtId() {
		return utId;
	}
	public void setUtId(Integer utId) {
		this.utId = utId;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	
	
}
