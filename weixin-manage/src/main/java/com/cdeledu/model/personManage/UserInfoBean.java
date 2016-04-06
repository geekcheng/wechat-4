package com.cdeledu.model.personManage;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.springmodules.validation.bean.conf.loader.annotation.handler.Email;

/**
 * 
 * @类描述: 系统用户表
 *       <ul>
 *       <li>RBAC（Role-Based Access Control:基于角色的访问控制）</li>
 *       <li>用户信息实体类</li>
 *       <ul>
 * @创建者: 独泪了无痕--duleilewuhen@sina.com
 * @创建日期: 2015-8-23 下午08:34:19
 * @版本: V1.2
 * @since: JDK 1.7
 */
@Entity
@Table(name = "t_system_user")
@PrimaryKeyJoinColumn(name = "id")
public class UserInfoBean implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer id;
	// 昵称
	private String nickName;
	// 真实名称
	private String RealName;
	// 身份证号
	private String idCard;
	// 性别(0:男;1：女)
	private int sex;
	// 头像
	private String headImage;
	// 市
	private String city;
	// 省(自治区)
	private String province;
	// 国家
	private String country;
	// 电子邮箱
	@Email
	private String email;
	// 学历
	private String education;
	// 工作经验
	private String experience;
	// 生日
	private Date birthday;
	// 地址
	private String address;
	// 电话号码
	private String tel;
	// 手机号码
	private String mobilePhone;
	/**
	 * 是否删除<br>
	 * 只有超级管理员才能够物理删除数据,而一般管理员只能逻辑删除<br>
	 * -1:被删除;-2:被锁定;0:正常用户
	 */
	private int delState = Integer.valueOf(0);
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getRealName() {
		return RealName;
	}
	public void setRealName(String realName) {
		RealName = realName;
	}
	public String getIdCard() {
		return idCard;
	}
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public String getHeadImage() {
		return headImage;
	}
	public void setHeadImage(String headImage) {
		this.headImage = headImage;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getMobilePhone() {
		return mobilePhone;
	}
	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}
	public int getDelState() {
		return delState;
	}
	public void setDelState(int delState) {
		this.delState = delState;
	}
}
