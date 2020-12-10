package com.capgemini.onlinetestmanagement.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="application")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Application {

	@Id
	@Column(name="applicationid")
	private Long applicationId;
	@Column(name="name")
	private String name;
	@Column(name="hostelName")
	private String hostelName;
	@Column(name="qualification")
	private String qualification;
	@Column(name="address")
	private String address;
	@Column(name="description")
	private String description;
	
	
	public Long getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(Long applicationId) {
		this.applicationId = applicationId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHostelName() {
		return hostelName;
	}

	public void setHostelName(String hostelName) {
		this.hostelName = hostelName;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


	/**
	 * @param applicationId
	 * @param name
	 * @param hostelId
	 * @param hostelName
	 * @param qualification
	 * @param address
	 * @param description
	 * @param user
	 * @param hostel
	 */
	public Application(Long applicationId, String name, String hostelName, String qualification,
			String address, String description) {
		super();
		this.applicationId = applicationId;
		this.name = name;
		this.hostelName = hostelName;
		this.qualification = qualification;
		this.address = address;
		this.description = description;
	}

	/**
	 * 
	 */
	public Application() {
		super();
	}

	@Override
	public String toString() {
		return "Application [applicationId=" + applicationId + ", name=" + name + ", hostelId="
	+ hostelName + ", qualification=" + qualification + ", address=" + address
				+ ", description=" + description +  "]";
	}
	
	
}
