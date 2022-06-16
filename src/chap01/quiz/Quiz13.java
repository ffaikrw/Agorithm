package chap01.quiz;

public class Quiz13 {

	public static void main(String[] args) {
		// TODO 위쪽과 왼쪽에 더하는 수가 있는 덧셈표 출력
//		  | 1 2 3 4 5 6 7 8 9 
//		--+-------------------
//		1 | 2 3 4 5 6 7 8 9 10
//		2 | 3 4 5 6 7 8 9 10 11
//		...
//		9 | 10 11 12 13 14 15 16 17 18
		
		System.out.print("  |");
		for (int i = 1; i <= 9; i++) {
			System.out.print(" " + i);
		}
		
		System.out.println();
		System.out.println("--+-------------------");
		
		for (int i = 1; i <= 9; i++) {
			System.out.print(i + " |");
			for(int j = 1; j <= 9; j++) {
				System.out.print(" " + (i + j));
			}
			System.out.println();
		}

	}

}
