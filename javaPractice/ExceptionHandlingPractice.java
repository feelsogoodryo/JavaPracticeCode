package javaPractice;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ExceptionHandlingPractice {

	public static void main(String[] args) {
		//���ꂪ�G���[������S�ď�������ԁB�璷�ŕ�����ɂ����B
        File file1 = new File("C:\\Users\\user\\Desktop\\test1204.txt");
        FileWriter filewriter = null; 
        try {
        	filewriter = new FileWriter(file1);
            filewriter.write("abcd");
            filewriter.close();
            System.out.println("�e�L�X�g�t�@�C��1�̍쐬�ɐ������܂���");
        } catch (Exception e) {
        	System.out.println("�G���[���������܂���");
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
        //Java7����V�����\�����ǉ�����A�V���v���ȋL�q���o����l�ɂȂ����B
        //Try-with-resources ��
        File file2 = new File("C:\\Users\\user\\Desktop\\test1205.txt");
        try (FileWriter fw = new FileWriter(file2);) {
            fw.write("hello!");
            System.out.println("\"�e�L�X�g�t�@�C��2�̍쐬�ɐ������܂���\"");
          } catch (Exception e) {
            System.out.println("���炩�̗�O���������܂���");
          }
	}

}
