package javaPractice;

public class Practice5 {

	public static void main(String[] args) {
		//Capture 5.5.1
		System.out.println("Capture 5.5.1 Use array as argument");
		int[] array = {10, 20, 30};
		printArray(array);
		
		//Capture 5.5.2
		System.out.println("\n");
		System.out.println("Capture 5.5.2 Call by reference");
		incArray(array);
		for(int i : array) {
			System.out.print(i);
			System.out.print(" ");
		}
		
		//Capture 5.5.3 Use array for return value
		System.out.println("\n");
		System.out.println("Capture 5.5.2 Call by reference");
		int[] makeArray = makeArray(3);
		for(int i : makeArray) {
			System.out.print(i);
			System.out.print(" ");
		}
		
		//Capture 5.8 Exercises 5-1
		System.out.println("Practice5-1");
		System.out.println("\n");
		System.out.println("Capture 5.8 Exercises");
		introduceOneself();
		
		//5-2
		System.out.println("Practice 5-2");
		System.out.println("");
		email("Dear My friend", "betogether.co.jp", "Hello,How about you today?");
		
		//5-3
		System.out.println("");
		System.out.println("Practice 5-3");
		email("another.co.jp,", "Hello!");
		
		//5-4-1
		System.out.println("");
		System.out.println("Practice 5-4-1");
		System.out.println(calcTraiangleArea(10.0,5.0) + "緕�");
		
		//5-4-2
		System.out.println("");
		System.out.println("Practice 5-4-2");
		System.out.println(calcCircleArea(5.0) + "緕�");
	}
	    //Capture 5.5.1
		public static void printArray(int[] array) {
			for(int element : array) {
				System.out.print(element);
				System.out.print(" ");
			}
		}
		
		//Capture 5.5.2
		public static void incArray(int[] array) {
			for(int i = 0; i < array.length; i++ ) {
				array[i]++;
			}
		}
		
		//Capture 5.5.3
		public static int[] makeArray(int size) {
			int[] newArray = new int[size];
			for(int i = 0; i < newArray.length; i++) {
				newArray[i] = i;
			}
			return newArray;
		}
		
		//Capture 5.8 5-1
		public static void introduceOneself() {
			String name = "Hama";
			int age = 31;
			double height = 171.1;
			char zodiac = '猿';
			System.out.println(name);
			System.out.println(age);
			System.out.println(height);
			System.out.println(zodiac);
		}
		
		//5-2
		public static void email(String title, String address, String text) {
			System.out.println("The following email has been sent to" + address);
			System.out.println("Title:" + title);
			System.out.println("Text:" + text);
		}
		
		//5-3
		public static void email(String address, String text) {
			System.out.println("The following email has been sent to " + address);
			System.out.println("Title: Untitled");
			System.out.println("Text:" + text);
		}
		
		//5-4
		public static double calcTraiangleArea(double bottom, double height) {
			return bottom * height / 2;
		}
		
		//5-4-2
		public static double calcCircleArea(double radius) {
			return radius * radius * 3.14;
		}
	}