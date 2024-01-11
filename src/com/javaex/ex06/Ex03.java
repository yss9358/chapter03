package com.javaex.ex06;

public class Ex03 {

	public static void main(String[] args) {
		
		int a = 3; // 문제없음
		System.out.println(a);
		
		Integer i = new Integer(5);
		System.out.println(i.toString());
		
		Integer sum = new Integer(3) + new Integer(3);
		System.out.println(sum.toString());
		
		Integer v01 = 3;
		System.out.println(v01.toString()); //박싱
		
		int v02 = i;
		System.out.println(v02); // 언박싱
		
		System.out.println("----------------------");
		
		// parseInt
		// 문자열을 정수로 바꾸어줌 -> "12345" 면 " " 를 떼고 int 12345가 됨
		// parseInt 는 static 으로 사용됨 -> Integer.parseInt() 를 사용가능
		// 
		
		Integer r01 = 100;
		int result = r01.parseInt("1234567");
		System.out.println(result + 3);
		
		
		int result2 = Integer.parseInt("12345");
		System.out.println(result2);
		
		// valueOf
		// 정수를 문자열로 바꾸어줌 -> 555를 치면 String 555가 됨
		// valueOf 는 static 으로 사용됨 -> String.valueOf() 를 사용가능
		
		String str = "안녕하세요";
		String result3 = str.valueOf(555);
		System.out.println(result3 + 2);
		
		
		// 정수 -> 문자열
		String result4 = String.valueOf(555);
		System.out.println(result4 + 5);
		
		System.out.println("-----------------");
		
		// parseInt 는 자주 사용
		// valueOf 대신 result5번 같이 ""(빈공간) + 555(정수) 을 적어서 문자열로 만듬
		// 문자열 + 정수 는 문자열이 됨
		
		String result5 = "" + 555;
		System.out.println(result5 + 5);
		

	}

}
