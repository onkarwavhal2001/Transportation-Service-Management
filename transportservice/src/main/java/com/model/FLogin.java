package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class FLogin 
{
	@Id
	private int farmerrId;
	private String femail;
	private String fPassword;
	public int getFarmerrId() {
		return farmerrId;
	}
	public void setFarmerrId(int farmerrId) {
		this.farmerrId = farmerrId;
	}
	public String getFemail() {
		return femail;
	}
	public void setFemail(String femail) {
		this.femail = femail;
	}
	public String getfPassword() {
		return fPassword;
	}
	public void setfPassword(String fPassword) {
		this.fPassword = fPassword;
	}
	public FLogin(int farmerrId, String femail, String fPassword) {
		super();
		this.farmerrId = farmerrId;
		this.femail = femail;
		this.fPassword = fPassword;
	}
	@Override
	public String toString() {
		return "FLogin [farmerrId=" + farmerrId + ", femail=" + femail + ", fPassword=" + fPassword + "]";
	}
	public FLogin() {
		super();
	}
	
	
	
}
