package com.builder;

public class Shop {
	public static void main(String[] args) {
//		No need to define in parameters in sequence 
		Phone p = new PhoneBuilder().setOs("Android").setRam(2).setBattery(2000).getPhone();
//		Phone p = new Phone("Android", 2,"Intel",5.5,3000);
		System.out.println(p);
	}
}
