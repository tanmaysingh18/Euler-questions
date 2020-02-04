
public class A5 {
  static long lcm(long n, long m ) {
  
	long lcm;
	long hcf;
	lcm = (n*m)/hcf(n,m);
  
	return lcm;
  }
   static long hcf(long n, long m)	{
 
		while(n!=m) {
			if(n>m) {
				n=n-m;}
			else {
			m=m-n;	
			}}
			return n;
			}
		public static void main(String[] args) {
		// TODO Auto-generated method stub
long p=1;
for(long i=11;i<=20;i++) {
	p=lcm(p,i);
}
System.out.println("lcm is "+ p);
		}
		}
