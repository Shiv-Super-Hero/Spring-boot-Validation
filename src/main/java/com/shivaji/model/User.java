package com.shivaji.model;

import java.util.Date; 

import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class User {
	private int id;
	
	@Size(min=5,max=10,message = "Minimum 5 and Maximum 10 chars are Allowed")
	private String uname;
	
	@Size(min=8,message = "Password Should be minimum 8 chars")
	private String upwd;
	
	@Pattern(regexp = "^[a-zA-Z0-9]{3,9}$",message="Name must be 3 to 9 chars long with no special chars")
	private String name;
	
	@Min(value=15,message = "Age must be minimum 15 years")
	@Max(value=55,message = "Age must be maximum 55 years")
	private int age;
	
	@AssertTrue
	private boolean activeFlag;
	
	@Email
	private String email;
	
	@Past
	private Date birthDate;

	public User(int id, String uname, String upwd, String name, int age, boolean activeFlag, String email, Date birthDate) {
		super();
		this.id = id;
		this.uname = uname;
		this.upwd = upwd;
		this.name = name;
		this.age = age;
		this.activeFlag = activeFlag;
		this.email = email;
		this.birthDate = birthDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUpwd() {
		return upwd;
	}

	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isActiveFlag() {
		return activeFlag;
	}

	public void setActiveFlag(boolean activeFlag) {
		this.activeFlag = activeFlag;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
