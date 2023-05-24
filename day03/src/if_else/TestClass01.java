package if_else;

import java.util.Scanner;

public class TestClass01 {
public static void main(String[] args) {
	
	// if ~ else
	
	
	Scanner input = new Scanner(System.in);
	int num;
	System.out.println("수 입력");
	num = input.nextInt();
	if(num % 3 == 0) {
		System.out.println("입력 값은 3의 배수");
	}else {
		System.out.println("입력 값은 3의 배수 아님 !");
	}
	
	System.out.println("다음 문장들 실행 !!!");
	System.out.println("다음 문장들 실행 !!!");
	System.out.println("다음 문장들 실행 !!!");
	
	// 수를 입력 받아 0보다 크고 100보다 작으면 정상, 아니면 비정상으로 출력하기
	
	int su;
	System.out.println(" 수 입력 : ");
	su = input.nextInt();
	
	if ( su > 0 && su < 100) {
		System.out.println("정상입니다");
	}else
		System.out.println("비정상입니다");
	
}	
}
