package javaPractice;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TimeApiPracticeMain {

	public static void main(String[] args) {
		//Date�N���X �Ɓ@Calendar�N���X�͐̂��炠��N���X�ł���ׁA�s����������Ă���B
		//��\�I�Ȗ��Ƃ��āA�߂���������킵��API������A���񏈗��ŗp����ƃC���X�^���X�̓��e������ꍇ������
		//Java�J���҂̊Ԃł��܂�]���͗ǂ��Ȃ��B�Â��R�[�h���g�p���Ă��錻��ł͌��݂ł��g���Ă���ꍇ������
	    
		// Instant�̐���
	    Instant i1 = Instant.now();
	    //���ݎ����̎擾
	    System.out.println(i1);

	    // Instant��long�l�Ƃ̑��ݕϊ�
	    Instant i2 = Instant.ofEpochMilli(1600705425827L);
	    long l = i2.toEpochMilli();

	    // ZonedDateTime�̐������@
	    ZonedDateTime z1 = ZonedDateTime.now();
	    ZonedDateTime z2 = ZonedDateTime.of(2020, 1, 2, 3, 4, 5, 6, ZoneId.of("Asia/Tokyo"));

	    // Instant��ZoneDateTime�̑��ݕϊ�
	    Instant i3 = z2.toInstant();
	    ZonedDateTime z3 = i3.atZone(ZoneId.of("Europe/London"));

	    // ZonedDateTime�̗��p���@
	    System.out.println("����:" + z2.getYear() + z2.getMonth() + z2.getDayOfMonth());
	    System.out.println("�����h��:" + z3.getYear() + z3.getMonth() + z3.getDayOfMonth());
	    if(z2.isEqual(z3)) {
	      System.out.println("�����͓����u�Ԃ��w���Ă��܂�");
	    }
	}

}
