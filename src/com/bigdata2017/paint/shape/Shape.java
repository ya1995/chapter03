package com.bigdata2017.paint.shape;

import com.bigdata2017.paint.main.i.Drawable;

// 추상 메소드를 가지고 있는 클래스는 추상클래스가 됨
public abstract class Shape implements Drawable {
	private String fillColor;
	private String lineColor;
	
	public String getFillColor() {
		return fillColor;
	}

	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}

	public String getLineColor() {
		return lineColor;
	}

	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}
	
	// 각 모양마다 넓이를 구하는 방법이 다르기 때문에 부모 클래스에서 구현하기가 힘듦
	public abstract int calcArea();
}
