package switch_;

import java.util.Scanner;

public class Quiz1 {
public static void main(String[] args) {
	// d8 문제 1번 
	// 날짜 요일 출력하기 
	Scanner sc = new Scanner(System.in);
	int num;

	
	
	while(true) {
		System.out.println("날짜 입력 : ");
		num = sc.nextInt();
		
		if ( num ==0 || num>31) {
		System.out.println("없는 날짜입니다!!");
		}
		else {
		switch(num%7) {
		case 1 : System.out.println("월요일");break;
		case 2 : System.out.println("화요일");break;
		case 3 : System.out.println("수요일");break;
		case 4 : System.out.println("목요일");break;
		case 5 : System.out.println("금요일");break;
		case 6 : System.out.println("토요일");break;
		case 0 : System.out.println("일요일");break;
		
		}
		}

	}
	
	
}
}
