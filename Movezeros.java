package movezeros;
import java.util.Arrays;
import java.util.Scanner;
public class Movezeros {
	public static void Zeros(int n) {
		Scanner sc=new Scanner(System.in);
		int sum=0;
		int ar[]=new int[n];
		for(int i=0;i<n;i++) {
			ar[i]=sc.nextInt();
			
			}
		
		 for(int i=0;i<n;i++) {
		    	if(ar[i]!=0) {
		    		ar[sum++]=ar[i];
		    	}
		    }
		    while(sum<n) 
		    	ar[sum++]=0;
		    
		    for(int i=0;i<n;i++)
		    	System.out.print(ar[i]+ "");

		}

	


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Zeros(n);
		
	   
}
}
