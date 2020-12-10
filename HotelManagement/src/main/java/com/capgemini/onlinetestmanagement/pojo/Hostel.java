package com.capgemini.onlinetestmanagement.pojo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="hosteltable")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Hostel {

	@Id
	@Column(name="hostelid")
	private long hostelId;
	@Column(name="hostelname")
	private String name;
	@Column(name="hosteltype")
	private String type;
	@Column(name="contact")
	private String contact;
	@Column(name="address")
	private String address;
	@Column(name="description")
	private String description;
	@Column(name="fee")
	private String fee;
	
	
	@OneToMany(targetEntity =Warden.class, cascade = CascadeType.ALL)
	@JoinColumn(name="hostel_wardens", referencedColumnName="hostelid")
	private List<Warden> wardens = new ArrayList<>();

	
	@OneToMany(targetEntity =Application.class, cascade = CascadeType.ALL)
	@JoinColumn(name="hostel_applications", referencedColumnName="hostelid")
	private List<Application> applications = new ArrayList<>();
	
	@OneToMany(targetEntity =Room.class, cascade = CascadeType.ALL)
	@JoinColumn(name="hostel_rooms", referencedColumnName="hostelid")
	private List<Room> rooms = new ArrayList<>();

	public long getHostelId() {
		return hostelId;
	}

	public void setHostelId(long hostelId) {
		this.hostelId = hostelId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
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

	public String getFee() {
		return fee;
	}

	public void setFee(String fee) {
		this.fee = fee;
	}

	public List<Warden> getWardens() {
		return wardens;
	}

	public void setWardens(List<Warden> wardens) {
		this.wardens = wardens;
	}

	public List<Application> getApplications() {
		return applications;
	}

	public void setApplications(List<Application> applications) {
		this.applications = applications;
	}

	public List<Room> getRooms() {
		return rooms;
	}

	public void setRooms(List<Room> rooms) {
		this.rooms = rooms;
	}

	public Hostel(long hostelId, String name, String type, String contact, String address, String description,
			String fee, List<Warden> wardens, List<Application> applications, List<Room> rooms) {
		super();
		this.hostelId = hostelId;
		this.name = name;
		this.type = type;
		this.contact = contact;
		this.address = address;
		this.description = description;
		this.fee = fee;
		this.wardens = wardens;
		this.applications = applications;
		this.rooms = rooms;
	}

	public Hostel() {
		super();
	}

	@Override
	public String toString() {
		return "Hostel [hostelId=" + hostelId + ", name=" + name + ", type=" + type + ", contact=" + contact
				+ ", address=" + address + ", description=" + description + ", fee=" + fee + ", wardens=" + wardens
				+ ", applications=" + applications + ", rooms=" + rooms + "]";
	}
	
	
}
