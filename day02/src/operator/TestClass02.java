package operator;

import java.util.Scanner;

public class TestClass02 {
public static void main(String[] args) {
	
	// 삼항연산자 .. 조건 연산자 ,...
	
	Scanner input = new Scanner(System.in);
	int num;
	System.out.println("수 입력");
	num = input.nextInt();
//	String s = (num%2==0)?"짝수":"홀수";	// 괄호 안에 연산이 참이면 물음표 뒤 콜론 앞의 값을 출력/거짓이면 콜론 뒤에 값을 출력!
//	System.out.println(num+"는 "+s);

	
	// 입력한 수가 3의 배수인지 구분하시오! 
	String s = (num%3==0)?"3의배수입니다!":"3의배수x";
	System.out.println(num+" --> "+s);
	
	input.close();
	
}
}
