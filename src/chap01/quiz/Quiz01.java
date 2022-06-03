package chap01.quiz;

public class Quiz01 {
	// TODO 네 값의 최댓값 구하기
	
	static int max4(int a, int b, int c, int d) {
		
		int max = a;
		
		if (b > max) {
			max = b;
		}
		if (c > max) {
			max = c;
		}
		if (d > max) {
			max = d;
		}
		
		return max;
	}

	
	public static void main(String[] args) {
		
		System.out.println("네 수의 최댓값");
		
		System.out.println("max4(1, 2, 3, 4) = " + max4(1, 2, 3, 4));
		System.out.println("max4(4, 1, 3, 2) = " + max4(4, 1, 3, 2));
		System.out.println("max4(2, 3, 1, 4) = " + max4(2, 3, 1, 4));
		
	}

}
