package chap01.quiz;

import java.util.Scanner;

public class Quiz11 {

	public static void main(String[] args) {
		// TODO 양의 정수를 입력하고, 그 수의 자릿수를 출력
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("n : ");
			int n = scan.nextInt();
			
			if (n > 0) {
				// 자릿수 계산
				int i = 0;
				while (n > 0) {
					n = n / 10;
					i++;
				}
				
				System.out.println("그 수는 " + i + "자리입니다.");
				break;
			}
			
		}
		
		scan.close();

	}

}
