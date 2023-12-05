package dokoJavaPractice;

import java.io.IOException;

public class PracticesSeventeen {

	public static void main(String[] args) throws IOException {//17-4でthrows IOExceptionを実装した。

		
		//17-1,17-2 
		try {
		String s = null;
		// java.lang.NullPointerExceptionが発生する
		System.out.println(s.length());
		} catch(NullPointerException e) {
			System.out.println("NullPointerException例外をcatchしました。");
			System.out.println("--スタックトレース（ここから）--");
			e.printStackTrace();
			System.out.println("--スタックトレース（ここまで）--");
		}
		//17-3
		try {
		//NumberFormatExceptionが発生する	
		int i = Integer.parseInt("三");
		System.out.println(i);
		} catch(NumberFormatException e) {
			System.out.println("NumberFormatException例外をcatchしました。");
			System.out.println("--スタックトレース（ここから）--");
			e.printStackTrace();
			System.out.println("--スタックトレース（ここまで）--");
		}
		//17-4 throwの強制発生
		System.out.println("");
		System.out.println("プログラムが起動しました");
		throw new IOException();
	}

}
