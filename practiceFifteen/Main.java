package practiceFifteen;

public class Main {

	public static void main(String[] args) {
		 String c = "aaaaa";
		 String b = "aaaa";
		//Use StringBuilder
		StringBuilder buff = new StringBuilder();
		for(int i = 0; i < 100; i++) {
			buff.append(i+1).append(",");
			System.out.print(i);
		}
		System.out.println("");
		//Use toString
		String s = buff.toString();
		//Use Split
		String[] a = s.split(",");
		for(String i : a) {
			System.out.println(i);
		}
		concatPath(c,b);
		ConcatPath aa = new ConcatPath();
		aa.concatPath(c, b);
	}
	public static String concatPath(String folder, String file) {
		if(!folder.endsWith("\\")) {
			folder += "\\";
		}
		System.out.println(folder + file);
		return folder + file;
	}
}
