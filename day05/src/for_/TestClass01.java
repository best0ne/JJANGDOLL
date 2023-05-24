package for_;

public class TestClass01 {
public static void main(String[] args) {
	
	// f11 : 디버깅 실행 모드 
	// 원하는 위치 점 찍고 f6 : 한 줄씩 실행 결과 확인
	// ctrl + f2 : 디버깅 종료
	// f8 : run ( 다음 브레이크 포인터에서 멈춤 )
	// f5 : 한 줄 실행 (메소드를 만나면 해당 코드로 이동) / f6과 다른 점 
	// 코드 내부로 이동됨 ! 빠져 나올 때는 f6으로 지나오면 됨 ! 
	
	
	System.out.println("test");
	int sum = 0;
	
	for(int i =0; i<100000; i++) {
		sum+= i;
	}
	
	System.out.println("시작!");
	for(int i = 1; i<=5; i++) {
//		sum += i;
//		System.out.println(sum+","+i);	// < -- 궁금한 내용 출력해보기 !
		if(i%2==0) {
			System.out.println("짝"+i);
		}else {
			System.out.println("홀"+i);
		}
	}
//	System.out.println(sum + ": 끝");
	System.out.println("끝");
	
}
}
