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
@Table(name="fee_table")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Fee {

	@Id
	@Column(name="feeid")
	private long feeId;
	private long userId;
	private String userName;
	private long hostelId;
	private String hostelName;
	private String roomName;
	private String totalFee;
	private String pay;
	private String paidFee;
	private String remainingFee;
	private long allotmentId;
	
	@OneToMany(targetEntity =Room.class, cascade = CascadeType.ALL)
	@JoinColumn(name="fee_rooms", referencedColumnName="feeid")
	private List<Room> rooms = new ArrayList<>();

	public long getFeeId() {
		return feeId;
	}

	public void setFeeId(long feeId) {
		this.feeId = feeId;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public long getHostelId() {
		return hostelId;
	}

	public void setHostelId(long hostelId) {
		this.hostelId = hostelId;
	}

	public String getHostelName() {
		return hostelName;
	}

	public void setHostelName(String hostelName) {
		this.hostelName = hostelName;
	}

	public String getRoomName() {
		return roomName;
	}

	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}

	public String getTotalFee() {
		return totalFee;
	}

	public void setTotalFee(String totalFee) {
		this.totalFee = totalFee;
	}

	public String getPay() {
		return pay;
	}

	public void setPay(String pay) {
		this.pay = pay;
	}

	public String getPaidFee() {
		return paidFee;
	}

	public void setPaidFee(String paidFee) {
		this.paidFee = paidFee;
	}

	public String getRemainingFee() {
		return remainingFee;
	}

	public void setRemainingFee(String remainingFee) {
		this.remainingFee = remainingFee;
	}

	public long getAllotmentId() {
		return allotmentId;
	}

	public void setAllotmentId(long allotmentId) {
		this.allotmentId = allotmentId;
	}

	public List<Room> getFees() {
		return rooms;
	}

	public void setFees(List<Room> fees) {
		this.rooms = fees;
	}

	public Fee(long feeId, long userId, String userName, long hostelId, String hostelName, String roomName,
			String totalFee, String pay, String paidFee, String remainingFee, long allotmentId, List<Room> fees) {
		super();
		this.feeId = feeId;
		this.userId = userId;
		this.userName = userName;
		this.hostelId = hostelId;
		this.hostelName = hostelName;
		this.roomName = roomName;
		this.totalFee = totalFee;
		this.pay = pay;
		this.paidFee = paidFee;
		this.remainingFee = remainingFee;
		this.allotmentId = allotmentId;
		this.rooms = fees;
	}

	public Fee() {
		super();
	}

	@Override
	public String toString() {
		return "Fee [feeId=" + feeId + ", userId=" + userId + ", userName=" + userName + ", hostelId=" + hostelId
				+ ", hostelName=" + hostelName + ", roomName=" + roomName + ", totalFee=" + totalFee + ", pay=" + pay
				+ ", paidFee=" + paidFee + ", remainingFee=" + remainingFee + ", allotmentId=" + allotmentId + ", rooms="
				+ rooms + "]";
	}
	
	
}
