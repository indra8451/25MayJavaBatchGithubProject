package com.beans;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {

	private String Name;
	private List<Subject> subjectlist;
	private Set<Subject> subjectSet;
	private Map<String, Subject> subjectMap;

	//Mandatory require else give exception
	public Student() {
		
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public List<Subject> getSubjectlist() {
		return subjectlist;
	}

	public void setSubjectlist(List<Subject> subjectlist) {
		this.subjectlist = subjectlist;
	}

	public Set<Subject> getSubjectSet() {
		return subjectSet;
	}

	public void setSubjectSet(Set<Subject> subjectSet) {
		this.subjectSet = subjectSet;
	}

	public Map<String, Subject> getSubjectMap() {
		return subjectMap;
	}

	public void setSubjectMap(Map<String, Subject> subjectMap) {
		this.subjectMap = subjectMap;
	}

	public Student(String name, List<Subject> subjectlist, Set<Subject> subjectSet, Map<String, Subject> subjectMap) {
		Name = name;
		this.subjectlist = subjectlist;
		this.subjectSet = subjectSet;
		this.subjectMap = subjectMap;
	}

}
