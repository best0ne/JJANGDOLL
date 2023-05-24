package if_else;

import java.util.Scanner;

public class TestClass04 {
public static void main(String[] args) {
	
	// else if 
	
	/*
	 if (조건식){
	 	종속문장
	 }else if(조건식){
	 	종속문장
	 }else if(조건식){
	 	종속문장
	 }else{
	 	종속문장
	 }
	 */
	
	
	
	// if문은 단독적으로 동작하기 때문에 출력결과가 필요 외의 것 까지 출력됨 !
	// if문으로만 해서 else if 사용했을 때 결과를 도출하려면 &&로 조건 더 추가해주어야 하는
	// 번거로움이 있을 수 있음 ! 
	
//	int num = 150;
//	if(num > 100) {
//		System.out.println("100보다 크다");
//	}if(num > 70) {
//		System.out.println("70보다 크다");
//	}if (num>40) {
//		System.out.println("40보다 크다");
//	}else {
//		System.out.println("그 외의 값");
//	}
//	System.out.println("다음 문장들 실행 !!!");
	
	
	// if문의 번거로움을 조금 더 효율적으로 쓰는 것이 else if
	// 상황에 따라 능동적으로 골라 사용하면 됨 !!
	
//	int num = 150;
//	if(num > 100) {
//		System.out.println("100보다 크다");
//	}else if(num > 70) {
//		System.out.println("70보다 크다");
//	}else if (num>40) {
//		System.out.println("40보다 크다");
//	}else {
//		System.out.println("그 외의 값");
//	}
//	System.out.println("다음 문장들 실행 !!!");
	
	// 정수를 입력받아 아래와 같이 출력하시오.
	
	Scanner sc = new Scanner(System.in);
	int n1;
	System.out.println("정수 입력 : ");
	n1 = sc.nextInt();
	
	
	// 코드 흐름 파악하면서 위치 적절히 넣어주기 
	// 0 출력을 마지막에 빼면 다른 문장들 실행 후에 같이 나오기 때문에
	// 0을 조건으로 한 if문을 맨 위에 빼주고 밑에 식들을 else if로 해주면 출력 원활
	// 만약 0을 따로 빼지 않고 해결하려면 () 안 조건마다 n1 !=0 을 넣어주면 해결 가능
	// 하지만 코드가 많아지므로 비효율적 ! 
	
	
	if(n1==0) {
		System.out.println("0을 입력하셨습니다!");
	}
	else if(n1%3==0 && n1%4==0) {
		System.out.println("3, 4의 배수입니다.");
	}else if(n1%3==0) {
		System.out.println("3의 배수");
	}else if(n1%4==0) {
		System.out.println("4의 배수");
	}else if(n1%3!=0 && n1%4!=0)
		System.out.println("배수 아님!!!");
	
}
}
