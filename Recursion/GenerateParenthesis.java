package recursion;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {

	 static void findAll(String cur, int openCount, int closeCount, List<String> result, int n){
	        if(cur.length()==2*n){
	            result.add(cur);
	            return;
	        }
	        if(openCount < n) {
	            findAll(cur+"(", openCount+1, closeCount, result, n);
	        }
	        if(closeCount < openCount){
	            findAll(cur+")", openCount, closeCount+1, result, n);
	        }
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<String> result = new ArrayList<String>();
		 int n=3;
		 findAll("(", 1, 0, result, 4);
		 System.out.println(result);
	}

}
