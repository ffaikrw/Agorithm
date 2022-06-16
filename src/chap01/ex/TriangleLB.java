package chap01.ex;

import java.util.Scanner;

public class TriangleLB {

	public static void main(String[] args) {
		// TODO 왼쪽 아래가 직각인 이등변 삼각형 출력
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.print("몇 단 삼각형입니까? ");
			int n = scan.nextInt();
			
			if(n > 0) {
				for (int i = 0; i < n; i++) {
					for (int j = 0; j <= i; j++) {
						System.out.print("*");
					}
					System.out.println();
				}
				
				break;
			}
			
		}
		
		scan.close();

	}

}
