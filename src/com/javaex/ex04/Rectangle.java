package com.javaex.ex04;

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

	@Override // equals를 재정의 하기위해 부모클래스인 Object의 equals를 불러와서 재정의한다.
	public boolean equals(Object obj) {
		
		// Object obj를 저장할 주소를 생성
		
		Rectangle r = (Rectangle)obj; // obj는 Object의 메소드를 사용중이므로 강제형변환해서 Rectangle 의 메소드를 사용하게 변경한다
		boolean result; // equals 의 값이 boolean 형태로 나오므로 결과값이 나올 변수를 지정해준다
		
		// result 값이 어떻게 결과를 도출할지 메소드를 작성한다
		// width 값과 height 값이 같으면 같다라고 정의를 해야하므로 조건을 세운다
		
		if (this.width == r.width && this.height == r.height) {  // 기준으로 세운 값과 비교할 대상의 값이 같다면 , &&를 통해 두 조건 모두를 만족하게 조건문 작성
			result = true; // 조건이 맞으면 result를 true로 설정
		} else {
			result = false; // 조건이 맞지 않으면 result를 false로 설정
		}
				
		return result; // return값을 result 로 보여준다.
	}
	
	

}
