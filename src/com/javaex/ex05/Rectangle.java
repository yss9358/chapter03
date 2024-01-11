package com.javaex.ex05;

public class Rectangle {

	// 필드

	private int width;
	private int height;

	// 생성자

	public Rectangle() {
		super();
	}

	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}

	// 메소드 g/s

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	// 메소드 일반

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}

	public int area() { // 면적을 구하는 메소드 작성
		 return width * height;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		// 구해지는 면적이 같으면 같은 것으로 정의하는 메소드 작성
		Rectangle r = (Rectangle)obj; // obj 받은 값을 Rectangle로 강제 형변환해서 r 주소값에 담음
		boolean result; // 결과값으로 나올 boolean 을 result로 정의
		
		if (this.area() == r.area()) { // 선택한 변수의 area 값과 비교할 대상의 area 값이 같으면 이라는 조건문 작성
			result = true;  // area값이 같으면 true 로 출력
		} else {
			result = false; // area값이 다르면 false 로 출력
		}
				
		return result; // 결과값을 result 로 출력
	}
	
	

}
