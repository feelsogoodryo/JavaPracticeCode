package javaPractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import objectPractice.Hero;
public class ArrayListPracticeMain {

	public static void main(String[] args) {
		// <>この記号はジェネリクスと呼ばれる。ダイヤモンド演算子とも呼ばれる。
		//List型と同様に要素の位置（添え字）の指定が0から始まる。
		ArrayList<String> names = new ArrayList<String>();
		names.add("Hiroshi");
		names.add("Hiroki");
		names.add("Kouji");
		System.out.println(names.get(1));
		//要素2に追加する。
		names.add(2,"Nakako");
		//要素３の更新
		System.out.println("Befor" + " " + names.get(3));
		names.set(3,"Syuuseiko");
		System.out.println("After" + " "+ names.get(3));
		
		//要素数を確認するときはsize()をしようする。Listではlengthを使用している。
		//要素数が0か確認する場合は、isEmpty()を用いる。
		System.out.println("names size is " + names.size());
		System.out.println(names.isEmpty());//false
		
		//Iterator リストに含まれる一つの箱をここ！と指している矢印のようなもの
		//まずイテレータのインスタンスを生み出す。この時newは使わない。
		System.out.println("");
		System.out.println("Iterator check");
		Iterator<String> it = names.iterator();
		while(it.hasNext()) {
			String e = it.next();
			System.out.println(e);
		}
		/*リストから要素を順に取り出す３種類の方法は、
		 *1 for
		 * 長所：古いJavaでも利用可能
		 * 短所：構文が分かりにくい
		 *2 拡張for
		 * 長所：構文が分かりやすい
		 * 　　　　Setなどでも利用可能
		 * 短所：周回数を取得できない
		 *3 Iterator
		 * 長所：古いJavaでも利用可能
		 * 　　　　Setなどでも利用可能
		 * 短所：構文が分かりにくい
		 * 　　　　周回数を取得できない
		 * 
		 * Listを継承したLinkedListも存在する
		 * 要素の挿入・削除　こちらの方が早い
		 * 指定位置の要素の取得　ArrayListのほうが早い
		 * */
		
		//コレクションのインスタンスは極力曖昧な型で使用するのがbetter
		System.out.println("");
		System.out.println("List check");
		List<String> list1 = new ArrayList<String>();
		list1.add("1");
		list1.add("2");
		list1.add("3");
		List<Hero> list2 = new LinkedList<Hero>();
		printList(list1);
		//printList2(list1);型違いでエラーが出る
		
		//要素参照に関する注意点
		System.out.println("");
		System.out.println("Notes on element references check");
	    Hero h = new Hero("Minato");
	    System.out.println("BeforName:" + h.name);
	    List<Hero> list = new ArrayList<Hero>();
	    list.add(h);
	    h.name = "スガワラ";
	    System.out.println("BeforName:" + list.get(0).name);

	}
		public static void printList(List<String> list) {
			for(String s : list) {
				System.out.println(s);
			}
		}
		//ArrayListで宣言するとArrayListでしか受け取れない。
		public static void printList2(ArrayList<String> list) {
			for(String s : list) {
				System.out.println(s);
			}
		}
}