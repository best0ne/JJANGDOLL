package if_else;

import java.util.Scanner;

public class Quiz1 {
public static void main(String[] args) {
	
	// 우리 조 문제 풀기 
	
	/*
	 * Q1)금액을 입력하고 메뉴를 고른 뒤 잔돈을 출력하는 프로그램입니다.
	 * 
	 * 입력한 금액이 선택한 메뉴의 가격보다 부족하면 돈이 부족하다는 문장을 출력하세요.
	 * 
	 * ex) 금액을 입력하세요 : 5000 메뉴를 고르세요 : 1.코카콜라(800원) 2.펩시콜라(500원) 3.제로콜라(1000원) : 3
	 * 잔돈 : 4000원
	 */
	
	Scanner input = new Scanner(System.in);
//	int money,menu;
//	int coca = 800;
//	int pe = 500;
//	int zero = 1000;
//	
//	System.out.println("금액을 입력하세요 : ");
//	money = input.nextInt();
//	System.out.println("메뉴를 고르세요 : ");
//	menu = input.nextInt();
//	
//	if(menu==1) {
//		if(money<coca) {
//			System.out.println("잔돈이 부족합니다!");
//		}
//		else
//		System.out.println("잔돈 : "+(money-coca)+"원 입니다!");
//	}
//	else if(menu==2) {
//		if(money<pe) {
//			System.out.println("잔돈이 부족합니다!");
//		}
//		else
//		System.out.println("잔돈 : "+(money-pe)+"원 입니다!");
//	}
//	else if(menu==3) {
//		if(money<zero) {
//			System.out.println("잔돈이 부족합니다!");
//		}
//		else
//		System.out.println("잔돈 : "+(money-zero)+"원 입니다!");
//	}
	
	/*
	  놀이공원에 말을 타는 시스템(말을 타러 갔다는 가정) 
 말 탄시간(time)이랑 금액(money)를 변수로 받아서 
 최초 30분까지는 3000원이다 이후 10분마다 500원씩 추가가된다 
 총 얼마가 출력이 되는지 나오는식을 만들어 주세요.(입력은 한번만 받습니다.)
 예 30 입력시 출력되는 금액 = 3000원
 31~40 입력시 출력되는 금액 = 3500원
 41~50 입력시 출력되는 금액 = 4000원
	 */
	
	int time,money=3000;
	
	System.out.println("회전목마 이용한 시간 : ");
	time = input.nextInt();
	
	if(time<=30) {
		System.out.println("이용요금은 "+money+"원 입니다!");
	}else if(time>30) {
		money += 500;
		System.out.println("이용요금은 "+money+"원 입니다!");
	}
//	else if(time>40) {
//		money += 1000;
//	System.out.println("이용요금은 "+money+"원 입니다!");}
//	
	
	//  다시 ! 
	
	
	
	
	
	
	
	
	/*
	 -카페 마감 시간 오후 20시
-마감시간 전이면 주문 가능 ->A
-마감시간이거나 마감시간 후 ->B

-A
"무슨 커피를 주문하시겠습니까?" 출력
-> "아메리카노 | 카페라떼 | 에이드" 출력
-> 커피 종류 입력
->"주문하신 아메리카노 나왔습니다" 출력

-B
"마감시간이 지났습니다. 주문하실 수 없습니다." 출력

	 */
	
//	int h;
//	String menu;
//	System.out.println("현재 시간을 입력하세요 : ");
//	h = input.nextInt();
//	
//	if(h>=20) {
//		System.out.println("마감시간이 지났습니다. 주문하실 수 없습니다");
//	}else if(h<20) {
//		System.out.println("주문하실 메뉴를 입력하세요 : ");
//		menu = input.next();
//		System.out.println("주문하신 "+menu+ " 나왔습니다!");
//	}
	
	
}	
}
