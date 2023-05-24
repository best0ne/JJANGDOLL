package for_;

public class TestClass02 {
public static void main(String[] args) {
	//이중 for 문
	
	for(int i =1; i<5; i++) {
		System.out.println("상위 for 시작");
		for(int k=1; k<3; k++) {
			System.out.println(i+","+k);
		}
		System.out.println("상위 for 끝");
	}
	// 구구단 출력 
	
	for ( int a=2; a<=9; a++) {
		System.out.println();
		for (int b=1; b<=9; b++) {
			System.out.println(a+"*"+b+"= "+(a*b));
		}
	}
	
}
}
