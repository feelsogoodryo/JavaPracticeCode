package javaPractice;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ExceptionHandlingPractice {

	public static void main(String[] args) {
		//これがエラー処理を全て書いた状態。冗長で分かりにくい。
        File file1 = new File("C:\\Users\\user\\Desktop\\test1204.txt");
        FileWriter filewriter = null; 
        try {
        	filewriter = new FileWriter(file1);
            filewriter.write("abcd");
            filewriter.close();
            System.out.println("テキストファイル1の作成に成功しました");
        } catch (Exception e) {
        	System.out.println("エラーが発生しました");
        	e.getMessage();
            e.printStackTrace();
        } finally {
          if(filewriter != null) {
          	try {
            	filewriter.close();
        	} catch (IOException e) {
        		;
        	}
          }
        }
        //Java7から新しい構文が追加され、シンプルな記述が出来る様になった。
        //Try-with-resources 文
        File file2 = new File("C:\\Users\\user\\Desktop\\test1205.txt");
        try (FileWriter fw = new FileWriter(file2);) {
            fw.write("hello!");
            System.out.println("\"テキストファイル2の作成に成功しました\"");
          } catch (Exception e) {
            System.out.println("何らかの例外が発生しました");
          }
	}

}
