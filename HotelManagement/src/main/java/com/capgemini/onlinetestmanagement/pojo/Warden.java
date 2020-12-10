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
import lombok.Setter;

@Entity
@Table(name="warden")
@Data
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Warden {

	@Id
	@Column(name="wardenid")
	private long wardenId;
	@Column(name="wardenname")
	private String name;
	@Column(name="login")
	private String login;
	


	@Override
	public String toString() {
		return "Warden [wardenId=" + wardenId + ", name=" + name + ", login=" + login + "]";
	}

	public long getWardenId() {
		return wardenId;
	}

	public void setWardenId(long wardenId) {
		this.wardenId = wardenId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}



	/**
	 * @param wardenId
	 * @param name
	 * @param login
	 * @param hostelId
	 * @param user
	 * @param hostels
	 */
	public Warden(long wardenId, String name, String login) {
		super();
		this.wardenId = wardenId;
		this.name = name;
		this.login = login;
	}

	/**
	 * 
	 */
	public Warden() {
		super();
	}
	
	
}
