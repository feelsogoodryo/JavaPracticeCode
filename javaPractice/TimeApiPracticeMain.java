package javaPractice;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TimeApiPracticeMain {

	public static void main(String[] args) {
		//Dateクラス と　Calendarクラスは昔からあるクラスである為、不具合や問題を抱えている。
		//代表的な問題として、近い方が紛らわしいAPIがある、並列処理で用いるとインスタンスの内容が壊れる場合がある
		//Java開発者の間であまり評判は良くない。古いコードを使用している現場では現在でも使われている場合がある
	    
		// Instantの生成
	    Instant i1 = Instant.now();
	    //現在時刻の取得
	    System.out.println(i1);

	    // Instantとlong値との相互変換
	    Instant i2 = Instant.ofEpochMilli(1600705425827L);
	    long l = i2.toEpochMilli();

	    // ZonedDateTimeの生成方法
	    ZonedDateTime z1 = ZonedDateTime.now();
	    ZonedDateTime z2 = ZonedDateTime.of(2020, 1, 2, 3, 4, 5, 6, ZoneId.of("Asia/Tokyo"));

	    // InstantとZoneDateTimeの相互変換
	    Instant i3 = z2.toInstant();
	    ZonedDateTime z3 = i3.atZone(ZoneId.of("Europe/London"));

	    // ZonedDateTimeの利用方法
	    System.out.println("東京:" + z2.getYear() + z2.getMonth() + z2.getDayOfMonth());
	    System.out.println("ロンドン:" + z3.getYear() + z3.getMonth() + z3.getDayOfMonth());
	    if(z2.isEqual(z3)) {
	      System.out.println("これらは同じ瞬間を指しています");
	    }
	}

}
