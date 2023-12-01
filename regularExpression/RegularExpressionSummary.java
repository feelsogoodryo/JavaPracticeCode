package regularExpression;

public class RegularExpressionSummary {

	public static void main(String[] args) {
		//通常文字
		System.out.println("");
		System.out.println("JAVA check");
		System.out.println("JAVA".matches("JAVA"));//true
		//ピリオド
		System.out.println("");
		System.out.println("J.VA check");
		System.out.println("Jeva".matches("J.va"));//true
		//アスタリスク
		System.out.println("");
		System.out.println("AB* check");
		System.out.println("A".matches("AB*"));//true
		System.out.println("AB".matches("AB*"));//true
		System.out.println("ABBBBB".matches("AB*"));//true
		System.out.println("");
		System.out.println("Ma.* check");
		//Maで始まる任意の文字
		System.out.println("Malll".matches("Ma.*"));//true
		System.out.println("Ma".matches("Ma.*"));//true
		//波かっこ、角かっこ内のハイフン
		System.out.println("");
		System.out.println("[A-Z]{7} check");
		//A~Zの7回繰り返し
		System.out.println("ABCDEFG".matches("[A-Z]{7}"));//true
		System.out.println("");
		System.out.println("[A-Z][A-Z0-9]{7} check");
		//初めの一文字がA~Z、二文字目からA~Zか数字のいずれか、トータル八文字
		System.out.println("A1234567".matches("[A-Z][A-Z0-9]{7}"));//true
		System.out.println("");
		System.out.println("A{1}B{2,}C{3,5}D?E+ check");
		//Aが1回、Bが2回以上、Cが3回以上5回以下、Dが0回または1回、Eが1回以上
		System.out.println("ABBCCCDE".matches("A{1}B{2,}C{3,5}D?E+"));//true
		System.out.println("ABBBCCCCCEEEE".matches("A{1}B{2,}C{3,5}D?E+"));//true
		//角かっこ
		System.out.println("");
		System.out.println("UR[LIN] check");
		//URの後にL,I,Nのいずれか
		System.out.println("URL".matches("UR[LIN]"));//true
		System.out.println("");
		System.out.println("\\d check");
		//いずれかの数字[0-9]と同じ
		System.out.println("1".matches("\\d"));//true
		System.out.println("");
		System.out.println("\\w check");
		//英字・数字・アンダーバー[a-zA-Z_0-9]と同じ。+アスタリスク
		System.out.println("aA_9".matches("\\w*"));
		System.out.println("");
		System.out.println("\\s check");
		//空白文字（スペース、タブ文字、改行文字など）
		System.out.println(" ".matches("\\s"));
		System.out.println("");
		System.out.println("splitMethod check");
		//splitMethodの利用
		String a ="abc,def:ghi";
		String[] words = a.split("[,:]");
		for(String w : words) {
			System.out.print(w + "->");
		}
		System.out.println("");
		System.out.println("");
		System.out.println("replaceAll check");
		//replaceAllMethodの利用
		String b = "abc,def,ghi";
		String c = b.replace("[beh]","X");
		System.out.println(c);//abc,def,ghi
	}

}
