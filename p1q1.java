package csw2;
import java.util.*;

public class p1q1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s = new Scanner (System.in);
int n= s.nextInt();
int a[]=new int[n];

for(int i=0;i<n;i++) {
	a[i]=s.nextInt();
	}

int k= s.nextInt();

if(n%k==0) {

for(int x=0;x<n;x=x+k) {
	for(int i=0;i<(k/2);i++) {
		int temp = a[i+x];
		a[i+x]=a[x+k-1-i];
		a[x+k-1-i]=temp;
		}	
}
}	
else {
	for(int x=0;x<n-(n%k);x=x+k) {
		for(int i=0;i<(k/2);i++) {
			int temp = a[i+x];
			a[i+x]=a[x+k-1-i];
			a[x+k-1-i]=temp;
			}	
	}
	for(int m=n-(n%k);m<n;m++) {
		int w=1;
		int temp=a[m];
		a[n-w]=a[m];
		a[m]=a[n-w];
		w++;
	}
}
for(int i=0;i<n;i++) {
	System.out.println(a[i]);
	}
	}

}
