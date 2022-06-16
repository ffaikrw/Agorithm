package chap01.quiz;

import java.util.Scanner;

public class Quiz16 {
	// TODO n단의 피라미드를 출력하는 메소드
	// ex. 4단
	// 1단: 3 1 3	(4-1)	0 * 2 + 1 (4-1)
	// 2단: 2 3 2	(4-2)	1 * 2 + 1
	// 3단: 1 5 1 	(4-3)	2 * 2 + 1
	// 4단: 0 7 0 	(4-4)	3 * 2 + 1
	static void spira(int n) {
		
		for (int i = 0; i < n; i++) {
			for(int j = 0; j < (n - i - 1); j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < (i * 2 + 1); j++) {
				System.out.print("*");
			}
			for(int j = 0; j < (n - i - 1); j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
		
	}
	

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("단 수: ");
		int n = scan.nextInt();
		
		spira(n);
		
		scan.close();
		
	}

}
