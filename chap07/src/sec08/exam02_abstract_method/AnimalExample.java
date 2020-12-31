package sec08.exam02_abstract_method;

public class AnimalExample {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		dog.sound();
		cat.sound();
		System.out.println("-----------------");
		
		Animal animal = null;
		animal = new Dog();
		animal.sound(); // 멍멍
		
		animal = new Cat();
		animal.sound(); // 야옹
		
		System.out.println("-----------------");
		animalSound(new Dog());
		animalSound(new Cat());
	}
	
	// Animal animal : 어떠한 자식 개체든지 올수 있음
	public static void animalSound(Animal animal) {
		animal.sound();
	}
}
