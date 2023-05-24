package while_;

import java.util.Scanner;

public class TestClass04 {
public static void main(String[] args) {
	// continue / break 예제 
	
	Scanner input = new Scanner(System.in);
	
	int num = 0, sum = 0;
	
//	while(true) {
//		System.out.println("10~20 사이 수 입력");
//		num = input.nextInt();
//		if(num < 10 || num > 20 ) {
//			System.out.println("다시 ...");
//			continue;   // 반복문 위로 올라감
//		}
//		break;  // 반복문 탈출
//	}
//	System.out.println("num : "+num);
	
	
	
	// 위 식과 동일한 결과값
	while(true) {
		System.out.println("10~20 사이 수 입력");
		num = input.nextInt();
		if(num >= 10 && num <= 20 ) {
			break;
		}
		System.out.println("다시...");	 
	}
	System.out.println("num : "+num);
	
	
}
}
