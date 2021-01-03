package sec02.runtime_exception;

public class ClassCastExceptionExample {
	public static void main(String[] args) {
		Animal animal = new Dog();
		Dog dog = (Dog) animal;
		
		// ClassCastException
//		Cat cat = (Cat) animal;
		
		Dog dog2 = new Dog();
		changeDog(dog2);
		Cat cat2 = new Cat();
		// ClassCastException
		changeDog(cat2);
	}
	
	public static void changeDog(Animal animal) {
		// ���� �߻� ����
		if(animal instanceof Dog) {
			Dog dog = (Dog) animal;			
		}
		else {
			System.out.println("Dog���� ��ȯ�� ��ƽ��ϴ�.");
		}
	}
}

class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}