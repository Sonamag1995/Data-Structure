https://binarysearch.com/problems/A-Strictly-Increasing-Linked-List
import java.util.*;

/**
 * class LLNode {
 *   int val;
 *   LLNode next;
 * }
 */
class Solution {
    public boolean solve(LLNode head) {
       /* int prev = -1;
        while(head != null){
            int currentVal = head.val;
            if(currentVal <= prev)
                    return false;
            head = head.next;
            prev = currentVal;
        }
        return true;
        */
        if(head == null) return true;
        if(head.next == null) return true;
        else return (head.val < head.next.val) && solve(head.next);
    }
}
