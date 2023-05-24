package string;

public class TestClass02 {
public static void main(String[] args) {
	// String 만드는 방법 골라 쓰기 !
	String str = new String("test");
	String str2 = "test";
	// 값 동일
	System.out.println(str);
	System.out.println(str2);
	
	
	String id = "aaa	 ";
	String inputId = "aaa";
	System.out.println(id.equals(inputId));	// false
	System.out.println(id+".");
	System.out.println(inputId+".");
	// 양쪽 공백 제거해주는 기능 trim
	System.out.println(id.trim()+".");
	
	// 각각의 값을 구분하고 싶을 때 - > 구분자를 기준으로 split
	String addr = "051421/서울특별시 종로구/101-914";
	String[] addrs = addr.split("/");
	for(String s : addrs) {
		System.out.println(s);
	}
	// replace  - > 문자열 치환 
	String repl = addr.replace("/", "==>");
	System.out.println(repl);
	
	
	
}
}
