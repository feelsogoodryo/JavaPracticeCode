package objectPractice;

public class Matango extends Monster{
	  public Matango(char suffix) {
	    this.suffix = suffix;
	    this.hp = 50;
	  }
	  public void attack(Hero h) {
	    System.out.println("�L�m�R" + this.suffix + "�̍U��");
	    System.out.println("10�̃_���[�W");
	    h.hp -= 10;
	  }
	  public void run() {
		  System.out.println("Matango" +" "+ this.suffix + " " + "escape");
	  }
	}
