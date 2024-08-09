package com.hibernate;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="nominee")
public class Nominee {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column(name="Nomineename")
	private String name;
	
	@ManyToMany(mappedBy="nomineeList",cascade=CascadeType.ALL)
	private List<PFAccount> pfaccountlist=new ArrayList<PFAccount>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<PFAccount> getPfaccountlist() {
		return pfaccountlist;
	}

	public void setPfaccountlist(List<PFAccount> pfaccountlist) {
		this.pfaccountlist = pfaccountlist;
	}

	@Override
	public String toString() {
		return "Nominee [id=" + id + ", name=" + name + ", pfaccountlist=" + pfaccountlist + "]";
	}
	
	
}
