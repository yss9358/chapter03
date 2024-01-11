package com.javaex.ex03;

public class PointApp {

	public static void main(String[] args) {
		
		Point p00 = new Point(3,5);
		Point p01 = new Point(3,5);
		Point p02 = new Point(13,15);
		Point p03 = p02;
		
		System.out.println(p00.equals(p01)); // p00의 메소드 equals 를 사용 -> true로 나옴
		System.out.println(p00==p01);        // p00과 p01의 주소가 같은지 물어보는거
		
		System.out.println(p01.equals(p02)); // equals 사용은 메소드를 통해 비교 
		System.out.println(p03.equals(p02)); // p03은 p02의 주소를 대입한 것 -> true로 나온다.
		
	}

}
