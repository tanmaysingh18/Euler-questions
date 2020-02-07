
public class Q2 {

	public static void main(String[] args) {
		int n=4000000;
		int a=0,b=1;
		int c=0,s=0;
		c=a+b;
		while(c<n) {
	          if(c%2==0) {
		  s=s+c;
		  }
          a=b;
	  b=c;
	  c=a+b;}		
	System.out.println(s);
			}
		}
			

