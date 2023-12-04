package javaPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapPractice {

	public static void main(String[] args) {
		/* 二つの情報key(キー)とvalue(値)のペアとして格納するデータ構造である。
		 * 格納した値はkeyを指定して読み書き出来る。
		 * keyの重複は許されない。同じkeyで異なる値をputすると上書きされてしまう為、注意が必要。
		 * 格納した順序を保証されない為、格納順に取り出すならLinkedhadhMapを、自然順序で取り出したい場合はTreeMapを利用する。
		 * */
	    Map<String, Integer> prefs = new HashMap<String, Integer>();
	    prefs.put("京都府", 255);
	    prefs.put("東京都", 1261);
	    prefs.put("熊本県", 181);
	    int tokyo = prefs.get("東京都");//keyを指定して値を取得
	    System.out.println("東京都の人口は、" + tokyo);
	    prefs.remove("京都府");
	    prefs.put("熊本県", 182);//値を182で上書きする。
	    int kumamoto = prefs.get("熊本県");
	    System.out.println("熊本県の人口は、" + kumamoto);
	    //Mapの情報を一つずつ取り出す。
	    for (String key : prefs.keySet()) {
	      int value = prefs.get(key);
	      System.out.println(key + "の人口は、" + value);
	    }
	    System.out.println("");
	    //コレクションの応用
	    //特産品のリストを作成
	    List<String> foodList = new ArrayList<String>();
	    foodList.add("Mikan");
	    foodList.add("Remon");
	    foodList.add("Banana");
	    
	    System.out.println("");
	    System.out.println("Map in List check");
	    Map<String, List<String>> prefsFoods = new HashMap<String, List<String>>();
	    prefsFoods.put("Tokyo", foodList);
	    for (String key : prefsFoods.keySet()) {
		      List<String> value = prefsFoods.get(key);
		      System.out.println(key + "の特産品は、" + value);
		}
	}

}
