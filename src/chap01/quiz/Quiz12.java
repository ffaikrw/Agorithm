package chap01.quiz;

public class Quiz12 {

	public static void main(String[] args) {
		// TODO 위쪽과 왼쪽에 곱하는 수가 있는 곱셈표 출력
//		  | 1 2 3 4 5 6 7 8 9 
//		--+-------------------
//		1 | 1 2 3 4 5 6 7 8 9
//		2 | 2 4 6 8 10 12 14 16 18
//		...
//		9 | 9 18 27 36 45 54 63 72 81
		
		System.out.print("  |");
		
		for (int i = 1; i <= 9; i++) {
			System.out.print(" " + i);
		}
		
		System.out.println();
		System.out.println("--+-------------------");
		
		for (int i = 1; i <= 9; i++) {
			System.out.print(i + " |");
			for (int j = 1; j <= 9; j++) {
				System.out.print(" " + (j * i ));
			}
			System.out.println();
		}
		

	}

}
