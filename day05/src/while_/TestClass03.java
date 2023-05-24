package while_;

public class TestClass03 {
public static void main(String[] args) {
	//break / continue
	
	int i = 0;
	while(i<5) {
		i++;
		if(i==3) {
			System.out.println(33333);
			//break;
			continue;
		}
		System.out.println("i : "+i);
	}
	System.out.println("다음 문장들 실행");
	
	// break는 if문 탈출 x / 반복문 탈출 용도 
	
	
}
}
