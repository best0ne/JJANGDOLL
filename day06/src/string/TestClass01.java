package string;

public class TestClass01 {
public static void main(String[] args) {
	
	String str = "Java is 그리고 pro 할만하다";
	System.out.println("기본 str : "+str);
	// 대문자로 임시 변환 
	System.out.println("대문자 : "+str.toUpperCase());
	System.out.println("str 확인 : "+str);
	// 변환한 대문자를 변수에 저장해 출력 
	String upperStr = str.toUpperCase();
	System.out.println("대문자 : "+upperStr);
	
	// 소문자 변환
	String lowerStr = str.toLowerCase();
	System.out.println("소문자 : "+lowerStr);
	
	
	System.out.println("=================");
	str = "abcd";
	System.out.println("기본 str : "+str);
	System.out.println(str.charAt(0));
	System.out.println(str.charAt(1));
	System.out.println(str.charAt(2));
	System.out.println(str.charAt(3));
	// String 배열의 인덱스 값은 char 형태임 !!! 
	System.out.println("-----------");
	char ch = str.charAt(1);
	System.out.println(ch);
	System.out.println(ch=='a');	//false
	System.out.println(ch=='b');	//true
	
	
	// ↓ 여기서부터 다시 이해하고 넘어가기 !
	
	System.out.println("-----------");
	System.out.println("ch-32 : "+(ch-32));	// 66
	// 대문자로 변경
	System.out.println("ch-32 : "+(char)(ch-32));	//B
	
	System.out.println("-----------");
	String ss =str.charAt(0) + "";
//	System.out.println(ss-32);	// 문자열에 연산은 넣을 수 없음! 
	char ch2 =str.charAt(0);
	String ss2 = (char)(ch2-32)+"";
	System.out.println(ss2);
	
	ch2 = str.charAt(1);
	ss2 += (char)(ch2-32)+"";
	System.out.println(ss);
	
	ch2 = str.charAt(2);
	ss2 += (char)(ch2-32)+"";
	System.out.println(ss);
	//공백 비교 
	ch2 = ' ';
	System.out.println(' '==ch2);	//true
	
	
}
}
