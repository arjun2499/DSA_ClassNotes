import java.util.Hashtable;

public class Fibonacci {

	private static Hashtable<Integer, Long> memo=new Hashtable<>();
	
	public static void main(String[] args) {


		int n=5;
		long result=fibonacci(n);
		System.out.println("Fibonacci "+ n+" "+"="+result);
	}

	private static long fibonacci(int n) {
		if(n<0) {
			throw new IllegalArgumentException("Input Must Be a Non-negative Number");
		}
		if(memo.contains(n)) {
			return memo.get(n);
		}
		if(n==0) {
			return 0;
		}else if(n==1) {
			return 1;
		}
		long result=fibonacci(n-1)+fibonacci(n-2);
		memo.put(n, result);
		return result;
	}

	

}
