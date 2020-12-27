package sec08_exam04_overloading;

public class Calculator {
	double areaRectangle(double width) {
		return width * width;
	}

	double areaRectangle(double width, double height) {
		return width * height;
	}
}
