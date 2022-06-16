package chap01.ex;

import java.util.Scanner;

public class Digits {

	public static void main(String[] args) {
		// TODO 2자리의 양수(1 ~ 99) 입력
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.print("n : ");
			int n = scan.nextInt();
			
			if (n >= 10 && n <= 99) {
				System.out.println("변수 n의 값은 " + n + "이 되었습니다.");
				break;
			}
		}
		
		scan.close();

	}

}
