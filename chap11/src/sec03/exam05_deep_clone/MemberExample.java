package sec03.exam05_deep_clone;

public class MemberExample {
	public static void main(String[] args) {
		Member original = new Member("ȫ�浿", 25, new int[] { 90, 90 }, new Car("�ҳ�Ÿ"));
		
		Member cloned = original.getMember();
		cloned.scores[0] = 100;
		cloned.car.model = "�׷���";
		
		System.out.println("[���� ��ü�� �ʵ尪]");
		System.out.println("name : " + original.name);
		System.out.println("age : " + original.age);
		System.out.print("scores : { ");
		for(int score : original.scores) {
			System.out.print(score + " ");
		}
		System.out.println("}");
		System.out.println("car : " + original.car.model);

		System.out.println("\n[���� ��ü�� �ʵ尪]");
		System.out.println("name : " + cloned.name);
		System.out.println("age : " + cloned.age);
		System.out.print("scores : { ");
		for(int score : cloned.scores) {
			System.out.print(score + " ");
		}
		System.out.println("}");
		System.out.println("car : " + cloned.car.model);
	}
}
