package sec03.exam03_multi_implement_class;

public class RemoteControlExample {
	public static void main(String[] args) {
		SmartTelevision tv = new SmartTelevision();
		
		RemoteControl rc = tv;
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(10);
		
		Searchable searchable = tv;
		searchable.search("�ƾƾƾƾƾ�");
	}
}
