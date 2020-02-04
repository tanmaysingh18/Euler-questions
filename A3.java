
public class A3 {

	private static int isPrimeFactors(long l) {
		// TODO Auto-generated method stub
		
	int i;
		for( i=2;i<l;i++) {
		if(l%i==0) {
			l%=i;
				i--;
		}
		}
	return i;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(isPrimeFactors(600851475143L));

	}


	}


