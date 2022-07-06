package prac;

public class FindMissingNumber {

	public static int missingNumber(int[] arr) {
		int low = 0 ; 
		int high = arr.length -1 ;
		
		while(low <= high) {
			int mid = low + (high - low)/2;
			
			if(arr[mid] != mid+1 && arr[mid-1]==mid) {
				return mid+1;
			}
			else if(arr[mid] != mid+1) {
				high = mid-1;
			}
			else {
				low = mid + 1;
			}	
		}
		return -1 ;	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[] = { 1, 2, 3, 4, 5,7,8 };
		 System.out.println("Missign number is ******" + FindMissingNumber.missingNumber(arr));
	}

}
