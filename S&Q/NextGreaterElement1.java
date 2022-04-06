package stack;
import java.util.*;
public class NextGreaterElement1 {

	public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
		Stack<Integer> stack = new Stack<Integer>();
		HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
		int[] res = new int[nums1.length];
		for(int i=nums2.length-1;i>=0 ; i--) {
			while(!stack.isEmpty() && stack.peek() <= nums2[i]) {
				stack.pop();
			}
			map.put(nums2[i], stack.isEmpty()?-1:stack.peek());
			stack.push(nums2[i]);
			
		}
		for(int i =0 ; i< nums1.length ; i ++) {
			res[i] = map.get(nums1[i]);
		}	
		return res;      
	}
	public static void main(String[] args) {
		int[] ans = NextGreaterElement1.nextGreaterElement(new int[] {2,4}, new int[] {1,2,3,4});
		for(Integer i : ans) {
			System.out.println(i);
		}
	}

}
