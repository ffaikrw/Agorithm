package chap01.quiz;

public class Quiz02 {
	// TODO 세 값의 최솟값 구하기

	static int min3(int a, int b, int c) {

		int min = a;

		if (b < min) {
			min = b;
		}
		if (c < min) {
			min = c;
		}

		return min;
	}

	public static void main(String[] args) {

		System.out.println("세 값의 최솟값");

		System.out.println("min3(1, 2, 3) = " + min3(1, 2, 3));
		System.out.println("min3(2, 1, 3) = " + min3(2, 1, 3));
		System.out.println("min3(3, 1, 1) = " + min3(3, 1, 3));
		System.out.println("min3(1, 1, 1) = " + min3(1, 1, 1));
		System.out.println("min3(3, 3, 1) = " + min3(3, 3, 1));

	}
}
