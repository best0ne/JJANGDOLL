package while_;

public class Quiz만들기 {
public static void main(String[] args) {
	
	// 알파벳 A ~ Z 까지 출력하는 프로그램 구현하기 - while문 활용
	// (출력 형태 -> A-B-C-D-E-F-G-H-I-J-K-L-M-N-O-P-Q-R-S-T-U-V-W-X-Y-Z
	// Z 뒤에는 - 표시 안 나게 할 것 ! 
	
	
	// 아스키 코드 활용해서도 풀 수 있음 ! !
	char a = 'A';
	while(a<='Z') {
		System.out.print(a++ + "-");
		if(a=='Z') {
			System.out.print(a++);
		}
	}
	
}
}
