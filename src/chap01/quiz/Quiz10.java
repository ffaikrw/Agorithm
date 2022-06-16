package chap01.quiz;

import java.util.Scanner;

public class Quiz10 {

	public static void main(String[] args) {
		// TODO 두 변수 a, b에 정수를 입력하고 b - a 를 출력하는 코드 작성
		// 단, b가 a보다 작으면 b의 값을 다시 입력
		
		Scanner scan = new Scanner(System.in);
		
		int sub = 0;
		
		System.out.print("a : ");
		int a = scan.nextInt();
		
		while(true) {
			System.out.print("b : ");
			int b = scan.nextInt();
			
			if (a >= b) {
				System.out.println("a보다 큰 값을 입력하세요!");
			} else {
				sub = b - a;
				break;
			}
		}
		
		System.out.println("b - a는 " + sub + "입니다.");
		
		scan.close();

	}

}
