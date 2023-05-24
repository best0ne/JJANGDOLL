package while_;

public class TestClass01 {
public static void main(String[] args) {
	/*
	 while(조건식){
	 	종속문장;
	 	}
	 */
	
	// while 문 
	/*
	  int sum = 0, i = 1; 
	 
	  while(i<=10) { 
	  sum += i; 
	  i++; } System.out.println("1~10 합 : "+sum);
     */
	
	// for 문
	int sum =0;
	for(int i=1;i<=10;i++) {
		sum+=i;
	}System.out.println("1~10 합 : "+sum);
	
	// 상황에 따라 효율적인 것으로 골라 쓰기 !!! 

}
}
