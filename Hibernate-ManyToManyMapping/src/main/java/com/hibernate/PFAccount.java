package com.hibernate;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;





@Entity
@Table(name="pfaccount")
public class PFAccount {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String Name;
	private String companyname;
	
	@ManyToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	private List<Nominee> nomineeList=new ArrayList<Nominee>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
  
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getCompanyname() {
		return companyname;
	}

	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}

	public List<Nominee> getNomineeList() {
		return nomineeList;
	}

	public void setNomineeList(List<Nominee> nomineeList) {
		this.nomineeList = nomineeList;
	}

	@Override
	public String toString() {
		return "PFAccount [id=" + id + ", Name=" + Name + ", companyname=" + companyname + ", nomineeList="
				+ nomineeList + "]";
	}
	
	

}
