package dokoJavaPractice;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;

public class DokoJava2PracticeMain {

	public static void main(String[] args) throws Exception{
		// Practice1
	    SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd");
	    ArrayList<Book> books = new ArrayList<>();

	    Book b1 = new Book();
	    b1.setTitle("Java����");
	    b1.setPublishDate(f.parse("2011/10/07"));
	    b1.setComment("�X�b�L���킩��");
	    books.add(b1);
	    Book b2 = new Book();
	    b2.setTitle("Python����");
	    b2.setPublishDate(f.parse("2019/06/11"));
	    b2.setComment("�J���[���H�ׂ����Ȃ�");
	    books.add(b2);
	    Book b3 = new Book();
	    b3.setTitle("C�������");
	    b3.setPublishDate(f.parse("2018/06/21"));
	    b3.setComment("�|�C���^�����R����");
	    books.add(b3);

	    Collections.sort(books, new TitleComparator());

	    for (Book b : books) {
	      System.out.println(b.getTitle() + " "
	          + f.format(b.getPublishDate()) + " "
	          + b.getComment());
	    }

	}

}
