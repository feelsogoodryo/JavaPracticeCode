package practiceFifteen;

public class FifteenPractice1202 {

	public static void main(String[] args) {
		//Practice exam
		//Use StringBuilder
		StringBuilder sb = new StringBuilder();
		//append 1 to 100 
		for(int i = 0; i < 100; i++) {
			sb.append(i+1).append(",");
		}
		System.out.println(sb.toString());
		String s = sb.toString();
		String[] a = s.split(",");
		for(String j : a) {
			System.out.println(j);
		}
		//Practice 15-2
		System.out.println(concatPath("newFolder","aaa"));
		
		//15-3
		/*1 .*
		 *2 [A][0-9][0-9]?
		 *3 [U][A-Z]{3}
		 */
		System.out.println("15-3");
		String a1 = "a";
		String a2 = "A0";
		String a3 = "A02";
		String a4 = "UABC";
		System.out.println("1:" + a1.matches(".*"));
		System.out.println("2:" + a2.matches("[A][0-9][0-9]?"));
		System.out.println("2-2:" + a3.matches("[A][0-9][0-9]?"));
		System.out.println("3:" + a4.matches("[U][A-Z]{3}"));
	}
	//Practice 15-2
	public static String concatPath(String folder, String file) {
		if(!folder.endsWith("\\")) {
			folder +=  "\\";
		}
		return folder + file;
	}
}
