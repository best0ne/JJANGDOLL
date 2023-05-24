package while_;

public class TestClass05 {
public static void main(String[] args) {
	// do ~ while 문 (조건이 거짓이라도 종속문장이 무조건 한 번은 실행됨!)
	int su = 0, sum = 0;
	do {
		su++;
		sum += su;
	}while(su<=9);
	System.out.println("do while : "+ sum);
	
	// while 문 
	su = 0; sum = 0;
	while(su<=9) {
		su++;
		sum += su;
	};
	System.out.println("while : "+ sum);
	
	// 실행 결과 동일 
	
	System.out.println("===비교===");
	
	su = 100;
	do {
		su++;
		System.out.println("실행");
	}while(su<=9);		// 조건식이 마지막에 있어 비교가 나중에 이루어지므로 do ~ while문에서는
						// 무조건 한 번은 종속문장이 실행 된다 ! 
	
	
}
}
