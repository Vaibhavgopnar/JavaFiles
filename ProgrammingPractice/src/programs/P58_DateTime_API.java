package programs;

import java.time.LocalTime;
import java.time.ZoneId;

public class P58_DateTime_API {

	public static void main(String[] args) {
		
		ZoneId z1 = ZoneId.of("Asia/Tokyo");
		ZoneId z2 = ZoneId.of("Asia/Kolkata");
		LocalTime t1 = LocalTime.now(z1);
		LocalTime t2 = LocalTime.now(z2);
		
		System.out.println("India Time Zone: "+t1);
		System.out.println("Tokyo Time Zone: "+t2);
		
		int tm1  = t1.getHour();
		int tm2 = t2.getHour();
	
		System.out.println("Hours between two Time Zone: "+Math.abs(tm1 - tm2));
	}

}
