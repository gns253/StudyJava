package ex05_09;

public class Ex6 {

	public static void main(String[] args) {

		CoffeeShop 별다방 = new CoffeeShop("별다방");
		CoffeeShop 콩다방 = new CoffeeShop("콩다방");
		
		Customer 김씨 = new Customer("김씨", 10000);
		Customer 이씨 = new Customer("이씨", 20000);
		
		System.out.println("----- 커피 구매 전 -----");
		System.out.println("김씨 돈: " + 김씨.money);
		System.out.println("김씨 커피: " + 김씨.coffee);
		System.out.println();
		System.out.println("이씨 돈: " + 이씨.money);
		System.out.println("이씨 커피: " + 이씨.coffee);
		System.out.println();
		
		System.out.println(별다방.name + "의 오늘 매출: " + 별다방.money);
		System.out.println(콩다방.name + "의 오늘 매출: " + 콩다방.money);
		
		김씨.buyCoffee(별다방, "아메리카노", 4000);
		이씨.buyCoffee(콩다방, "라떼", 4500);
		
		System.out.println("----- 커피 구매 후 -----");
		System.out.println("김씨 돈: " + 김씨.money);
//		System.out.println("김씨 커피: " + 김씨.coffee);
		System.out.println("김씨 커피 종류: " + 김씨.coffee.kind);
		System.out.println("김씨 커피 가격: " + 김씨.coffee.price);
		System.out.println();
		
		System.out.println("이씨 돈: " + 이씨.money);
//		System.out.println("이씨 커피: " + 이씨.coffee);
		System.out.println("이씨 커피 종류: " + 이씨.coffee.kind);
		System.out.println("이씨 커피 가격: " + 이씨.coffee.price);
		System.out.println();
		
		System.out.println(별다방.name + "의 오늘 매출: " + 별다방.money);
		System.out.println(콩다방.name + "의 오늘 매출: " + 콩다방.money);
		 
		김씨.buyCoffee(콩다방, "아인슈패너", 100000);
		
		
		
	}

}

class Customer {
	
	String name;
	int money;
	Coffee coffee;
	
	public Customer(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	public void buyCoffee(CoffeeShop coffeeShop, String kind, int price) {
		this.money -= price;
		coffee = coffeeShop.sellCoffee(kind, price);
	}
	
}

class CoffeeShop {
	String name;
	int money;
	
	public CoffeeShop(String name) {
		this.name = name;
	}
	
	public Coffee sellCoffee(String kind, int price) {
		this.money += price;
		return new Coffee(kind, price);
	}
}

class Coffee {
	String kind;
	int price;
	
	public Coffee(String kind, int price) {
		this.kind = kind;
		this.price = price;
	}
}










