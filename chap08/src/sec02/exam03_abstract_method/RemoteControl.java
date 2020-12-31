package sec02.exam03_abstract_method;

public interface RemoteControl {
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;

	// 접근제한자를 붙히지 않아도 
	// public abstract가 생략되어 있음
	void turnOn();
	void turnOff();
	void setVolume(int volume);
}
