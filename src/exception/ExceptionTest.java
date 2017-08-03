package exception;

public class ExceptionTest {
	public static void main(String[] args) {
		int result = 0;
		int a = 0;
		
		try {
				System.out.println( "some code 1" );
				result = 1000 / a;
				System.out.println( "some code 2" );
				System.out.println( "some code 3" );
			
			} catch( ArithmeticException e ) {
			// e.printStackTrace();
				
			//1. 사과
				System.out.println( "죄송하빈다." );
			//2. 로그남기
				System.out.println( "error : " + e );
			//3. 정상종료
				return;
			} finally { 	// 마지막에 꼭 해야되는 코드는 finally에 넣어주면됨
				System.out.println( "자원정리" );
			} 
		
		System.out.println( result );
	
	}
	

}
