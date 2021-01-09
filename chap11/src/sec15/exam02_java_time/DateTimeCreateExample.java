package sec15.exam02_java_time;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class DateTimeCreateExample {
	public static void main(String[] args) throws InterruptedException {
		// ��¥ ���
		LocalDate currDate = LocalDate.now();
		System.out.println("���� ��¥ : " + currDate);

		LocalDate targetDate = LocalDate.of(2024, 5, 10);
		System.out.println("��ǥ ��¥ : " + targetDate);

		// �ð� ���
		LocalTime currTime = LocalTime.now();
		System.out.println("���� �ð� : " + currTime);

		LocalTime targetTime = LocalTime.of(6, 30, 0, 0);
		System.out.println("��ǥ �ð� : " + targetTime);
		System.out.println();

		// ��¥�� �ð� ���
		LocalDateTime currDateTime = LocalDateTime.now();
		System.out.println("���� ��¥�� �ð� : " + currDateTime);

		LocalDateTime targetdateTime = LocalDateTime.of(2024, 5, 10, 6, 30);
		System.out.println("��ǥ ��¥�� �ð� : " + targetdateTime);

		// ���� ����ÿ� �ð���(TimeZone)O
		ZonedDateTime utcDateTime = ZonedDateTime.now(ZoneId.of("UTC"));
		System.out.println("���� ����� : " + utcDateTime);

		ZonedDateTime newyorkDateTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
		System.out.println("���� ���� �ð� : " + newyorkDateTime);

//		String[] availableIDs = TimeZone.getAvailableIDs();
//		for(String zoneId : availableIDs)
//			System.out.println(zoneId);

		// Ư�� ������ Ÿ�� ������ ���
		Instant instant1 = Instant.now();
		Thread.sleep(10);
		Instant instant2 = Instant.now();
		
		if(instant1.isBefore(instant2))
			System.out.println("instant1�� �����ϴ�.");
		else if(instant1.isAfter(instant2))
			System.out.println("instant1�� �ʽ��ϴ�.");
		else
			System.out.println("������ �ð��Դϴ�.");
		
		System.out.println("����(nanos) :" + instant1.until(instant2, ChronoUnit.NANOS));
	}
}
