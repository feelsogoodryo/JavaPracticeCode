package stringPractice;

public class StringProcessing {

	public static void main(String[] args) {
		// StringProcessing also called text processing(文字列処理またはテキスト処理と呼ばれる)
//文字列を調査する。
		//内容が等しいか調べる。
		System.out.println("equals check");
		String a1 = "aeiou";
		String a2= "aeiou";
		System.out.println(a1.equals(a2));//true
		System.out.println("");
		System.out.println("equalsIgnoreCase check");
		//大文字小文字を区別せず内容が等しいか調べる。
		String b1 = "aeiou";
		String b2 = "AEIOU";
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
//文字列を検索する。
		//一部に文字列"s"を含むかを調べる
		System.out.println("");
		System.out.println("contains check");
		String e1 = "opqrstu";
		String e2 = "OPQRSTU";
		System.out.println("e1:" + e1.contains(e1));//true
		System.out.println("e2:" + e2.contentEquals(e2));//true
		//文字列"s"で始まるかを調べる 文字列"s"で終わるか調べる"endsWith"も存在する。
		System.out.println("");
		System.out.println("startsWith check");
		String f1 = "Sports";
		String f2 = "sports";
		String f3 = "part";
		System.out.println("f1" + f1.startsWith(f1));//true
		System.out.println("f2" + f2.startsWith(f2));//true
		System.out.println("f3" + f2.startsWith(f3));//false
		//文字"hoge"が最初に登場する位置を調べる。存在する場合にはその桁を（0から数える）、無い場合には-1を返す。大文字小文字を区別する。
		//文字列の後ろからカウントする"lastIndexOf"も存在する。
		System.out.println("");
		System.out.println("indexOf check");
		String g1 = "0123456hoge";
		String g2 = "0123456Hoge";
		System.out.println(g1.indexOf("hoge"));//7
		System.out.println(g2.indexOf("hoge"));//-1
//文字列を切り出す
		//指定位置の１文字を切り出す※0からカウント
		System.out.println("");
		System.out.println("charAt check");
		String h1 = "0123456789";
		System.out.println(h1.charAt(8));//8
		//指定位置から始まる文字列を任意の長さだけ切り出す
		System.out.println("");
		System.out.println("substring check");
		String i1 = "0123456789";
		System.out.println(i1.substring(0));//0123456789 0文字目から全ての文字を切り出す
		System.out.println(i1.substring(0, 5));//01234　0文字目から5文字目までの文字を切り出す
//文字列を変換する
		//大文字を小文字に変換する　小文字を大文字に変換する"toUpperCase"も存在する
		System.out.println("");
		System.out.println("toUpperCase and toLowerCase check");
		String j1 = "abcdefg";
		System.out.println(j1.toUpperCase());//ABCDEFG
		System.out.println(j1.toLowerCase());//abcdefg
		System.out.println("");
		System.out.println("trim check");
		//空白を除去する
		String k1 = " abcdefg  \t";
		String k2 = "　abc　";//全角スペース
		System.out.println(k1.trim());//abcdefg
		System.out.println(k2.trim());//　abc　※全角スペースはトリムされない。
		//文字列を置き換える
		System.out.println("");
		System.out.println("replace check");
		String l1 ="0123456789";
		System.out.println(l1.replace("56789","01234"));//0123401234
//文字列の連結
		//文字列を連続して連結する場合に高い性能を発揮する"StringBuilderクラス"
		//+による連結の4604倍高速で処理が可能
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < 100; i++) {
			sb.append("JAVA:" + i);
		}
		String s = sb.toString();
		System.out.println(s);
//String、Cher配列、byte配列の相互変換
		String m1 = "HelloWould";
		char[] data1 = m1.toCharArray();
		byte[] data2 = m1.getBytes();
		for(char a : data1) {
			System.out.print(a + "," + " ");
		}
		System.out.println("");
		for(byte b : data2) {
			System.out.print(b + "," + " ");
		}
	}
}
