package javaPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapPractice {

	public static void main(String[] args) {
		/* ��̏��key(�L�[)��value(�l)�̃y�A�Ƃ��Ċi�[����f�[�^�\���ł���B
		 * �i�[�����l��key���w�肵�ēǂݏ����o����B
		 * key�̏d���͋�����Ȃ��B����key�ňقȂ�l��put����Ə㏑������Ă��܂��ׁA���ӂ��K�v�B
		 * �i�[����������ۏ؂���Ȃ��ׁA�i�[���Ɏ��o���Ȃ�LinkedhadhMap���A���R�����Ŏ��o�������ꍇ��TreeMap�𗘗p����B
		 * */
	    Map<String, Integer> prefs = new HashMap<String, Integer>();
	    prefs.put("���s�{", 255);
	    prefs.put("�����s", 1261);
	    prefs.put("�F�{��", 181);
	    int tokyo = prefs.get("�����s");//key���w�肵�Ēl���擾
	    System.out.println("�����s�̐l���́A" + tokyo);
	    prefs.remove("���s�{");
	    prefs.put("�F�{��", 182);//�l��182�ŏ㏑������B
	    int kumamoto = prefs.get("�F�{��");
	    System.out.println("�F�{���̐l���́A" + kumamoto);
	    //Map�̏���������o���B
	    for (String key : prefs.keySet()) {
	      int value = prefs.get(key);
	      System.out.println(key + "�̐l���́A" + value);
	    }
	    System.out.println("");
	    //�R���N�V�����̉��p
	    //���Y�i�̃��X�g���쐬
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
		      System.out.println(key + "�̓��Y�i�́A" + value);
		}
	}

}
