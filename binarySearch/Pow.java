package prac;

public class Pow {
     
	public static double MyPow(double x , int n) {
		return multiply( x , n);
	}
	
	static double multiply(double x, long n) {
		// TODO Auto-generated method stub
		if(x==0) return 0;
		if(n==0) return 1;
		if(n==1) return x; 
		if(n<1) return multiply(1/x ,-n);
		double res =  multiply(x*x, n/2);
		if(n%2==1){
	       res = x * res ;  
	    }
	    return res; 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double ans =  MyPow(2.00000 , 10);
	//	double ans =  MyPow(1.00000 , -2147483648);
		System.out.println(ans);
	}
	/*1.00000
	-2147483648 */

}
