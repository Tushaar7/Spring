package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="comp")
public class Company {

	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="cname")
	private String cname;
	
	@Column(name="soft")
	private String soft;
	
	@Column(name="telephone")
	private String telephone;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getCname() {
		return cname;
	}
	
	public void setCname(String cname) {
		this.cname = cname;
	}
	
	public String getSoft() {
		return soft;
	}
	
	public void setSoft(String soft) {
		this.soft = soft;
	}
	
	public String getTelephone() {
		return telephone;
	}
	
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
}
