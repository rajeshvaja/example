package com.rajesh.string.example;

public class StringExample {

	public static void main(String[] args) {
		
		String s1 = new String("rajesh");
		String s2 = "rajesh";
		String s3 = "rajesh";

		System.out.println(s1.equals(s2));
		System.out.println(s3.equals(s2));
		System.out.println(s1.equals(s2));
		
		System.out.println(s1 == s2);
		System.out.println(s3 == s2);
	}

}
