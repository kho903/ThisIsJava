package sec14.exam01_date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {
	public static void main(String[] args) {
		Date now = new Date();
		String strNow1 = now.toString();
		System.out.println(strNow1);

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� mm�� dd�� hh�� mm�� ss��");
		String strnow2 = sdf.format(now);
		System.out.println(strnow2);
	}
}
