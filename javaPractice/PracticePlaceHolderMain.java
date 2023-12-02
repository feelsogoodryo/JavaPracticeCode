package javaPractice;

import objectPractice.Hero;

public class PracticePlaceHolderMain {

	public static void main(String[] args) {
		/*
       * プレースホルダについて
		*装飾
		 * , 三桁ごとにカンマを入れる
		 * 0　空き領域を0埋め
		 * -　左寄せ
		 * +　符号を強制表示
		 * 
		*桁 
		 * 表示桁数を指定する
		 * n.m形式で指定した場合、全体のn桁、小数点以下m桁での表示となる。
		 * 
		*型
		 * d　整数
		 * s　文字列
		 * f　少数
		 * b　真偽値
		 * 
		 * % 装飾(, or 0 or - or + (省略可)) 桁((省略可)) 型(d or s or f or b(必須))
		 * 
		 * 例：
		 * 　%-9s %-13s 所持金%,6d
		 * ※プレースホルダは日本語（全角）が混ざると崩れる可能性がある
		 */
		Hero hero1 = new Hero("Hero1");
		Hero hero2 = new Hero("Hero2");
		Hero hero3 = new Hero("Hero3");
		
		final String FORMAT = "%-9s %-13s 所持金%,6d";
		String s1 = String.format(FORMAT, hero1.getName(),hero1.getJob(),hero1.getGold());
		String s2 = String.format(FORMAT, hero2.getName(),hero2.getJob(),hero2.getGold());
		System.out.println(s1 + "\r" +s2);//面倒なので改行の正規表現を使用
		//format()を使って文字列を作ると同時に画面に出力したい場合はSystem.out.printf（）が使用できる。
		System.out.printf(FORMAT, hero3.getName(),hero3.getJob(),hero3.getGold());
	}

}
