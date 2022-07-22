//https://binarysearch.com/problems/Linked-List-to-Integer
import java.util.*;

/**
 * class LLNode {
 *   int val;
 *   LLNode next;
 * }
 */
class Solution {
    public int solve(LLNode node) {
       /* Stack<Integer> stack = new Stack<Integer>();
        int ans = 0;
        int i = 0;
        while(node!=null){
            stack.push(node.val);
            node =  node.next;
        }
        while(!stack.empty()){
            ans += Math.pow(2,i) * stack.peek();
            i=i+1;
            stack.pop();
        }
        return ans;
        */
        int num = 0 ;
        while(node != null){
            num = num * 2 + node.val;
            node = node.next;
        }
        return num;
    }
}
