package javaPractice;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ExceptionPropagationPractice {
    //発生する例外をチェックせずに呼び出し元へ伝播させる
	//try-catchをしなくても怒られない
	//呼び出される側のメソッドは、メソッド内部での例外のキャッチが義務でなくなる。
	//呼び出す側のメソッドは例外を伝播してくるメソッドの呼び出しのtry-catchする義務が生まれる。
	//空のtry-catchは不祥事のもみ消しと同義である。通常はほぼありえない。
	public void writer() throws IOException{//throwsを付けると呼び出し元に伝播する。
    	File file = new File("C:\\Users\\user\\Desktop\\test1204.txt");
        FileWriter filewriter = new FileWriter(file);
        filewriter.write("abcd");
        filewriter.close();
    }

}
