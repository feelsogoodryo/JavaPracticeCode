package javaPractice;

import java.util.ArrayList;

public class WrapperMain {

	public static void main(String[] args) {
		/* コレクション、例えばArrayListに基本データ型は入れられない
		 * 8つの基本データ型に対応して基本データ型の情報を中に身保持するクラスが用意されている。
		 * これをwrapper class　ラッパークラスと総称する。
		 * float   Float
		 * double  Double
		 * char    Character
		 * boolean Boolean
		 * byte    Byte
		 * short   Short
		 * int     Integer
		 * long    Long
		 * 
		 *ラッパークラスと基本データ型を相互に自動変換する機能が備わっており、
		 *AutBoxing（オートボクシング）、AutUnboxing（オートアンボクシング）と呼ばれる
		 * */
	    ArrayList<Integer> points = new ArrayList<Integer>();//Integer型で宣言
	    points.add(10);//自動的にIntegerに変換・格納される
	    points.add(80);
	    points.add(75);
	    for (int i : points) {
	      System.out.println(i);
	    }
	    //明示的に基本型とラッパークラスを変換したい場合は以下メソッドを使用する。
	    //Integer をnewするのはJava9から非推奨となった。
	    Integer i1 = Integer.valueOf(10);
	    int i2 = i1.intValue();
	    System.out.println(i2);
	}

}
