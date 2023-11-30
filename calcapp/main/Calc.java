package calcapp.main;

import calcapp.logic.CalcLogic;

public class Calc {

	public static void main(String[] args) {
		//When not adding an import statement
		int a = 10; int b = 2;
		int total = calcapp.logic.CalcLogic.addition(a, b);
		int delta = calcapp.logic.CalcLogic.subtraction(a, b);
		System.out.println(total);
		System.out.println(delta);
		
		//When adding an import statement
		int total2 = CalcLogic.addition(a, b);
		int delta2 = CalcLogic.subtraction(a, b);
		System.out.println(total2);
		System.out.println(delta2);
	}
}
