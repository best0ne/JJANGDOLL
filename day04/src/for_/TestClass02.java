package for_;

import java.util.Scanner;

public class TestClass02 {
public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
	int num;
	System.out.println("반복 횟수 입력");
	num = input.nextInt();
	
	int sum = 0, evenSum = 0, oddSum = 0;
	
	
	for (int i =0; i<=num; i++) {
		System.out.println(i+".번 반복");
		sum += i ;
		if(i%2==0) {
			evenSum += i;
		}else {
			oddSum += i;
		}
	}
	System.out.println("1~"+num+"까지의");
	System.out.println("짝수 합 : "+evenSum);
	System.out.println("홀수 합 : "+ oddSum);
	System.out.println("총 합 : "+ sum);
	System.out.println("다음 문장들 실행");


}
}
