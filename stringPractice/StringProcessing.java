package stringPractice;

public class StringProcessing {

	public static void main(String[] args) {
		// StringProcessing also called text processing(文字列処理またはテキスト処理と呼ばれる)
		
		//内容が等しいか調べる。
		System.out.println("equals check");
		String a1 ="aeiou";
		String a2="aeiou";
		System.out.println(a1.equals(a2));//true
		System.out.println("");
		System.out.println("equalsIgnoreCase check");
		//大文字小文字を区別せず内容が等しいか調べる。
		String b1 ="aeiou";
		String b2 ="AEIOU";
		System.out.println(b1.equalsIgnoreCase(b2));//true
		System.out.println("");
		System.out.println("length check");
		//文字列長を調べる。全角も半角も一文字としてカウントする
		String c = "abcdefg";
		System.out.println(c.length());//7
		//空文字か（長さが０か）を調べる length() == 0と意味は同じ
		String d1 = "";
		String d2 = null; // java.lang.NullPointerException
		String d3 = "a";
		System.out.println("d1 is " + d1.isEmpty() +" ,"+ "d3 is " + d3.isEmpty());
	}
}
