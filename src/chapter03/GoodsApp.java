package chapter03;

import mypackage.Goods2;

public class GoodsApp {

	public static void main(String[] args) {
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
	
		// default 접근자 필드는 다른 패키지에서는 접근 불가
		//Goods2 goods2 = new Goods2();
		//goods2.name = "coke";
	}

}
