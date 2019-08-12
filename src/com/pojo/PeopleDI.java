package com.pojo;

public class PeopleDI {

	private Teacher teacher;
	
	public PeopleDI() {
		super();
	}

	public PeopleDI(Teacher teacher) {
		super();
		this.teacher = teacher;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	@Override
	public String toString() {
		return "PeopleDI [teacher=" + teacher + "]";
	}
	
}
