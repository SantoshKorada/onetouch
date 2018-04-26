package com.onetouch.models;

import com.fasterxml.jackson.annotation.JsonInclude;

/*
 * This is the Enity for Registration 
 * Table : ot_registration
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RegistrationModel {
	private int sno;
	private String first_name;
	private String last_name;
	private String dob;
	private String phone_no;
	private String email_id;
	private String role;
	private String profile_pic;
	private String password;

	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getPhone_no() {
		return phone_no;
	}

	public void setPhone_no(String phone_no) {
		this.phone_no = phone_no;
	}

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getProfile_pic() {
		return profile_pic;
	}

	public void setProfile_pic(String profile_pic) {
		this.profile_pic = profile_pic;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "RegistrationModel [sno=" + sno + ", first_name=" + first_name + ", last_name=" + last_name + ", dob="
				+ dob + ", phone_no=" + phone_no + ", email_id=" + email_id + ", role=" + role + ", profile_pic="
				+ profile_pic + ", password=" + password + "]";
	}

}
