package com.Factory;

public class CoursesFactory {
	public Courses getInstance(String str) {
		if(str.equals("innovation")) {
			return new BSc();
		}
		else if(str.equals("money")) {
			return new BCom();
		}
		else {
			return new BA();
		}
		
	}
}
