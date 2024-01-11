package com.javaex.ex03;

public class Point {

	// 필드

	private int x;
	private int y;

	// 생성자

	public Point() {
		super();
	}

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	// 메소드 g/s

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	// 메소드 일반

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	/*
	public boolean equals(Object o) {
		// equals의 메소드를 새로 정의 해야함.
		// o 는 비교대상 , p00.equals(p01) 이면 p00의 메소드 equals 를 사용해서 p01과 비교
		// 본인(p00)의 x 와 o(p01) 의 x값이 같은지?, 본인의 y와 o의 y값이 같은지 -> &&(and)로 메소드를 만든다
		boolean result;
		if(this.x == setX && this.y == o.y) {
			result = true;
		} else {
			result = false;
		}
		return result;
	}
	*/

	@Override
	public boolean equals(Object obj) { // Point obj 로 지정하지 않고 Object obj 로 지정하는 이유는 부모클래스인 Object 와 기본구조가 달라지기 때문에 사용할 수 없다.
		
		Point p = (Point)obj; // obj의 값은 Object 범위 -> 강제로 Point 로 형변환해서 임의의 변수에 값을 저장
		boolean result; // return 의 결과값을 출력하기 위해 변수 지정
		
		if (this.x == p.x && this.y == p.y) {
			result = true;
			} else {
				result = false;
			}
		
		return result;
	}
	
	

}
