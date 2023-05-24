package switch_;

import java.util.Scanner;

public class Quiz2 {
public static void main(String[] args) {
	 // d8 문제 2번
	// 우리집, 회사 등록 후 보기 
	
	Scanner input = new Scanner(System.in);
	String home=null,office=null;		// ** 초기화 통해 에러 줄이기! 
	int num;
	
	while(true) {
		System.out.println("============");
	System.out.println("1. 우리집 등록");
	System.out.println("2. 회사 등록");
	System.out.println("3. 등록 보기");
	
	System.out.print(">>> : ");
	num = input.nextInt();
	if(num ==1 ) {
		System.out.print("우리집 입력 : ");
		home = input.next();
		
	}else if(num ==2 ) {
		System.out.print("회사 입력 : ");
		office = input.next();
	}else if (num ==3) {
		System.out.println("우리집 : " + home+"\n회사 : "+office);
	}
	}	
	
	
	
	
}
}
