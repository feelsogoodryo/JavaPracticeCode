package objectPractice;

public class Matango extends Monster{
	  public Matango(char suffix) {
	    this.suffix = suffix;
	    this.hp = 50;
	  }
	  public void attack(Hero h) {
	    System.out.println("キノコ" + this.suffix + "の攻撃");
	    System.out.println("10のダメージ");
	    h.hp -= 10;
	  }
	  public void run() {
		  System.out.println("Matango" +" "+ this.suffix + " " + "escape");
	  }
	}
