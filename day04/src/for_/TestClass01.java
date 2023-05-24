package for_;

public class TestClass01 {
public static void main(String[] args) {
	/*
	 반복문
	 - for ( 초기값; 조건식; 증감식 ) {
	 		종속문장;
	 	}
	 
	 - 사용 조건
	 	규칙적으로 연산이 이루어지는 경우
	 	동일 코드가 반복할 경우
	 */
	
	// 1 ~ 10 까지의 합 ! 
	
	/*
	int num=0, sum=0;
	num++; sum = sum + num;
	num++; sum = sum + num;
	num++; sum = sum + num;
	num++; sum = sum + num;
	num++; sum = sum + num;
	num++; sum = sum + num;
	num++; sum = sum + num;
	num++; sum = sum + num;
	num++; sum = sum + num;
	num++; sum = sum + num;
	System.out.println(sum);*/
	
	
	// 반복문 사용하면 효율적 ! 
	int num=0, sum=0;
	for(num = 1; num <11; num++) {
		sum+=num;		
	}System.out.println(sum);
	
	
	
	
}
}
