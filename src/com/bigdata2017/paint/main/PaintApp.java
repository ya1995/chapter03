package com.bigdata2017.paint.main;

import java.util.ArrayList;

import com.bigdata2017.paint.main.i.Drawable;
import com.bigdata2017.paint.main.i.Resizable;
import com.bigdata2017.paint.point.ColorPoint;
import com.bigdata2017.paint.point.Point;
import com.bigdata2017.paint.shape.Circle;
import com.bigdata2017.paint.shape.Rectangle;
import com.bigdata2017.paint.shape.Shape;
import com.bigdata2017.paint.shape.Triangle;

public class PaintApp {
	public static void main(String [] args) {
		Point point1 = new Point( 100, 50 );
		/*point1.setX( 100 );
		point1.setY( 50 );*/
		
		point1.show( false );
		
		draw( new Point( 200, 200 ) ) ;
		// 자식클래스로도 참조가 가능
		draw( new ColorPoint( 300, 100, "red" ) );
		draw( new ColorPoint( 200, 200, "yellow" ) );
		
		// Shape
		/*	Shape triangle = new Triangle();
			triangle.draw();
		*/
		draw( new Triangle() );
		draw( new Rectangle() );
		draw( new Circle( 10, 20, 5 ) );
		
		//anonymous class object
		Point[] points = new Point[10];
		draw( new Drawable() {
			@Override
			public void draw() {
				System.out.println( points );
				System.out.println( "한번만 만들고 버릴 도형을 그렸습니다.");
			}
			
		});
		
		//resize test
		// resizeable( new Triangle() );
		resize( new Triangle() );
		resize( new Rectangle() );
		resize( new Circle( 10, 20, 5 ) );
		
		// instanceof는 클래스 경우에 
		// 상속 관계에 있을 때 연산이 가능
		Shape s1 = new Rectangle();
		System.out.println( ">>" + ( s1 instanceof Object ) );
		System.out.println( ">>" + ( s1 instanceof Shape ) );
		System.out.println( ">>" + ( s1 instanceof Triangle ) );
		System.out.println( ">>" + ( s1 instanceof Rectangle ) );
		
		Triangle s2 = new Triangle();
		System.out.println( ">>>" + ( s2 instanceof Object ) );
		//System.out.println( ">>>" + ( s2 instanceof Rectangle ) ); 오류납니당
		
		Object s3 = new Rectangle(); 	
		System.out.println( ">>>>" + ( s3 instanceof Object ) );
		System.out.println( ">>>>" + ( s3 instanceof String ) );
		System.out.println( ">>>>" + ( s3 instanceof ArrayList ) );

	}
	/*
	private static void drawPoint( Point point ) {
		point.show();
	}
	
	private static void drawShape( Shape shape) {
		shape.draw();
	}*/
	
	private static void draw( Drawable drawable ) {
		drawable.draw();
	}
	private static void resize( Shape s ) {
		System.out.println( s instanceof Drawable );

		if( s instanceof Resizable == false) {
			return;
		}
		Resizable resizable = (Resizable) s;
		resizable.resize( 0.5 );
	}
}

