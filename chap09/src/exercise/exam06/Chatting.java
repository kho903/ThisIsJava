package exercise.exam06;

public class Chatting {
	void startChat(String chatId) {
//		String nickName = null;
//		nickName = chatId;
		String nickname = chatId;
		Chat chat = new Chat() {
			@Override
			public void start() {
				while (true) {
					String inputData = "æ»≥Á«œººø‰";
					String message = "[" + nickname + "]" + inputData;
					sendMessage(message);
				}
			}
		};
	}

	class Chat {
		void start() {}
		void sendMessage(String message) {}
	}
}
