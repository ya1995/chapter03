package exception;

import java.io.IOException;

public class MyClass {
	public void danger() throws MyException, IOException {
		System.out.println( "some code...1" );
		System.out.println( "some code...2" );
		
		if( 1==1 ) {
			throw new MyException( "MyClass Exception 발생" );
		}
		if( 1==1 ) {
			throw new IOException( "MyClass Exception 발생" );
		}
		
		System.out.println( "some code...3" );
		System.out.println( "some code...4" );
	}
}
