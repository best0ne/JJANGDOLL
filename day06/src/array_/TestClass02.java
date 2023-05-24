package array_;

public class TestClass02 {
	public static void main(String[] args) {
		
	
	// 배열 초기화 하는 방법
	
	int arr[] = {10,20,30};
	int[] arr1 = new int[] {100,200,300,400};

	System.out.println("arr : "+arr.length);	// length 개수 확인
	System.out.println("arr1 : "+arr1.length);
	
				// 하드 코딩 ... - > 직접적인 고정값으로 넣으면 유동적이여야 할 때 문제가 생길 수 있음!
	for(int i=0; i<3; i++) {
		System.out.println(i+". "+arr[i]);
	}
	// 위를 좀 더 유동적이게 할 때 직접적인 숫자 보다는 length를 넣어준다!
	for(int i=0; i<arr.length; i++) {
		System.out.println(i+". "+arr[i]);
	}
	
	
	}	
}
