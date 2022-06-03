package chap01.quiz;

public class Quiz05 {
	// TODO 3개의 정수값을 입력하고 중앙값 구하기 - 아래의 메소드가 Quiz04 보다 효율이 떨어지는 이유
	
	static int med3(int a, int b, int c) {
		if ((b >= a && a >= c) || (b <= a && a <= c)) {
			return a;
		} else if ((a > b && b > c) || (a < b && b < c)) {
			return b;
		} else {
			return c;
		}
	}
	
	/* if ((b >= a && a >= c) || (b <= a && a <= c)) 에서 (b >= a)는
	 * else if ((a > b && b > c) || (a < b && b < c))의 (a > b)를 뒤집은 것과 같은 동일한 조건이며,
	 * 
	 * if ((b >= a && a >= c) || (b <= a && a <= c)) 에서 (b <= a) 역시
	 * else if ((a > b && b > c) || (a < b && b < c))의 (a < b)를 뒤집은 것과 같아 동일한 조건이다.
	 * 
	 * 따라서 같은 조건을 또 다시 수행한 것이 되기 때문에 비효율적이다.
	 */

	
	public static void main(String[] args) {
		
		System.out.println("3개의 정수값을 입력하고 중앙값 구하기");
		
		System.out.println("med3(3,2,1) = " + med3(3, 2, 1)); // a＞b＞c
		System.out.println("med3(3,2,2) = " + med3(3, 2, 2)); // a＞b＝c
		System.out.println("med3(3,1,2) = " + med3(3, 1, 2)); // a＞c＞b
		System.out.println("med3(3,2,3) = " + med3(3, 2, 3)); // a＝c＞b
		System.out.println("med3(2,1,3) = " + med3(2, 1, 3)); // c＞a＞b
		System.out.println("med3(3,3,2) = " + med3(3, 3, 2)); // a＝b＞c
		System.out.println("med3(3,3,3) = " + med3(3, 3, 3)); // a＝b＝c
		System.out.println("med3(2,2,3) = " + med3(2, 2, 3)); // c＞a＝b
		System.out.println("med3(2,3,1) = " + med3(2, 3, 1)); // b＞a＞c
		System.out.println("med3(2,3,2) = " + med3(2, 3, 2)); // b＞a＝c
		System.out.println("med3(1,3,2) = " + med3(1, 3, 2)); // b＞c＞a
		System.out.println("med3(2,3,3) = " + med3(2, 3, 3)); // b＝c＞a
		System.out.println("med3(1,2,3) = " + med3(1, 2, 3)); // c＞b＞a
		
	}

}
