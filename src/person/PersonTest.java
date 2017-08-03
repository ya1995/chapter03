package person;

public class PersonTest {

	public static void main(String[] args) {
		Person p = new Student( "둘리" );
		
		p.setName( "둘리" );
		
		// Down Casting
		// Explicity Casint
		 Student s1 = (Student)p;
		 s1.set();
		
		 // 변수없이 부르는법 p를 Student로 캐스팅하고나서 불러줌
		 ( ( Student ) p ).set();
		 
		 // Up Casting
		 // Implicity Casting
		 Person p2 = s1;
		 p2.setName( "마이콜" );
		 
		
	}
	// 부모클래스가 먼저 불려짐
}
