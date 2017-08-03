package exception;

public class ExceptionTest {
	public static void main(String[] args) {
		int result = 0;
		int a = 0;
		
		try {
			result = 1000 / a;
			}catch( ArithmeticException e ) {
			// e.printStackTrace();
			System.out.println( "예외 발생" );
			}
		
		System.out.println( result );
	
	}
	

}
