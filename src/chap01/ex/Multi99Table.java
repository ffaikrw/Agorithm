package chap01.ex;

public class Multi99Table {

	public static void main(String[] args) {
		// TODO 곱셈표 출력
		
		System.out.println("<곱셈표>");
		
		for (int i = 1; i <= 9; i++) {
			for(int j = 1; j <= 9; j++ ) {
				System.out.print((j * i) + " ");
			}
			System.out.println();
		}

	}

}
