package quiz;

import java.util.Scanner;

public class Quiz풀기 {
public static void main(String[] args) {
	
	// 로그인 프로그램 구현
	
	
	
	
	Scanner input = new Scanner(System.in);
	String[] id = new String[5];
	String[] pwd = new String[5];
	int num=0,i=0;
	String inputId=null, inputPwd=null;
	
	while(true) {
	System.out.println("==================");
	System.out.println("1.로그인 2. 회원가입 3. 회원 보기 4. 프로그램 종료");
	System.out.print(">>> : ");
	num = input.nextInt();
	switch(num) {
	
	case 1 : 
		if(id.length ==0) {
			System.out.println("회원가입 먼저 해주세요!");
			break;
		}
		System.out.println("* 로그인 화면입니다 *");
		System.out.print("아이디 입력 : ");
		inputId = input.next();
		System.out.print("패스워드 입력 : ");
		inputPwd = input.next();
		
		for(i=0; i<id.length; i++) {
			if(inputId.equals(id[i])) {
				if(inputPwd.equals(pwd[i])) {
					System.out.println("로그인 성공!");
				}else {
					System.out.println("비밀번호가 틀렸습니다!");
				}break;
			}
		}
		if(i==id.length) {
			System.out.println("존재하지 않는 아이디 입니다!");
		}break;
		
		
		
		
	case 2 :
		if(id[id.length-1]!=null) {
			System.out.println("저장 공간이 없습니다!");
			break;
		}
		while(true) {
			System.out.println("저장할 id 입력");
			inputId = input.next();
			for(i=0; i<id.length; i++) {
			if(inputId.equals(id[i])) {
				break;
			}else if(id[i]==null) {
				break;
			}
		}
			if(id[i]==null) {
				break;
			}
			System.out.println("존재하는 아이디입니다.\n다시 입력...");
		}
		System.out.println("저장할 패스워드 입력 : ");
		inputPwd = input.next();
		id[i]= inputId;
		pwd[i] = inputPwd;
		System.out.println("등록 성공!\n회원가입을 축하드립니다!");
		break;
		
			
		
	case 3 : 
		if(id[i]==null) {
			System.out.println("저장된 정보가 없습니다.");
			break;
		}
		System.out.println("=====id/pwd=====");
		System.out.println("----------------");
		for(i=0; id[i]!=null; i++) {
			System.out.println(id[i]+"\t"+pwd[i]);
			if(i==id.length-1)
				break;
		}
		System.out.println("-----------------");
		break;
		default :
			System.out.println("다시 입력 ...");
		
//		case 4 :
//			System.out.println("프로그램을 종료합니다.");
	}
	}

	
	

}
}
