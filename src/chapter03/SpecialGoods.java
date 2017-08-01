package chapter03;

import mypackage.Goods2;

public class SpecialGoods extends Goods2 {
	void showInfo() {
		// protectd 접근자는 자식에서 접근이 가능
		name = "nikon";
		
	}
}
