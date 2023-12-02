package javaPractice;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class LocalDateTimePracticeMain {

	public static void main(String[] args) {
	    // LocalDateTimeの生成方法
	    LocalDateTime l1 = LocalDateTime.now();
	    LocalDateTime l2 = LocalDateTime.of(2020, 1, 1, 9, 5, 0, 0);
	    System.out.println(l2);

	    // LocalDateTimeとZoneDateTimeの相互変換
	    ZonedDateTime z1 = l2.atZone(ZoneId.of("Europe/London"));
	    LocalDateTime l3 = z1.toLocalDateTime();
	    System.out.println(l3);
	    System.out.println(z1);
	    
	    //日時を変数に代入
	    LocalDate d1 = LocalDate.of(2020,1,1);
	    LocalDate d2 = LocalDate.of(2020,1,4);
	    System.out.println("d1:" + d1);
	    System.out.println("d2:" + d2);

	    // 3日間を表すPeriodを2通りの方法で生成
	    Period p1 = Period.ofDays(3);
	    Period p2 = Period.between(d1, d2);
	    System.out.println("p1:" + p1);
	    System.out.println("p2:" + p2);

	    // d2のさらに3日後を計算する
	    LocalDate d3 = d2.plus(p2);
	    LocalDate d4 = d2.plus(p1);
	    System.out.println("d3" + d3);
	    System.out.println("d4" + d4);
	}
}
