package array_;

import java.util.Scanner;

public class TestClass07 {
public static void main(String[] args) {
	
	for(int i=0; i<5; i++) {
		System.out.println(i);
	}
	
	for(int i=1; i<5; i+=2) {
		System.out.println(i);
	}
	System.out.println("=====================");
	// 인덱스 홀짝 구분 
	/*
	 짝수 입력시 : index가 짝수 번쨰인 값 출력(0,2,4) <-- 10,13,25
	 홀수 입력시 : index가 짝수 번쨰인 값 출력(1,3,5) <-- 54,17,30
	 */
	
	// 풀이1
	Scanner input = new Scanner(System.in);
	int[] arr = {10,54,13,17,25,30};
	
	String su;
	
	System.out.println("홀짝 입력 : ");
	su = input.next();
	
	for(int i=0; i<arr.length; i++) {
		if(su.equals("짝수")) {
			if(i%2==0) {
				System.out.println(i+"."+arr[i]);
			}
		}else {
			if(i%2!=0) {
				System.out.println(i+"."+arr[i]);
				}
			}
		}
	
	// 풀이2
	System.out.println("====================");
	
	for(int i=0; i<arr.length; i++) {
		if(su.equals("짝수")&&i%2==0) { 
				System.out.println(i+"."+arr[i]);
			}
		else if(su.equals("홀수")&& i%2!=0) {
				System.out.println(i+"."+arr[i]);
				}
			}
	
	//풀이 3 
	
	System.out.println("====================");
	String s = su.equals("짝수")?"1111":"2222";
	System.out.println(s);
	System.out.println("====================");
	int i = su.equals("짝수")?0:1;
	for(;i<arr.length;i+=2) {
		System.out.println(i+"."+arr[i]);
	}
	// 풀이 4
	System.out.println("==================");
	int j;
	if(su.equals("짝수")) {
		j=0;
	}else {
		j = 1;
	}
	for ( ; j<arr.length; j+=2) {
		System.out.println(j+"."+arr[j]);
	}
}
}
