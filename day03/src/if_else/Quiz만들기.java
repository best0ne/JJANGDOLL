package if_else;

import java.util.Scanner;

public class Quiz만들기 {
public static void main(String[] args) {
	
	/*
	 카페 메뉴 프로그램을 구현하세요
	 메뉴 목록 예시
	 *** 1. 아메리카노 2. 라떼 3. 아이스티 ***
	 사용자가 메뉴 번호를 입력했을 때
	 아메리카노와 라떼의 경우에는 아이스/따듯한 선택 여부를 나타내주세요
	 출력 멘트는 자유롭게 입력하세요 !! 
	 (없는 번호를 입력시에는 잘못 입력하셨습니다 출력) 
	 힌트 - 이중 if문 활용하기  / 어려운 부분이 있다면 풀이 참고 또는 저에게 물어봐주세요 ! */
	
	Scanner input = new Scanner(System.in);
	
	int menu, choice;
	
	System.out.println("\n\t*** java 카페 ***\n");
	System.out.println("메뉴 1. 아메리카노 2. 라떼 3. 아이스티");
	
	System.out.println("메뉴 번호 입력 : ");
	menu = input.nextInt();
	
	if(menu==1) {
		System.out.println("1. ice  2. hot 선택해주세요");
		choice = input.nextInt();
		if(choice==1) {
			System.out.println("--- 준비중 ---");
			System.out.println("아이스 아메리카노 나왔습니다!");
		}else if(choice==2) {
			System.out.println("--- 준비중 ---");
			System.out.println("따듯한 아메리카노 나왔습니다!");
		}
	}else if(menu==2) {
		System.out.println("1. ice  2. hot 선택해주세요");
		choice = input.nextInt();
		if(choice==1) {
			System.out.println("--- 준비중 ---");
			System.out.println("아이스 라떼 나왔습니다!");
		}else if(choice==2) {
			System.out.println("--- 준비중 ---");
			System.out.println("따듯한 라떼 나왔습니다!");
		}
	}else if(menu==3) {
		System.out.println("--- 준비중 ---");
		System.out.println("아이스티 나왔습니다!");
	}else
		System.out.println("잘못 입력하셨습니다!");
	
}	
}
