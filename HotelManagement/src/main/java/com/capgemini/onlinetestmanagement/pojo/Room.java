package com.capgemini.onlinetestmanagement.pojo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="room_table")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Room {

	@Id
	@Column(name="roomid")
	private long roomId;
	@Column(name="roomNo")
	private String roomNo;
	@Column(name="hid")
	private long hostelId;
	@Column(name="description")
	private String description;
	
	@OneToMany(targetEntity =Allotment.class, cascade = CascadeType.ALL)
	@JoinColumn(name="room_allotments", referencedColumnName="roomid")
	private List<Allotment> allotments = new ArrayList<>();

	public long getRoomId() {
		return roomId;
	}

	public void setRoomId(long roomId) {
		this.roomId = roomId;
	}

	public String getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(String roomNo) {
		this.roomNo = roomNo;
	}

	public long getHostelId() {
		return hostelId;
	}

	public void setHostelId(long hostelId) {
		this.hostelId = hostelId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Allotment> getAllotments() {
		return allotments;
	}

	public void setAllotments(List<Allotment> allotments) {
		this.allotments = allotments;
	}

	@Override
	public String toString() {
		return "Room [roomId=" + roomId + ", roomNo=" + roomNo + ", hostelId=" + hostelId + ", description="
				+ description + ", allotments=" + allotments + "]";
	}

	public Room(long roomId, String roomNo, long hostelId, String description, List<Allotment> allotments) {
		super();
		this.roomId = roomId;
		this.roomNo = roomNo;
		this.hostelId = hostelId;
		this.description = description;
		this.allotments = allotments;
	}

	public Room() {
		super();
	}
	
	
}
