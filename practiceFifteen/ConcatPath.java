package practiceFifteen;

public class ConcatPath {
	
	public String concatPath(String folder, String file) {
		if(!folder.endsWith("\\")) {
			folder += "\\";
		}
		System.out.println(folder + file);
		return folder + file;
	}
}
