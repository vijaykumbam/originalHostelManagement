package com.capgemini.onlinetestmanagement.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="roles")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Role {

	@Id
	@Column(name="roleid")
	private long roleid;
	@Column(name="name")
	private String name;
	@Column(name="description")
	private String description;
	

	
	
	public long getRoleid() {
		return roleid;
	}
	public void setRoleid(long roleid) {
		this.roleid = roleid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	

	
	
	public Role(long roleid, String name, String description) {
		super();
		this.roleid = roleid;
		this.name = name;
		this.description = description;
	}
	public Role() {
		super();
	}
	
	@Override
	public String toString() {
		return "Role [roleid=" + roleid + ", name=" + name + ", description=" + description +  "]";
	}

	
	
	
}
