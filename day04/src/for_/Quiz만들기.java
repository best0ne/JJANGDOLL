package for_;

public class Quiz만들기 {
public static void main(String[] args) {
	

	
	// 문제 만들기
	
	/*
	 for문을 활용하여 1 부터 100까지의 정수 중 
	 3의 배수의 총합을 구하는 코드를 작성하세요
	 */
	
	int sum=0;
	
	for (int i = 1; i<=100; i++) {
		if(i%3==0)
			sum+=i;
	}System.out.println("3의 배수 총 합 :"+sum);
	
	// for문을 활용해 다음과 같은 삼각형을 출력하세요
	/*
	 
	 *
	 **
	 ***
	 ****
	 ***** 
	 
	 */
	
//	System.out.println("====================");
//	for (int x =1 ; x <=5; x++) {
//		for (int y=1; y<=x; y++) {
//			System.out.print("*");
//		}
//		System.out.println("");
//	}
//	System.out.println("====================");
//
//	
	
}	
}
