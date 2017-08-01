package chapter03;

public class Goods {			//필드 정의
	private static int countOfGoods;		//static은 자동으로 초기값을 0으로 설정해줌 -> 전역변수랑 비슷한 개념
	
	private String name;
	private int price;
	private int countStock;
	private int countSold;
	
	public String getName() {
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



	void showInfo() {
		// private 생성자는 내부에서만 접근이 가능
		System.out.println( name );
	}
}
