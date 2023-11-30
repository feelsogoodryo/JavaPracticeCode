package objectPractice;

public class ObjectMain {

	public static void main(String[] args) {
//		Cleric c1 = new Cleric();
//		c1.selfAid();
//		c1.pray(1);
		//Make enemy instance 
		//Make matango instance
		System.out.println("");
		System.out.println("PoisonMatango");
		Matango a = new Matango('A');
		//Make poisonMatango instance
		System.out.println("");
		System.out.println("PoisonMatango");
		PoisonMatango poiM = new PoisonMatango('A');
		//Make sword instance
		Sword f = new Sword();
		f.name = "flameSword";
		f.damage = 10;
		//Make hero instance
		System.out.println("Hero");
		Hero m = new Hero("Minato");
		m.hp = 100;
		m.sword = f;
		System.out.println("Current weapon is a " + m.sword.name);
		m.attack(a);
		//Make superHero instance
		System.out.println("");
		System.out.println("SuperHero");
		SuperHero superM = new SuperHero("Minato");
		superM.status();
		poiM.attack(superM);
		System.out.println("");
		System.out.println("Monster escape");
		Monster[] monsters = new Monster[2];
		monsters[0] = a;
		monsters[1] = poiM;
		for(Monster i : monsters) {
			i.run();
		}
	}
}
