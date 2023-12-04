package javaPractice;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashsetPracticeMain {

	public static void main(String[] args) {
		/* 重複した値を格納しようとしても無視する
		 * 要素を一つずつ取り出す場合は順序が不明
		 * */
	    Set<String> colors = new HashSet<String>();
	    colors.add("赤");
	    colors.add("青");
	    colors.add("黄");
	    colors.add("赤");
	    System.out.println("色は" + colors.size() + "種類");
	    
	    //自然順序付けで順序が決まる。Stringは辞書順
	    Set<String> words = new TreeSet<String>();
	    words.add("dog");
	    words.add("cat");
	    words.add("wolf");
	    words.add("panda");
	    for (String s : words) {
	      System.out.print(s + "→");
	    }

	}

}
