package com.Factory;

public class CoursesMain {
	public static void main(String[] args) {
		CoursesFactory csf = new CoursesFactory();
		Courses course = csf.getInstance("money");
		course.modules();
		
	}
}
