package switch_;

import java.util.Scanner;

public class TestClass02 {
public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	String msg;
	System.out.println("문자열 입력");
	msg = input.next();
	switch(msg) {
	case "안녕" : System.out.println("안녕 입력");
		break;
	case "하세요" : System.out.println(msg + " 입력");
		break;
	}	// default 생략 가능 
	System.out.println("다음 문장들 실행~");
	
	// 실수는 비교 불가
	// 문자열, 문자, 정수 비교 가능 
}
}
