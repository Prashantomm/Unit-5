package com.masai.p2;

public class CollegeStudent extends Student {
	String universityName;

	public CollegeStudent(int rollNo, String name, String state, String universityName) {
		super(rollNo, name, state);
		this.universityName = universityName;
		// TODO Auto-generated constructor stub
	}
	@Override
    public String toString() {
        return super.toString() + ", University Name: " + universityName;
    }

}
