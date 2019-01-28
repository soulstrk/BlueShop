package com.soul.skid.join.vo;

import java.sql.Date;

public class MembersVO {
	
	private String mbId;
	
	private String mbPwd;
	
	private String mbNm;
	
	private String ptn;
	
	private String mbAddr;
	
	private String dtlAddr;
	
	private String phone;
	
	private String email;
	
	private Integer mbPnt;
	
	private String gender;
	
	private Date mbRegdate;
	
	public MembersVO() {}

	public MembersVO(String mbId, String mbPwd, String mbNm, String ptn, String mbAddr, String dtlAddr, String phone,
			String email, Integer mbPnt, String gender, Date mbRegdate) {
		super();
		this.mbId = mbId;
		this.mbPwd = mbPwd;
		this.mbNm = mbNm;
		this.ptn = ptn;
		this.mbAddr = mbAddr;
		this.dtlAddr = dtlAddr;
		this.phone = phone;
		this.email = email;
		this.mbPnt = mbPnt;
		this.gender = gender;
		this.mbRegdate = mbRegdate;
	}

	public String getMbId() {
		return mbId;
	}

	public void setMbId(String mbId) {
		this.mbId = mbId;
	}

	public String getMbPwd() {
		return mbPwd;
	}

	public void setMbPwd(String mbPwd) {
		this.mbPwd = mbPwd;
	}

	public String getMbNm() {
		return mbNm;
	}

	public void setMbNm(String mbNm) {
		this.mbNm = mbNm;
	}

	public String getPtn() {
		return ptn;
	}

	public void setPtn(String ptn) {
		this.ptn = ptn;
	}

	public String getMbAddr() {
		return mbAddr;
	}

	public void setMbAddr(String mbAddr) {
		this.mbAddr = mbAddr;
	}

	public String getDtlAddr() {
		return dtlAddr;
	}

	public void setDtlAddr(String dtlAddr) {
		this.dtlAddr = dtlAddr;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getMbPnt() {
		return mbPnt;
	}

	public void setMbPnt(Integer mbPnt) {
		this.mbPnt = mbPnt;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getMbRegdate() {
		return mbRegdate;
	}

	public void setMbRegdate(Date mbRegdate) {
		this.mbRegdate = mbRegdate;
	}

	@Override
	public String toString() {
		return "MembersVO [mbId=" + mbId + ", mbPwd=" + mbPwd + ", mbNm=" + mbNm + ", ptn=" + ptn + ", mbAddr=" + mbAddr
				+ ", dtlAddr=" + dtlAddr + ", phone=" + phone + ", email=" + email + ", mbPnt=" + mbPnt + ", gender="
				+ gender + ", mbRegdate=" + mbRegdate + "]";
	}
	
}
