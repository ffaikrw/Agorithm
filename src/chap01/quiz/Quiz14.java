package chap01.quiz;

import java.util.Scanner;

public class Quiz14 {

	public static void main(String[] args) {
		// TODO 입력한 수를 한 변으로 하는 정사각형 출력
//		수: 3
//		***
//		***
//		***
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("단 수: ");
		int n = scan.nextInt();
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		scan.close();
	}

}
