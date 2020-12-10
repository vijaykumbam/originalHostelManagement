package com.capgemini.onlinetestmanagement.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="user_table")
public class UserEntity {

	@Id
	@Column(name="userid")
	private long userId;
	private String fname;
	private String lname;
	private String login;
	private String password;
	private String confirmPassword;
	private Date dob;
	private long mobileNo;
	private String gender;
	private String image;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="roleid")
	private Role role;
	
	@OneToMany(targetEntity =Warden.class, cascade = CascadeType.ALL)
	@JoinColumn(name="user_wardens", referencedColumnName="userid")
	private List<Warden> wardens = new ArrayList<>();

	
	@OneToMany(targetEntity =Application.class, cascade = CascadeType.ALL)
	@JoinColumn(name="user_applications", referencedColumnName="userid")
	private List<Application> applications = new ArrayList<>();
	
	
	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public List<Warden> getWardens() {
		return wardens;
	}

	public void setWardens(List<Warden> wardens) {
		this.wardens = wardens;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public List<Application> getApplications() {
		return applications;
	}

	public void setApplications(List<Application> applications) {
		this.applications = applications;
	}



	public UserEntity(long userId, String fname, String lname, String login, String password, String confirmPassword,
			Date dob, long mobileNo, String gender, String image, Role role, List<Warden> wardens,
			List<Application> applications) {
		super();
		this.userId = userId;
		this.fname = fname;
		this.lname = lname;
		this.login = login;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.dob = dob;
		this.mobileNo = mobileNo;
		this.gender = gender;
		this.image = image;
		this.role = role;
		this.wardens = wardens;
		this.applications = applications;
	}

	public UserEntity() {
		super();
	}

	@Override
	public String toString() {
		return "UserEntity [userId=" + userId + ", fname=" + fname + ", lname=" + lname + ", login=" + login
				+ ", password=" + password + ", confirmPassword=" + confirmPassword + ", dob=" + dob + ", mobileNo="
				+ mobileNo + ", gender=" + gender + ", image=" + image + ", role=" + role + ", wardens=" + wardens
				+ ", applications=" + applications + "]";
	}



	
	
}
