package h2Info;

public class SampleDTO {

	private String isbn;	// isbn
	private String title;	// �^�C�g��
	private int price;	// ���i

	// �R���X�g���N�^
 	public SampleDTO() {
 		// ����������
 		isbn  = null;
 		title = null;
 		price = 0;
 	}
 
 	// isbn�̃Q�b�^�[���\�b�h
 	// �t�B�[���h�ϐ�isbn�ŊǗ����ꂽ�l��Ԃ�
 	public String getIsbn() {
 		return isbn;
 	}
 
 	// isbn�̃Z�b�^�[���\�b�h
 	// �����Ɏ󂯎�����l���t�B�[���h�ϐ�isbn�Ɋi�[����
 	public void setIsbn(String isbn) {
 		this.isbn = isbn;
 	}
 
 	// title�̃Q�b�^�[���\�b�h
 	// �t�B�[���h�ϐ�title�ŊǗ����ꂽ�l��Ԃ�
 	public String getTitle() {
 		return title;
 	}
 
 	// title�̃Z�b�^�[���\�b�h
 	// �����Ɏ󂯎�����l���t�B�[���h�ϐ�title�Ɋi�[����
 	public void setTitle(String title) {
 		this.title = title;
 	}
 
 	// price�̃Q�b�^�[���\�b�h
 	// �t�B�[���h�ϐ�price�ŊǗ����ꂽ�l��Ԃ�
 	public int getPrice() {
 		return price;
 	}
 
 	// price�̃Z�b�^�[���\�b�h
 	// �����Ɏ󂯎�����l���t�B�[���h�ϐ�price�Ɋi�[����
 	public void setPrice(int price) {
 		this.price = price;
 	}
}
