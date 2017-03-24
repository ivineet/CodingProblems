package array;

//find missing element in duplicated array

public class Findmissing {

	static int findMissingElement(int A[],int B[]){
		if((A.length != B.length-1) || (B.length != A.length-1)){
			return -1;
		}
		
		return 1;
	}
	
	public static void main(String[] args) {
		
		int arr1[] = new int[]{1,2,3,4,5};
		int arr2[] = new int[]{2,3,4};
		
		System.out.print(findMissingElement(arr1, arr2));
	}
}
