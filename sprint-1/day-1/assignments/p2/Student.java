package com.masai.p2;

public abstract class Student {
	int rollNo;
	 String name;
	String state;
	public Student(int rollNo, String name, String state) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.state = state;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", state=" + state + "]";
	}

}
