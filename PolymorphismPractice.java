import objectPractice.Character;
import objectPractice.Hero;
import objectPractice.Matango;
import objectPractice.SuperHero;
import objectPractice.Thief;
import objectPractice.Wizard;

public class PolymorphismPractice {
	public static void main(String[] args) {
		//Polymorphism practice
		
		Matango a = new Matango('A');
		Character ch = new SuperHero("Minato");
		Wizard wizard = new Wizard("wizard");
		wizard.attack(a);
		wizard.fireball(a);
		Character cw = new Wizard("CW");
		//Character have attack method
		//I can call attack method
		cw.attack(a);
		//cw.fireball(a); This is error
		System.out.println("Instance check");
		if(cw instanceof Wizard) {  //Use instanceof method
			Wizard wz = (Wizard)cw; //Down cast
			System.out.println("Input cw in wz");
		}
		// Befor Not use polymorphism
	    Hero h1 = new Hero("a");
	    Hero h2 = new Hero("b");
	    Thief t1 = new Thief("c");
	    Wizard w1 = new Wizard("d");
	    Wizard w2 = new Wizard("");
	    // ñ`åØäJénÅI
	    // Ç‹Ç∏èhâÆÇ…îëÇ‹ÇÈ
	    h1.hp += 50;
	    h2.hp += 50;
	    t1.hp += 50;
	    w1.hp += 50;
	    w2.hp += 50;
	    
	    //After use polymorphism
	    Character[] c = new Character[5];
	    c[0] = new Hero("a");
	    c[1] = new Hero("b");
	    c[2] = new Thief("c");
	    c[3] = new Wizard("d");
	    c[4] = new Wizard("e");
	    // èhâÆÇ…îëÇ‹ÇÈ
	    for (Character cHp : c) {
	      ch.hp += 50;
	    }
	  }
}
