package pranticeThirteen;

public class Main {

	public static void main(String[] args) {
		Wand wand = new Wand();
		wand.setName("FlameWand");
		wand.setPower(20);
		Wizard wizard = new Wizard("nono",100,15,wand);
		wizard.getStatus();
	}
}
