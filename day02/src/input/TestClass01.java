package input;

import java.util.Scanner;		// import : 특정 기능 사용할 때 가져 와서 사용하려는 기능 ! 

public class TestClass01 {
public static void main(String[] args) {
	
	// 입력 기능
	
	
			//변수자리 
	Scanner input = new Scanner(System.in);		// < -- 형태 기억하기 
	// 자료형 Scanner : 자바에서 제공하는 자료형 중 하나 ! 
	
//	int age; 
//	String name;
//	System.out.print("이름 입력 : ");
//	name = input.next();	// 문자열 입력 받을 땐 .next();
//	System.out.println("나이 입력 : ");	
//	age = input.nextInt(); 		// 정수형은 .nextInt();
//	
//	
//	System.out.println("당신의 이름은 "+name+"이며");
//	System.out.println("나이는 "+age+"살 이군요!");
	
	System.out.println();
	
	/*
	// 코드 흐름 위에서 아래로 
	 int k = 0, e = 0, m = 0;
	 int sum = k+ e + m;	// 어느 위치에서 연산 이루어지냐에 따라 값도 달라짐
	 k=100;					코드 흐름 파악 ! 
	 e=200;
	 m=300;
//	 sum =k+e+m;
	 System.out.println(sum);
	 */
	
	// 변수 초기화해서 오류 줄이기
	// 첫번째 글자가 대문자인 자료형은 null값으로 초기화한다
	// 소문자는 0으로 초기화한다 
	
	
	String name;			
	int kor, mat, eng;
	
	System.out.print("당신의 이름은 무엇입니까? ");
	name = input.next();
	System.out.print(name+" 님의 국어 점수 : ");
	kor = input.nextInt();
	System.out.print(name+" 님의 영어 점수 : ");
	eng = input.nextInt();
	System.out.print(name+" 님의 수학 점수 : ");
	mat = input.nextInt();
	
	System.out.println("===================");
	System.out.println("이름 : "+name);
	System.out.println("===================");
	System.out.println("국어 : "+kor);
	System.out.println("영어 : "+eng);
	System.out.println("수학 : "+mat);
	System.out.println("===================");
	System.out.println("합계 : "+(kor+eng+mat));
	System.out.println("===================");
	
	input.close();

}
}
