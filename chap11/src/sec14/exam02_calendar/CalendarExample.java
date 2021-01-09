package sec14.exam02_calendar;

import java.util.Calendar;

public class CalendarExample {
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();

		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1;
		int day = now.get(Calendar.DAY_OF_MONTH);

		int week = now.get(Calendar.DAY_OF_WEEK);
		String strWeek = null;
		switch (week) {
		case Calendar.MONDAY:
			strWeek = "��";
			break;
		case Calendar.TUESDAY:
			strWeek = "ȭ";
			break;
		case Calendar.WEDNESDAY:
			strWeek = "��";
			break;
		case Calendar.THURSDAY:
			strWeek = "��";
			break;
		case Calendar.FRIDAY:
			strWeek = "��";
			break;
		case Calendar.SATURDAY:
			strWeek = "��";
			break;
		case Calendar.SUNDAY:
			strWeek = "��";
			break;
		}

		int amPm = now.get(Calendar.AM_PM);
		String strAmPm = null;
		if (amPm == Calendar.AM)
			strAmPm = "����";
		else
			strAmPm = "����";

		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);

		System.out.println(year + "�� " + month + "�� " + day + "��");
		System.out.println(strWeek + "����");
		System.out.println(strAmPm);
		System.out.printf("%d�� %d�� %d��", hour, minute, second);
	}
}