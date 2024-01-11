package com.javaex.ex05;

public class RectangleApp {

	public static void main(String[] args) {
		
		// ppt03 - p09 연습문제 과제
		
		Rectangle a = new Rectangle(6,4);   // 24
		Rectangle b = new Rectangle(6,4);   // 24
		Rectangle c = new Rectangle(12,2);  // 24
		Rectangle d = new Rectangle(3,8);   // 24
		Rectangle e = new Rectangle(12,4);  // 48
		
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
		System.out.println(a.equals(d));
		System.out.println(a.equals(e));
		System.out.println(d.equals(e));
		
		

	}

}
