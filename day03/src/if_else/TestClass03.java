package if_else;

import java.util.Scanner;

public class TestClass03 {
public static void main(String[] args) {
	
	// 문자열 비교할 때 - equals 사용 
	
	String s1,s2;
	Scanner input = new Scanner(System.in);
	
	System.out.println("첫 문자열 입력");
	s1 = input.next();
	System.out.println("두번째 문자열 입력");
	s2 = input.next();
	
	System.out.println(s2.equals(s1));
	if(s1.equals(s2)) {	// s1.equals(s2) ->  true 일 때 
		System.out.println("s1과 s2는 같다");
	}else {	// s1.equals (s2) - > false 일 때 
		System.out.println("s1과 s2는 다르다");
	}
	System.out.println("다음 문장들 실행!!!");
}
}
