package com.javaex.ex06;

public class Ex01 {
	
	public static void main(String[] args) {
		
		String s01 = "안녕하세요";  // 같은 값을 입력한 s01과 s02는 같은 주소를 사용하게된다.
		String s02 = "안녕하세요";  // 같은 문자열을 가진 객체를 찾아서 연결한다.
		                            // 같은게 있으면 새로 만들지 않는다
		System.out.println(s01);
		System.out.println(s02);
		
		System.out.println(s01==s02);  // 주소가 같다
		
		s01 = "안녕";
		System.out.println(s01==s02);
		
		System.out.println(s01); // s01 을 바꾸면 주소를 새로 저장한다.
		System.out.println(s02); // s02와 s01이 같은 주소를 쓰다가 s01이 바뀌면 s02가 그 주소를 사용한다
		
		String s03 = new String("하이");
		String s04 = new String("하이");
		// 같은 값을 입력했지만 new String 으로 작성하게되면 각각의 주소값을 가지게 된다.
		
		System.out.println(s03==s04);
		
		
		
	}

}
