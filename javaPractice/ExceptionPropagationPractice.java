package javaPractice;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ExceptionPropagationPractice {
    //���������O���`�F�b�N�����ɌĂяo�����֓`�d������
	//try-catch�����Ȃ��Ă��{���Ȃ�
	//�Ăяo����鑤�̃��\�b�h�́A���\�b�h�����ł̗�O�̃L���b�`���`���łȂ��Ȃ�B
	//�Ăяo�����̃��\�b�h�͗�O��`�d���Ă��郁�\�b�h�̌Ăяo����try-catch����`�������܂��B
	//���try-catch�͕s�ˎ��̂��ݏ����Ɠ��`�ł���B�ʏ�͂قڂ��肦�Ȃ��B
	public void writer() throws IOException{//throws��t����ƌĂяo�����ɓ`�d����B
    	File file = new File("C:\\Users\\user\\Desktop\\test1204.txt");
        FileWriter filewriter = new FileWriter(file);
        filewriter.write("abcd");
        filewriter.close();
    }

}
