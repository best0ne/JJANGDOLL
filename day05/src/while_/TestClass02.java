package while_;

public class TestClass02 {
public static void main(String[] args) {
	
	
	boolean bool = true; // false
	// boolean 자료형 : 참 또는 거짓만 저장하는 자료형 ! 
	
//	for (;bool == true;) {
//		System.out.println("execute");
//	}
	
	//bool == true 를 생략해서 bool 로 사용 !! 
	for (int i=0;bool;i++) {
		System.out.println(i+"execute");
		if(i>10)
			bool =false;
	}
	
	System.out.println("===============");
	// 위의 식을 while문으로 작성해보기
	boolean bool2 = true;
	int j=0;	// 변수 초기화 바깥으로 빼주기 (내부에 넣을 경우 0으로 계속 초기화됨)
	while(bool2==true) {//조건식
		System.out.println(j+"execute");	// 종속문장
		if(j>10)	// 조건문 
		bool2=false;
		j++;	// 증감식 위치 
	}
	
	
	
	
}
}
