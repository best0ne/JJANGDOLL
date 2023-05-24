package array_;

public class TestClass05 {
public static void main(String[] args) {
	
	// 홀짝 구분하는 문제 세가지 풀이 
	
	// 1. if문 활용
	int[] arr = {10,13,17,25,30,54};
	
	for(int i=0; i<arr.length; i++) {
		if(arr[i]%2==0) {
			System.out.println("짝수 : "+arr[i]);
		}
		else {
			System.out.println("홀수 : "+arr[i]);
		}
	}
	// 2. continue 활용 
	System.out.println("==================");
	for(int i=0; i<arr.length; i++) {
		if(arr[i]%2==0) {
			System.out.println("짝수 : "+arr[i]);
			continue;
		}
		System.out.println("홀수 : "+arr[i]);
		}
	
	// 3. for each 문 사용 
	System.out.println("==================");
	for(int a : arr) {
		if(a%2==0) {
			System.out.println("짝수 : "+a);
			continue;
		}
		else {
			System.out.println("홀수 : "+a);
		}
	}
	
}
}
