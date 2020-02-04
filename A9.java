
public class A9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a,b,c;
int ans=0;
for(a=1;a<500;a++) {
for(b=1;b<500;b++) {
	c=1000-a-b;
	if(a*a+b*b-c*c==0&&a<b) {
 ans=a*b*c;
 System.out.println(ans);
	}
}
	}

}
}