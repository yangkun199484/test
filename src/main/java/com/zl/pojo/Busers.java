package com.zl.pojo;
/**
 * Ա����ʵ����
 *
 */

import java.io.Serializable;
import java.util.Date;

public class Busers implements  Serializable{
	private static final long serialVersionUID = -2187542993016309252L;
	private Integer buNo;//Ա�����
	private String userName;//�û���
	private String password;//����
	private String nickname;//�ǳ�
	private Integer busersType;//״̬
	private String  name;//����
	private String sex;//�Ա�
	private Integer age;//����
	private Integer dpNo;//���ű��
	private Integer  utId;//Ȩ��id
	private Date  startTime;//����ʱ��
	private Date endTime;//����ʱ��
	
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
