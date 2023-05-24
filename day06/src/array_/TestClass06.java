package array_;

import java.util.Scanner;

public class TestClass06 {
public static void main(String[] args) {
	
	// 홀짝 구분 문제
	
	Scanner input = new Scanner(System.in);
	int[] arr = {10,54,13,17,25,30};
	
	String su;
	
	System.out.println("홀짝 입력 : ");
	su = input.next();
	
	for(int num :arr) {
		if(su.equals("짝수")) {
			if(num%2==0) {
				System.out.println("짝수 : "+num);
			}
		}else {
			if(num%2!=0) {
				System.out.println("홀수 : "+num);
			}
		}
	}
	
	
}
}
