package javaPractice;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class LocalDateTimePracticeMain {

	public static void main(String[] args) {
	    // LocalDateTime�̐������@
	    LocalDateTime l1 = LocalDateTime.now();
	    LocalDateTime l2 = LocalDateTime.of(2020, 1, 1, 9, 5, 0, 0);
	    System.out.println(l2);

	    // LocalDateTime��ZoneDateTime�̑��ݕϊ�
	    ZonedDateTime z1 = l2.atZone(ZoneId.of("Europe/London"));
	    LocalDateTime l3 = z1.toLocalDateTime();
	    System.out.println(l3);
	    System.out.println(z1);
	    
	    //������ϐ��ɑ��
	    LocalDate d1 = LocalDate.of(2020,1,1);
	    LocalDate d2 = LocalDate.of(2020,1,4);
	    System.out.println("d1:" + d1);
	    System.out.println("d2:" + d2);

	    // 3���Ԃ�\��Period��2�ʂ�̕��@�Ő���
	    Period p1 = Period.ofDays(3);
	    Period p2 = Period.between(d1, d2);
	    System.out.println("p1:" + p1);
	    System.out.println("p2:" + p2);

	    // d2�̂����3������v�Z����
	    LocalDate d3 = d2.plus(p2);
	    LocalDate d4 = d2.plus(p1);
	    System.out.println("d3" + d3);
	    System.out.println("d4" + d4);
	}
}
