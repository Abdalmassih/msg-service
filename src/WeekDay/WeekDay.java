package WeekDay;

import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.Random;

/**
 * @author Abdalmassih 2 Oct 2018 06:41:25
 */
class WeekDay {

	String x;

	public static void main(String[] args) {

		String dayNames[] = new DateFormatSymbols().getWeekdays();
		Calendar date2 = Calendar.getInstance();
		System.out.println("Today is a " + dayNames[date2.get(Calendar.DAY_OF_WEEK)]);
		System.out.println(Math.cos(234));
		Random random = new Random();
		System.out.println(random.nextLong());
	}

}
