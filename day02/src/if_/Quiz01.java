package if_;

import java.util.Scanner;

public class Quiz01 {
public static void main(String[] args) {
	
	
	// 2조 문제 풀기
	
	// 1.문제 정수를 입력받고 음수면 음수, 0이면 0, 양수면 양수로 출력하고 짝수 홀수 여부 출력
	
	Scanner input = new Scanner(System.in);
	int num;
	System.out.println("정수 입력 : ");
	num = input.nextInt();
	
	if (num==0) {
		System.out.println("0입니다!");
	}if (num>0 && num%2==0) {
		System.out.println("양수/짝수입니다!");	
	}
	if (num>0 && num%2!=0) {
		System.out.println("양수/홀수입니다!");
	}
	if (num<0) {
		System.out.println("음수입니다!");
	}
	
	//2.점수를 입력 받고 80점 이상이면 합격 80점 이하면 불합격 으로 나오게 만드세요.
										// 미만
	int score=0;
	System.out.println("점수 입력 : ");
	score = input.nextInt();
	
	if(score>=80) {
		System.out.println("합격입니다");
	}if(score<80)
	{
		System.out.println("불합격입니다");
	}
	
	//3.A와 B를 비교하여 작은 값 출력
	
	int a,b;
	System.out.println("수1 입력 : ");
	a = input.nextInt();
	System.out.println("수2 입력 : ");
	b = input.nextInt();
	
	if (a>b) {
		System.out.println(b);
	}if (b>a) {
		System.out.println(a);
	}
	if(a==b) {
		System.out.println("두 수는 같습니다");
	}
	

	
	
}
}
