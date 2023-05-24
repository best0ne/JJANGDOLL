package if_;

import java.util.Scanner;

public class Quiz02 {
public static void main(String[] args) {
	// 4조 문제 풀기 
	
	/*
	 * Q)숫자 3개를 입력받고 가장 큰 수를 골라내는 문제 -정수만 입력하세요!
	 * -----------------------------------------------------------------------------
	 * ----------
	 * 
	 * Q2) 세개의 정수를 입력받아서 가장 큰수를 출력하게 하세요 출력할때 하나의 정수로 고정을하고 매번 입력받을때마다 큰수만 나오게 해주세
	 * 요.
	 * -----------------------------------------------------------------------------
	 * -------------
	 * 
	 * Q3)알바공고] 선반 정리 알바 모집 -자격요건: 키 160cm 이상만 가능함
	 * 
	 * ※조건 -160cm이상의 키를 가진 사람만 채용. -삼항연산자이용
	 * 
	 * ※결과값 -> 최승철님의 키는 178cm 이므로 채용이 가능합니다. -> 최승철님의 키는 155cm 이므로 채용이 불가능합니다.
	 */
	Scanner input = new Scanner(System.in);
	
	//Q1. 
	int n1,n2,n3;
	System.out.println("수1 입력 :");
	n1 = input.nextInt();
	System.out.println("수2 입력 :");
	n2 = input.nextInt();
	System.out.println("수3 입력 :");
	n3 = input.nextInt();
	
	if (n1>n2 && n1>n3) {
		System.out.println("가장 큰 수 : "+n1);
	}if (n2>n1 && n2>n3) {
		System.out.println("가장 큰 수 : "+n2);
	}else 
		System.out.println("가장 큰 수 : "+n3);
	
	
	//Q2.
	int su1,su2,su3;
	System.out.println("수1 입력 :");
	su1 = input.nextInt();
	System.out.println("수2 입력 :");
	su2 = input.nextInt();
	System.out.println("수3 입력 :");
	su3 = input.nextInt();
	
	if(su1<su2) {
		su1=su2;
	}if(su1<su3) {
		su1=su3;
	}
	
	System.out.println("큰 수 : "+su1);
	
	//Q3.
	int h;
	String name;
	System.out.println("이름을 입력하시오 : ");
	name = input.next();
	System.out.println("키를 입력하시오 : ");
	h = input.nextInt();
	String s = (h>=160)?"가능합니다":"불가능합니다";
	System.out.println(name+" 님의 키는 "+h+"cm 이므로 채용이 "+s);
}
}
