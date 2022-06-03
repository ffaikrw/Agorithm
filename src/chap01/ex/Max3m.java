package chap01.ex;

public class Max3m {
	// TODO 3개의 정수값을 입력하고 최댓값을 구한다.
	
	
	// a, b, c의 최댓값을 구하여 반환하는 메소드
	static int max3(int a, int b, int c) {
		
		int max = a;
		if(b > max) {
			max = b;
		}
		if(c > max) {
			max = c;
		}
		
		return max;
	}

	
	public static void main(String[] args) {
		
		System.out.println("max3(3, 2, 1) = " + max3(3, 2, 1));
		System.out.println("max3(3, 2, 2) = " + max3(3, 2, 2));
		System.out.println("max3(2, 1, 3) = " + max3(2, 1, 3));
		System.out.println("max3(1, 3, 3) = " + max3(1, 3, 3));
		
	}

}
