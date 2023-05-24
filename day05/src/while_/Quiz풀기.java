package while_;

import java.util.Scanner;

//import java.util.Scanner;

public class Quiz풀기 {
public static void main(String[] args) {
	// 4조 문제 
	
	/*
	 수영을 시작한다, 전체 거리는 25m.
	3m씩 이동하면서 "발차기를 계속합니다"와 
	"현재 이동 거리:"+move(헤엄친 거리)를 출력하고,
	마지막엔 "도착하였습니다"를 출력하기.
	 */
	
	
//	int x = 30, move = 0;
//	while(move<=x) {
//		System.out.println("현재 이동 거리 : "+move);
//		if (move == x)
//			break;
//		System.out.println("발차기를 계속합니다");
//		move +=3;}
//	System.out.println("도착했습니다!");
	
	
	
	
	//쌀100통이 저장되어 있는 창고에 암수1쌍의 쥐가 있다.
//	쥐 한마리가 하루에20g씩의 쌀을 먹고,10일(10,20,30)마다 쥐의 수가2배씩 증가한다.
//	며칠 만에 창고의 쌀이 모두 쥐의 먹이가 될까.그리고 쥐는 총 몇마리 인가? (쌀 한통=1kg)(쌀을 먹은후에2배증가하는 조건)
//	(while문으로 풀어주세요!)
	
//	int ssal = 100000;
//	int j=20;
//	int day=0;
//	while(true) {
//		day++;
//		j+=20;
//	}System.out.println(" : "+day+"일"+"쥐 : "+j+"마리");
	
	/*
	정수를 입력받고 입력받은 수만큼 5의 배수를 출력하는 프로그램 만들기
	ex) 정수를 입력하세요 : 1
     5의배수 : 5	
	 */
	
	
	Scanner input = new Scanner(System.in);
	
	// * 다시 풀기 !!!! 해결하자 
	
//	int a;
//	int num=1;
//	System.out.print("정수 입력");
//	a = input.nextInt();
//	
//	while(num<=a) {
//		System.out.printf("5의 배수 :%d\n",(5*num));
////		continue;
//		break;
//	}
	
	
	
	// 2조 문제 
	
	/*
	 1. 어느 달팽이는 낮에는 3cm 올라가고 밤에는 2.5cm 내려온다고 할 때, 달팽이가 13cm의 나무 꼭대기에 올라가려면
	며칠이 걸리는지 구하시오
	 */
	
//	int day = 0;
//	double dal = 0.0;
//	
//	while(true) {
//		day++;
//		dal += 0.5;
//		if(dal>=13.0) {
//			break;
//		}
//	}System.out.println(day+"일");	// 26일 !
	
	
	//2. 두 숫자를 입력받아 두 숫자의 약수들, 최대공약수, 최소공배수를 구하세요.
	//(최소공배수: (두 숫자의 곱)/최대공약수)
	
	/*
	 ex) 15, 20입력받음
약수: 1, 5
최대공약수: 5
최소공배수: 60

	 */
	
	
//	Scanner input = new Scanner(System.in);
	
	/*
	 * int x=0,y=0; int a=0; int i=0; System.out.println("수 입력"); x=
	 * input.nextInt(); y= input.nextInt();
	 * 
	 * // 15 20 // 15 - > 1 3 5 15 // 20 - > 1 4 5 20 // 약수 - > 1,5
	 * 
	 * // 약수구하기 
	 * for ( i = 1; i<=100; i++) { 
	 * if(x%i==0 && y%i==0) {
	 * System.out.print(i+" "); 
	 * a=i; // 최대 공약수 구하기 
	 * } 
	 * } //
	 * System.out.println("약수 : "); System.out.println("최대 공약수 : "+a);
	 * System.out.println("최소 공배수 : "+(x*y)/a);
	 */
	
	
	
	
	/*
	 문제 1 (백준 8393)
n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.

입력
첫째 줄에 n (1 ≤ n ≤ 10,000)이 주어진다.

출력
1부터 n까지 합을 출력한다.

예제 입력 1 
3
예제 출력 1 
6
	 */
	
	
//	int n=0;
//	int sum=0;
//	System.out.println("수 입력");
//	n= input.nextInt();
//	
//	for(int i=1; i<=n; i++) {
//		sum+=i;
//	}System.out.println("1~"+n+"까지의 합 : "+sum);
//	
	/*
	 문제)
두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

입력은 여러 개의 테스트 케이스로 이루어져 있다.

각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)

입력의 마지막에는 0 두 개가 들어온다.

각 테스트 케이스마다 A+B를 출력한다.
	 */
	
	int a,b;
	while(true) {
	System.out.println("정수 입력");
	a=input.nextInt();
	b=input.nextInt();
	if(a==0 && b==0) {
		input.close();
		break;}
	System.out.println(a+b);
	}
	
	
}
}
