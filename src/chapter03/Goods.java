package chapter03;

public final class Goods {			//필드 정의 , 클래스에 final을 붙이면 상속하지 말라는 얘기, 확장은 끝이라는 의미
	private static int countOfGoods;		//static은 자동으로 초기값을 0으로 설정해줌 -> 전역변수랑 비슷한 개념, 클래스변수라고 부름
	public static final double DISCOUNT_RATE = 0.3;	//static상수가 됨
	
	private String name;
	private int price;
	private int countStock;
	private int countSold;
	
	// 기본생성자(파라미터 없음), 클래스이름과 똑같이 해야함
	public Goods( ) {
		// Goods.countOfGoods++;
		// 같은 클래스 안에서는 생략 가능
		countOfGoods++;
	}
	public static int getCountOfGoods() {
		return countOfGoods;
	}
	
	
	public final String getName() {	//메소드를 확장시키지 마라 -> 오버라이드 금지
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		if( price < 0 ) {
			price = 0;
		}
		this.price = price;
	}
	public int getCountStock() {
		return countStock;
	}
	public void setCountStock(int countStock) {
		this.countStock = countStock;
	}
	public int getCountSold() {
		return countSold;
	}
	public void setCountSold(int countSold) {
		this.countSold = countSold;
	}

	public void showInfo() {
		// private 생성자는 내부에서만 접근이 가능
		System.out.println( 
				"Goods[name=" + name + 
				",price=" + price + 
				",countStock=" + countStock +
				",countSold=" + countSold + "]" 
				);
	}
	
	public int calcDiscountPrice( int percentage ) {
		int discountPrice = price * percentage / 100;
		return discountPrice;
	}
}
