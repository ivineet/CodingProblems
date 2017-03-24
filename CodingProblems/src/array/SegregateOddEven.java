package array;

//Segregate odd and Even Numbers in the array

public class SegregateOddEven {
	
	static void printArray(int AB[]){
		
		System.out.println( "printarray ");
		for(int i = 0; i < AB.length; ++i){
			System.out.print(AB[i] + " ");
		}
		System.out.println();
	}
	
	static void segregateOddEven1(int A[]){
		int left = 0;
		int right = A.length-1;
		//int temp;
		
		while(left < right){
			
			//skip if even number
			while (((A[left] % 2) == 0) && left < right )
				left++;
			
			////skip if odd number
			while (((A[right] % 2) == 1) && left < right )
				right--;
			
			//to swap odd and even no.
			while((left < right) && ((A[left] % 2) != 0) && ((A[right] % 2) != 1) ){
				int temp = A[left];
				A[left] = A[right];
				A[right] = temp;
				left++;
				right--;
				//printArray(A);
			}
		}
		//A[2] = 100;
		
	}

	public static void main(String[] args) {
		int array1[] = new int[]{10,9,1,8,2,7,8,1};
		int arr_len = array1.length;
		
		printArray(array1);
		
		segregateOddEven1(array1);
		
		printArray(array1);
	}
}
