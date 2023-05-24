package if_else;


import java.util.Scanner;

public class Quiz2 {
public static void main(String[] args) {
	// 2조 
	
	/*
	 1번
국어,수학,영어 점수를입력받아서 총점,평균,학점 구하기 (평균은 소수점 2번재 자리까지 나오게하기)
90   => A                                   
80   => B                                   
70   => C                                    
60이상 => D
나머지는 F
	 */
	
	Scanner input = new Scanner(System.in);
	
	int kor =0,mat=0,eng=0;
	System.out.print("국어 점수 : ");
	kor = input.nextInt();
	System.out.print("수학 점수 : ");
	mat = input.nextInt();
	System.out.print("영어 점수 : ");
	eng = input.nextInt();
	
	int total = kor+eng+mat;
	double avg = total/3.0;
	char grade;
	
	if(avg>=90) {
		grade = 'A';
		System.out.printf("총점 : %d 평균 : %.2f 학점 : %c",total,avg,grade);
	}else if(90>avg && avg>=80) {
		grade = 'B';
		System.out.printf("총점 : %d 평균 : %.2f 학점 : %c",total,avg,grade);
	}else if(80>avg && avg>=70) {
		grade = 'C';
		System.out.printf("총점 : %d 평균 : %.2f 학점 : %c",total,avg,grade);
	}else if(70>avg && avg>=60) {
		grade = 'D';
		System.out.printf("총점 : %d 평균 : %.2f 학점 : %c",total,avg,grade);
	}else if(avg<60) {
		grade = 'F';
		System.out.printf("총점 : %d 평균 : %.2f 학점 : %c",total,avg,grade);
	}
	
	/*
	 2번 
두개의 숫자를 입력받아 각 숫자에 해당하는 아스키코드 알파벳을 나란히 출력하시오.
(ex. 65 66을 입력받으면 "결과: AB"가 출력됨)

- 처음 프로그램 실행시 시작하시겠습니까? 출력 후 대문자 Y를 입력받았을때만 진행
- 아스키코드에서 알파벳의 범위는 65~122까지이므로 이 숫자일때만 입력받음
(아스키코드의 변수형은 char)
- 첫번째 숫자와 두번째 숫자 각각 따로 입력받고, 한번이라도 잘못입력하면
다음 입력을 받지않고 결과또한 미출력
	 */
	System.out.println("\n");
	System.out.println("-------------------\n");
	
	int su1,su2;
	String start;
	
	System.out.println("시작하시겠습니까 ?");
	start=input.next();
	if (start.equals("Y")) {
		System.out.println("65 ~ 122 사이에 있는 수를 입력하세요 ");
		System.out.println("첫번째 수 입력 : ");
		su1 = input.nextInt();
		if(su1>=65 && 122>=su1) {
			System.out.println("두번째 수 입력 : ");
			su2 = input.nextInt();
			if(su2>=65 && 122>=su2) {
				System.out.println("출력 : "+(char)su1+(char)su2);
			}
		}
	}
	
	
	
	/*3번	
	 10,000원짜리 추석선물세트 구입시 지불해야하는 금액 계산
	 단, 11개 이상 구매시 10% 할인
	*/
	
	int num;
	int gift = 10000;
	
	System.out.println("*** 추석 선물 세트 : 개당 10,000원 판매중 ***");
	System.out.print("구입할 개수 입력 : ");
	num = input.nextInt();
	if(num>=11) {
		int money = (gift*num)-(gift*num)/10;
		System.out.println("지불 금액 : "+money+"원");
	}else
		System.out.println("지불 금액 : "+(gift*num)+"원");

	
}
}
