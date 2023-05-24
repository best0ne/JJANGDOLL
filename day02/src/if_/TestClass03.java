package if_;

import java.util.Scanner;

public class TestClass03 {
public static void main(String[] args) {
	
//	Scanner input = new Scanner(System.in);
//	int num;
//	
//	System.out.println("수 입력");
//	num = input.nextInt();
//	if(num>0 && num%2==0) {
//		System.out.println(num+"은 짝수");
//	}
//	if(num>0 && num%2!=0) {
//		System.out.println(num+"은 홀수");
//	}
//	System.out.println("다음 문장들 실행~");
	
	// Q. 지금까지 배운 내용 토대로 문제 만들어보고 먼저 풀어 보고 공유하기 !! 
	
	/*
	 java 고등학교에서 최근 중간 고사 시험을 보았다.
	시험 과목은 국어,영어,수학이며
	학생의 이름과 각 과목의 성적을 입력하면 총합 점수와 평균이
	출력되는 성적프로그램을 구현해보자!
	(평균은 소수점 두자리까지만 출력되게 만들 것)
	 */
	
	Scanner input = new Scanner(System.in);
	
	
	String student;
	int kor=0,eng=0,mat=0;
	
	System.out.println("===== 성적 프로그램 =====");
	System.out.print("학생의 이름을 입력하시오 : ");
	student = input.next();
	System.out.print("국어 성적 입력 : ");
	kor = input.nextInt();
	System.out.print("영어 성적 입력 : ");
	eng = input.nextInt();
	System.out.print("수학 성적 입력 : ");
	mat = input.nextInt();
	
	int sum = kor+eng+mat;
	double sum2 = sum/3.0;
	System.out.println();
	System.out.println("=====================");
	System.out.println("이름 : "+student+"\t총합 : "+sum);
	System.out.printf("평균 : %.2f",sum2);	// 소수점 두자리 표현 하는 것 찾아서 해결하기 !!
	
	

	
	input.close();
	
}
}
