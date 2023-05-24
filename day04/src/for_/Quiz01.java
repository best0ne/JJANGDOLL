package for_;

import java.util.Scanner;

public class Quiz01 {
public static void main(String[] args) {
	// 우리 조 문제 풀기

	/*
	    //for문을 이용해 짝수만 출력하시오.
   		//for문을 이용해 홀수만 출력하시오.
	1~10까지의 수 
	*/
	
	/*for (int i=1; i<=10; i++) {
		
		if(i%2==0)
		System.out.println(i);
	}
	
	for (int j=1; j<=10; j++) {
		if(j%2!=0)
			System.out.println(j);
	}*/
	
	// Q)for문을 이용해서 구구단 2단부터 9단까지 출력하기

//	for(int i=2; i<=9; i++) {
//		System.out.println("-------");
//		for(int j=1; j<=9; j++) {
//			System.out.println(i+"*"+j+"="+i*j);
//		}
//	}
//	
	// 입력받은 두 수에서 작은수부터 큰 수까지의 모든 정수의 합을 구하는 예제를 만드세요.
	
	Scanner input = new Scanner (System.in);
//	
//	int a=0,b=0;
//	int sum=0;
//	System.out.println("수 입력");
//	a=input.nextInt();
//	b=input.nextInt();
//	
//	for(a=a; a<=b; a++) {
//		sum +=a;
//	}System.out.println(sum);
	
	
	// 1조 문제 풀기
	
	// N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램을 작성하시오. 출력 형식에 맞춰서 출력하면 된다.
	
//	int N=0;
//	System.out.println("수 입력 : ");
//	N = input.nextInt();
//	
//		for(int i=1; i<=9; i++) {
//		System.out.println(N+"*"+i+"="+N*i);
//		}
		
	// 반복문을 통해 은행 시스템을 만들어보자.	
	/*
	 처음 실행시킬땐
========================================
1.계좌 개설 2.계좌 조회 3.입출금 오픈 4.종료
========================================
가 뜨게 하고 
1번은 계좌를 개설하면 계좌주 이름이 저장되고
2번은 조회를 하면 계좌주명이 뜨게 하고
4번 종료를 누르면 코드를 종료 시킨다

3번 입출금 오픈을 누르면
=========================
1.입금 2.출금 3.잔액조회 4.종료
=========================
이렇게 만들어서 입출금시 잔액이 저장이 되고
3번 잔액조회를 입력하면 현재 잔액이 뜨게하고
4번 종료를 누르면 코드를 종료 시킨다
	 */
		/*int num,bank;
		String name=null;
		int num2;
		int money1,money2,sumoney=0;
		
		
		while(true) {
		
		System.out.println("===========================================");
		System.out.println("1. 계좌 개설 2. 계좌 조회 3. 입출금 오픈 4. 종료");
		System.out.println("===========================================");
		
	System.out.println(">>> : ");
	num = input.nextInt();
	
	switch(num) {
	case 1 : System.out.println("계좌주 이름 입력 : ");
			name= input.next();break;
	case 2 : System.out.println("---조회중---");
			System.out.println("현재 등록된 계좌 명의는 "+name+" 님 입니다.");
			break;
	case 3 : 
		while(true) {
		System.out.println("========================");
		System.out.println("1. 입금 2. 출금 3. 잔액조회 4. 종료");
		System.out.println("========================");
		System.out.println(">>> : ");
		num2 = input.nextInt();
		if (num2 ==1) {
			System.out.println("입금할 금액 : ");
			money1= input.nextInt();
			sumoney+=money1;}
			else if (num2 ==2) {
			System.out.println("출금할 금액 : ");
			money2 =input.nextInt();
			sumoney -= money2;
		}else if (num2 == 3) {
			System.out.println("---잔액 조회중---");
			System.out.println("현재 잔액 : "+sumoney+"원");
		}else if (num2 == 4) {
			System.out.println("처음 화면으로 돌아갑니다.");
			break;
//			return ;
		}
		}
	break;		// 오늘의 수확 .... 별 다섯개 ! ☆
	case 4 : 
		System.out.println("프로그램을 종료합니다.");
		return;
		}	
}*/
	
	/*
	 문제 3 (백준 10950)
두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
입력
첫째 줄에 테스트 케이스의 개수 T가 주어진다.

각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
출력
각 테스트 케이스마다 A+B를 출력한다.
예제 입력 1 
5
1 1
2 3
3 4
9 8
5 2
예제 출력 1 
2
5
7
17
7
// 한번에 출력하느냐 순차적으로 출력하느냐 차이가 있어서
// ArrayList 사용과 미사용으로 풀이를 2개로 나눴습니다
	 */
		
//	int a=0;
//	int b=0;
	
//	int t =0;
	
//	System.out.println("두 정수 입력");
//	a=input.nextInt();
//	b=input.nextInt();
	
//	for(i =0; i<=t; i++) {
//		
//		
//	}
		
	
	// 2조 문제 풀기 
	
	
		/*
		 Q.별찍기 문제 순서대로 만드시오
 1.*	     2. *****          3.   *
   **            ****               **
   ***            ***               ***
   ****            **               ****
   *****            *               *****
   									****
   									***
   									**
   									*
		 */
		
		for ( int i =1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
			System.out.print("*");	
			}
		}System.out.println();
	
	/*
	* 2.문제. 숫자를 입력받고 그 숫자이하의 소수를 모두 구하고 총 개수를 출력 
	* ex) 10을 입력받으면 "2,3,5,7"과 "4개"로 출력
	 */

	/*
	 
3. 점수를 입력받아 "수우미양가"로 평가되는 프로그램
		 ex) 점수를 입력하세요 : 92
		 수	
	 */
	
		
	//25조 문제 풀기
		
		
	/*
	 Q1.입력된 수를 거꾸로 정수형 변수에 담아 출력하시오.(예 123 -> 321)
	Q2.팩토리얼 계산기를 만드세요
	Q3.문제) 2~9중에 원하는 숫자를 입력하여 구구단 출력
	 */
		
		
}	
}
