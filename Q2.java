
public class Q2 {

	public static void main(String[] args) {
		int n=4000000;
		int a=0,b=1;
		int c=0,s=0;
		while(c<n) {
			c=a+b;
			a=b;
			b=c;
			if(c%2==0) {
				s=s+c;
				System.out.println(s);
			}
		}
			

	}

}
