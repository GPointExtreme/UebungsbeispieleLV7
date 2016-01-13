
public class nFactorial {

	public static void main(String[] args) {
		
		System.out.println(fac(5));
		System.out.println(isLuckyNumber(23789));
		
	}
	
	public static int fac(int n) {
		if(n <= 1) {
			return 1;
		}
		return fac(n-1)*n;
	}
	
	public static boolean isLuckyNumber(int n) {
		if(n==0) {
			return false;
		}
		else if((n-8)%10==0) {
			return true;
		}
		return isLuckyNumber(n/10);
	}
	
	public static boolean isLuckyNumber2(int n) {
		if(n==0) {
			return false;
		}
		else if(n%10==8) {
			return true;
		}
		return isLuckyNumber2(n/10);
	}
}
