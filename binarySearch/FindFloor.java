package binarySearch;

public class FindFloor {

	public static int floor(int[] arr ,int x) {
		  int start = 0 ,end = arr.length-1, mid = 0 ;
		  int ans = 0;
	      while(start <= end){  
	        	mid = (start + end )/2;

	        	if( arr[mid]==x) { 
	        		return arr[mid] ;
	        	}
	        	else if(x > arr[mid]) {
	        		ans= arr[mid];
	        		start = mid+1;
	        	}else {
	        		end = mid-1;
	        	} 
	        }
			return ans;         
	}	
	public static void main(String[] args) {
		System.out.println(FindFloor.floor(new int[]{1,2,3,4,5,6,7}, 3));
		System.out.println(FindFloor.floor(new int[]{1,2,3,4,10,17,20}, 9));	
	}
}
