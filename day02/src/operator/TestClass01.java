package operator;

public class TestClass01 {
public static void main(String[] args) {
	/*
	 사칙연산
	 +,-,*,/,%
	 / : 정수 / 정수 = 정수
	 / : 정수 /실수 = 실수(연산 중 하나라도 실수가 있다면 결과는 실수)
	 %(mod) : 정수 % 정수 = 나머지 값 
	 어떤 수가 짝수/홀수/배수 구분하는 것에 사용
	 */
	System.out.println("=== 기본 연산 ===");
	int n1 = 9, n2 = 2;
	System.out.println(n1+n2);
	System.out.println(n1-n2);
	System.out.println(n1*n2);
	System.out.println(n1/n2);
	System.out.println(n1/(float)n2);
	System.out.println(n1%n2);
	
	System.out.println();
	/*
	 복합대입연산자
	 n1 = 5;
	 n1 +=10;	//n1 = n1 + 10;	
	 // 해석 -- > n1에 대입해 있는 값은 5이고 더하기 
	 10 연산 진행 후 다시 자기 자신에게 연산 결과 값을 저장하는 것
	 */
	System.out.println("===== 복합대입연산자 =====");
	n1 = n2 = 5;
	n1 += 1;
	System.out.println(n1);	//6
	n1 -= 1;
	System.out.println(n1);	//5
	
	n1 *= n2;
	System.out.println(n1);	//25
	n1 /= n2;
	System.out.println(n1);	//5
	n1 %= n2;
	System.out.println(n1);	//0
	
	/*
	 관계 연산자
	 -결과적으로 true(참) 또는 false(거짓)를 알려준다
	 n1 = 10, n2 = 5;
	 >,<,>=,<=,==,!=
	 n1>n2 = true
	 n1<n2 = false
	 n1 == n2 - > false
	 n1 != n2 - > true
	 */
	System.out.println("======== 관계 연산자 =======");
	n1 = 10; n2 =5;
	System.out.println(n1>n2);	// true
	System.out.println(n1==n2);	// false
	System.out.println(n1==10);	// true
	System.out.println(n1!=n2);	// true
	System.out.println(n1!=10);	// false
	/*
	 논리 연산자
	 || (or) : 식 중 하나라도 true(참)이면 결과는 true(참)이다.
	 && (and) : 모두가 참일 때 결과는 참이다.
	 			- 하나라도 거짓이면 결과는 거짓
	 ! (not) : 결과를 반전시켜준다
	 			- !true - > false, !false - > true
	 */
	
	System.out.println("=== 논리 연산자 ===");
	System.out.println("-- or --");
	System.out.println(true || true);
	System.out.println(true || false);
	System.out.println(false || false);
	System.out.println("-- and --");
	System.out.println(true && true);
	System.out.println(true && false);
	System.out.println(false && false);
	System.out.println("이항연산은 코드에서 사용 못하므로 하나씩 나눠서 표현 ↓");
	System.out.println(10>5 && 10 > 2);
	System.out.println("-- not --");
	System.out.println(!true);
	System.out.println(!false);
	System.out.println(!(10<5));// 10<5가 거짓이고 !가 붙었으므로 결과는 true
	
	/*
	 증감 연산자
	 - 결과적으로 자기 자신을 1 증가 또는 감소
	 n1 = 10;
	 n1++; - > n1 = n1 + 1;
	 ++n1; - > n1 = n1 + 1;
	 n1--; - > n1 = n1 - 1;
	 --n1; - > n1 = n1 - 1; 
	 */
	System.out.println("=== 증감 연산자 ===");
	n1 = 10;
	n2 = n1++ + 10;	// 모든 연산이 끝난 후 자기 자신 연산
	System.out.println(n1);
	System.out.println(n2);
	System.out.println("---");
	n1 = 10;
	n2 = ++n1 + 10;	//어떤 연산보다 자기자신 먼저 연산하고 나머지 연산 진행
	System.out.println(n1);
	System.out.println(n2);
	
	
}
}
