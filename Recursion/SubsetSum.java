package recursion;

public class SubsetSum {
	
	private static Boolean findsum(int[] arr, int n, int k) {
		// TODO Auto-generated method stub
		if(k == 0) return true;
		if(n== 0) return false;
		if(k < 0 || n < 0) return false;	
		return findsum(arr, n-1, k-arr[n-1]) || findsum(arr, n-1, k);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int[] arr =  new int[] {1,2,3,57};
    int k = 6;
    Boolean result = findsum(arr, arr.length, k); 
    System.out.println(result);
	}
}
