package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MLogin 
{
	@Id
	private int merchanttId;
	private String memail;
	private String mPassword;
	public int getMerchanttId() {
		return merchanttId;
	}
	public void setMerchanttId(int merchanttId) {
		this.merchanttId = merchanttId;
	}
	public String getMemail() {
		return memail;
	}
	public void setMemail(String memail) {
		this.memail = memail;
	}
	public String getmPassword() {
		return mPassword;
	}
	public void setmPassword(String mPassword) {
		this.mPassword = mPassword;
	}
	public MLogin(int merchanttId, String memail, String mPassword) {
		super();
		this.merchanttId = merchanttId;
		this.memail = memail;
		this.mPassword = mPassword;
	}
	@Override
	public String toString() {
		return "MLogin [merchanttId=" + merchanttId + ", memail=" + memail + ", mPassword=" + mPassword + "]";
	}
	public MLogin() {
		super();
	}
	
	
}

