package switch_;

import java.util.Scanner;

public class TestClass01 {
public static void main(String[] args) {
	
	/*
	 switch( 값 ){
	 case 식1 : 종속문장. break;
	 case 식2 : 종속문장. break;
	 default : 종속문장.
	 }
	 */
	
	Scanner input = new Scanner (System.in);
	int num;
	System.out.println("수 입력");
	num = input.nextInt();
	switch(num) {
	case 1 : System.out.println("1입력");//break;
	case 2 : System.out.println("2입력");//break;
	default : System.out.println("그 외의 값");
	}
	System.out.println("다음 문장들 실행");
	
	// 위의 식과 아래와 같음 ! 조건에 따라 효율적인 방법으로 쓰면 됨 ! 
//	if(num==1) {}
//	else if(num==2) {}
//	else {}
	
	input.close();
	


}
}
