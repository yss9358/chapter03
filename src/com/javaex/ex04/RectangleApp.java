package com.javaex.ex04;

public class RectangleApp {

	public static void main(String[] args) {
		
		// ppt03 - 8p 연습문제
		
		Rectangle a = new Rectangle(6,4);
		Rectangle b = new Rectangle(6,4);
		Rectangle c = new Rectangle(12,2);
		
		System.out.println("==equals()값 비교");
		// 각각의 width, height 값이 같으면 같은것으로 정의 
		// equals를 재정의 해야함.
		System.out.println(a.equals(b)); // a와 b의 width 값, height 값이 같으므로 true가 출력
		System.out.println(a.equals(c)); // a와 c의 width 값, height 값이 다르므로 false가 출력
		

	}

}
