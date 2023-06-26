package weekend.day1;

public class calculator {

	public int addThreeNumber(int a, int b, int c) {
		int d = a + b + c;
		return d;
	}

	public float subTwoNumber(int a, float b) {
		float c = a + b;
		return c;
	}

	public int dividedTwoNumber(int a, int b) {
		int c = a % b;
		return c;
	}

	public static void main(String[] args) {

		calculator call = new calculator();

		int add = call.addThreeNumber(10, 20, 20);
		float sub = call.subTwoNumber(10, 5);
		int divide = call.dividedTwoNumber(10, 1);

		System.out.println("Addition value is " + add);
		System.out.println("Subtraction value is " + sub);
		System.out.println("division value is " + divide);

	}
}
