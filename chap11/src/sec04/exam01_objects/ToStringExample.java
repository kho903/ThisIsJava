package sec04.exam01_objects;

import java.util.Objects;

public class ToStringExample {
	public static void main(String[] args) {
		String str1 = "홍길동";
		String str2 = null;
		
		System.out.println(Objects.toString(str1));
		System.out.println(Objects.toString(str2));
		// toString(str2, "이름이 없습니다.")
		// str2가 null이면 "이름이 없습니다"가 반환됨
		System.out.println(Objects.toString(str2, "이름이 없습니다."));
	}
}
