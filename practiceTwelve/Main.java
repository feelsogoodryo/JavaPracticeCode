package practiceTwelve;

public class Main {

	public static void main(String[] args) {
		Y a = new A();
		Y b = new B();
		
		Y[] yArray = new Y[2];
		yArray[0] = a;
		yArray[1] = b;
		for(Y y :yArray) {
			y.b();
		}
	}

}
