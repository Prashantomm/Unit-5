package com.masai.p2;

public class SchoolStudent extends Student {
	String boardName;

	public SchoolStudent(int rollNo, String name, String state,String boardName) {
		super(rollNo, name, state);
		// TODO Auto-generated constructor stub
		this.boardName = boardName;
	}
	@Override
    public String toString() {
        return super.toString() + ", Board Name: " + boardName;
    }

}
