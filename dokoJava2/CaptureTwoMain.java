package dokoJava2;

//���̂�import dokoJavaPractice.AccountType;����x�C���|�[�g���Ă���łȂ���import static dokoJavaPractice.AccountType.FUTSU;���C���|�[�g�o���Ȃ������B
import static dokoJavaPractice.AccountType.FUTSU;
public class CaptureTwoMain {

	public static void main(String[] args) {
		AccountCap2 a1 = new AccountCap2("1732050", FUTSU);//�C���|�[�g���Ă��邽��AccountType.FUTSU�Ə����Ȃ��Ă��ǂ��B
		System.out.println("�����ԍ���" + a1.getAccountNo() + "�ł�");
		System.out.println("������ʂ�" + a1.getAccountType() + "�ł�");
	}

}
