package array_;

public class TestClass04 {
public static void main(String[] args) {
	
	// 첫번째 문자가 소문자이면 0, 대문자이면 null로 초기화 된다!
	
	String[] s = new String[3];
	double[] d = new double[3];
	
	System.out.println(s[0]==null);
	System.out.println(d[0]==0);
	
	// 초기화 방법은 편한 것으로 골라 쓰기 
	
//	String[] s1 = new String[] {"안녕","그래","반갑다"};
	String[] s1 = {"안녕","그래","반갑다"};
	double[] d1 = {1.1,2.2,3.3};
	
	for(int i=0; i<s1.length;i++) {
		System.out.println(s1[i]);
	}
	System.out.println("-------");
	
	
	//향상된 for문
	// index 값들을 확인할 때는 따로 변수 설정해서 만들어 줌!
	// : 뒤에 있는 값들이 : 앞에 있는 변수에 저장된다!
	int k =0;
	for(String ss:s1) {
		System.out.println(k+"."+ss);
		k++;
	}
	System.out.println("=======");
	for(double dd:d1) {
		System.out.println(dd);
	}
	
}
}
