package sec03.exam02_hashcode;

import java.util.HashMap;

public class KeyExample {
	public static void main(String[] args) {
		HashMap<Key, String> myhashMap = new HashMap<Key, String>();
		myhashMap.put(new Key(1), "ȫ�浿");
		
		String value = myhashMap.get(new Key(1));
		System.out.println(value);
	}
}
