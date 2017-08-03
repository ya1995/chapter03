package com.bigdata2017.paint.shape;

public class Rectangle extends Shape  {
	private int x1;
	private int y1;
	private int x2;
	private int y2;
	
	// draw지우면 오류남
	// Shape을 상속받았는데 draw는 추상메소드이기 때문에 반드시 구현해야함
	@Override
	public void draw() {
		System.out.println( "사각형을 그렸습니다." );
	}
	
	// Shape에서 추상메소드를 상속받았으니까 구현해야함
	@Override
	public int calcArea() {
		return ( x2-x1 ) * ( y2-y1 );
	}
	
	
	
	
}
