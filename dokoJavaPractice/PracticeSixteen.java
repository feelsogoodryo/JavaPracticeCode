package dokoJavaPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import objectPractice.Hero;

public class PracticeSixteen {

	public static void main(String[] args) {
		// 
		Hero h1 = new Hero("Saito");
		Hero h2 = new Hero("Suzuki");
		List<Hero> heroList = new ArrayList<Hero>();
		heroList.add(h1);
		heroList.add(h2);
		for(Hero h : heroList) {
			System.out.println(h.name);
		}
		Map<Hero, Integer> killCount = new HashMap<Hero, Integer>();
		killCount.put(h1, 3);
		killCount.put(h2, 7);
		for(Hero key : killCount.keySet()) {
			int value = killCount.get(key);
			System.out.println(key.name + "‚ª“|‚µ‚½”" + value);
		}
	}

}
