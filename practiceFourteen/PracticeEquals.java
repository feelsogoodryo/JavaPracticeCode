package practiceFourteen;

import objectPractice.Hero;

public class PracticeEquals {

	public static void main(String[] args) {
		Hero h1 = new Hero("Minato");
		Hero h2 = new Hero("Minato");
		System.out.println(h1.equals(h2));
		System.out.println(h1.toString());
	}
}
