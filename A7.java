
public class A7 {

	public static void main(String[] args) {
	int n=1,t=1,c=0,prime=0;	
while(c!=10001)
{
	t=0;
	n++;
for(int i=1;i<n;i++)
{
	if(n%i==0)
		t=t+1;
	
		
}
if(t==2)
{
	c++;
	prime=n;
}
}
System.out.println("the 10001 prime no is"+prime);	
}
}