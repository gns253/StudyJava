package review;

public class Ex1 {

	public static void main(String[] args) {
		Hero 뽀삐= new Hero();
		Hero 가렌 = new Hero();
		뽀삐.demage = 100;
		뽀삐.hp = 500;
	
		가렌.demage = 150;
		가렌.hp = 700;
		뽀삐.showHeroInfo();
		System.out.println("=======================");
		가렌.showHeroInfo();
	
		System.out.println("===========");
		뽀삐.attack(가렌);
		가렌.showHeroInfo();
		
		System.out.println("=========");
		가렌.attack(뽀삐);
		뽀삐.showHeroInfo();
	}

}

class Hero {
	
	int demage;
	int hp;
	int mp;
	
	public void showHeroInfo() {
		System.out.println("demage: " + demage);
		System.out.println("hp: " + hp);
		System.out.println("mp: " + mp);
	}
	
	
	public void attack(Hero target) {
		target.hp -= demage;
	}
	

}