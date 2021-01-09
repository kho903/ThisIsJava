package sec16.exam01_java_time;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class DateTimeInfoExample {
	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);

		String strDateTime = now.getYear() + "�� ";
		strDateTime += now.getMonthValue() + "�� ";
		strDateTime += now.getDayOfMonth() + "�� ";
		DayOfWeek week = now.getDayOfWeek();
		if (week == DayOfWeek.MONDAY)
			strDateTime += "������";
		else if (week == DayOfWeek.TUESDAY)
			strDateTime += "ȭ����";
		else if (week == DayOfWeek.WEDNESDAY)
			strDateTime += "������";
		else if (week == DayOfWeek.THURSDAY)
			strDateTime += "�����";
		else if (week == DayOfWeek.FRIDAY)
			strDateTime += "�ݿ���";
		else if (week == DayOfWeek.SATURDAY)
			strDateTime += "�����";
		else if (week == DayOfWeek.SUNDAY)
			strDateTime += "�Ͽ���";

		strDateTime += now.getHour() + "�� ";
		strDateTime += now.getMinute() + "�� ";
		strDateTime += now.getSecond() + "�� ";
		strDateTime += now.getNano() + "������ ";
		System.out.println(strDateTime);

		LocalDate nowDate = now.toLocalDate();
		if (nowDate.isLeapYear())
			System.out.println("���ش� ����  : 2���� 29�ϱ��� �ֽ��ϴ�.");
		else
			System.out.println("���ش� ���  : 2���� 28�ϱ��� �ֽ��ϴ�.");

		ZonedDateTime utcDateTime = ZonedDateTime.now(ZoneId.of("UTC"));
		System.out.println("���� ����� : " + utcDateTime);

		ZonedDateTime seoulDateTime = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
		System.out.println("���� Ÿ���� : " + seoulDateTime);

		ZoneId seoulZoneId = seoulDateTime.getZone();
		System.out.println("���� zone ���̵� : " + seoulZoneId);

		ZoneOffset seoulZoneOffset = seoulDateTime.getOffset();
		System.out.println("���� �������� : " + seoulZoneOffset);
	}
}
