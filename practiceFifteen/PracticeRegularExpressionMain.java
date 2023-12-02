package practiceFifteen;

public class PracticeRegularExpressionMain {

	public static void main(String[] args) {
		//Latest RegularExpressionSummary
		PracticeRegularExpression check = new PracticeRegularExpression();
		System.out.println("Take1");
		check.setName("Hi");
		System.out.println("");
		System.out.println("Take2");
		check.setName("Z1234567");
		System.out.println("");
		System.out.println("Take3");
		check.setName("ABCDEFGH");
		System.out.println("");
		System.out.println("checkJavaTake1");
		check.setJava("Jeva");
		System.out.println("");
		System.out.println("checkJavaTake2");
		check.setJava("java");
		System.out.println("");
		System.out.println("checkABTake1");
		check.setAB("ABBBBBB");
		System.out.println("");
		System.out.println("checkABTake2");
		check.setAB("A");
		System.out.println("Jaaaava".matches("Ja*va"));
	}
}
