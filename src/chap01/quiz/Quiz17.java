package chap01.quiz;

import java.util.Scanner;

public class Quiz17 {
	// TODO n단의 숫자 피라미드 출력 메소드
	static void npira(int n) {
		
		for (int i = 0; i < n; i++) {
			
			for (int j = 0; j < (n - i - 1); j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < (i * 2 + 1); j++) {
				System.out.print(i + 1);
			}
			for (int j = 0; j < (n - i - 1); j++) {
				System.out.print(" ");
			}
			
			System.out.println();
		}
		
	}
	

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("단 수: ");
		int n = scan.nextInt();
		
		npira(n);
		
		scan.close();
		
	}

}
