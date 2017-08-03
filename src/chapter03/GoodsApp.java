package chapter03;

import mypackage.Goods2;

public class GoodsApp {

	public static void main(String[] args) {
		System.out.println( "git test" );
		Goods goods = new Goods();	//생성자 호출
		// private 생성자는 내부에서만 접근이 가능
		//goods.name = "nikon"; 오류남
		goods.setName( "nikon" );
		//goods.price = 200000;
		goods.setPrice( 200000 );
		//goods.countSold = 10;
		goods.setCountSold( 10 );
		//goods.countStock = 100;
		goods.setCountStock( 100 );
		
		System.out.println(
				// private 생성자는 내부에서만 접근이 가능
				// "name : " + goods.name + 에러남 
				"name : " + goods.getName() +
				", price: " + goods.getPrice() + 
				", countSold :" + goods.getCountSold() + 
				", countStock : " + goods.getCountStock() );
		
		goods.showInfo(); //showInfo 사용
		int discountPrice = goods.calcDiscountPrice( 20 );
		
		System.out.println( discountPrice );
		
	
		// default 접근자 필드는 다른 패키지에서는 접근 불가
		//Goods2 goods2 = new Goods2();
		//goods2.name = "coke";
		
		// static 변수 테스트
		Goods g = new Goods();
		System.out.println( Goods.getCountOfGoods() );
		
		g = new Goods();
		System.out.println( Goods.getCountOfGoods() );
		
		g = new Goods();
		System.out.println( Goods.getCountOfGoods() );
		
		final int VALUE = 10; // final을 사용하면 다른 값을 넣을 수 없음, 상수는 대문자로 써주는게 관례
		
		// VALUE = 20; 오류남
			
	}

}
