package com.hibernate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "policy")
public class Policy {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private int policyId;
	private String status;
	private String type;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "Userid", referencedColumnName = "id")
	private User user;

	// No-argument constructor
	public Policy() {
	}

	// Parameterized constructor
	public Policy(int policyId, String status, String type, User user) {
		this.policyId = policyId;
		this.status = status;
		this.type = type;
		this.user = user;
	}

}
