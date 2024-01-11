package com.javaex.ex06;

public class Ex02 {

	public static void main(String[] args) {
		
		String a = new String("_abcd");
		String b = new String(",efg- ");
		
		/*
		System.out.println(a.concat(b));
		System.out.println(b.concat(a));
		System.out.println(a+b);
		*/
		
		System.out.println(a.concat(b));
		System.out.println(a);
		 
		a = a.concat(b);
		System.out.println(a);
		
		a = a.trim();
		System.out.println(a);
		
		a = a.replace("ab","12");
		System.out.println(a);
		
		System.out.println("-----------------");
		
		a.split(",");
		
		String[] strArray = new String[2];
		
		System.out.println("----------------------------");
		
		String s01 = new String("안녕");
		String s02 = new String("안녕");
		
		// s01 == s02 의 의미는 s01과 s02 의 주소가 같은지 물어보는것
		if (s01 == s02) { 
			System.out.println("주소가 같음");
		} else {
			System.out.println("주소가 다름");
		}
		
		// s01.equals(s02) 의 의미는 s01과 s02의 내용이 같은지(글자가 같은지)물어보는것
		if(s01.equals(s02)) {
			System.out.println("글자 같음");
		} else {
			System.out.println("글자 다름");
		}
		
		System.out.println("---------------------------");
		
		String s03 = "안녕";
		// 
		if(s03.equals("안녕")) {
			// 가끔 s03 에 주소가 안들어와서 null 오류가 날 수 있다 
			// 따라서 If("안녕".equals(s03)) 으로 작성하면 if문은 실행이 되지 않지만 null 오류는 일어나지 않는다.
		} 
	}

}