package chap01.ex;

import java.util.Scanner;

public class JudgeSign {

	public static void main(String[] args) {
		// TODO 입력한 정수의 양수/음수/0 판단
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int n = scan.nextInt();
		
		if (n > 0) {
			System.out.println(n + "은(는) 양수입니다.");
		} else if (n < 0) {
			System.out.println(n + "은(는) 음수입니다.");
		} else {
			System.out.println(n + "은(는) 0입니다.");
		}
		
		
		scan.close();
	}

}
