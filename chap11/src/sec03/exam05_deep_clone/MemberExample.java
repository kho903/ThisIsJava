package sec03.exam05_deep_clone;

public class MemberExample {
	public static void main(String[] args) {
		Member original = new Member("홍길동", 25, new int[] { 90, 90 }, new Car("소나타"));
		
		Member cloned = original.getMember();
		cloned.scores[0] = 100;
		cloned.car.model = "그랜저";
		
		System.out.println("[원본 객체의 필드값]");
		System.out.println("name : " + original.name);
		System.out.println("age : " + original.age);
		System.out.print("scores : { ");
		for(int score : original.scores) {
			System.out.print(score + " ");
		}
		System.out.println("}");
		System.out.println("car : " + original.car.model);

		System.out.println("\n[복제 객체의 필드값]");
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
