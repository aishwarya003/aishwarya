package hunter;

import java.util.Scanner;

public class Set13_1 {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
	int n=input.nextInt();
	 int m=n/2+1;
	int space=0;
	for(int kk=0;kk<m;kk++){
		
		int ch=96+m;
		for(int j=m;j>kk;j--){
			System.out.print((char)ch--+" ");
		}
		int print=space-1;
		while(print-1>0){
			System.out.print(" ");
			print--;
		}
		ch=kk==0?(ch++)+2:(ch++)+1;
		int l=kk==0?kk+1:kk;
		for(int k=m;k>l;k--){
			System.out.print((char)ch+++" ");
		}
		System.out.println();
		space+=4;
	}
	space-=8;
	for(int i=m;i<n;i++){
		int ch=96+m;
		for(int j=i+1;j>=m;j--){
			System.out.print((char)ch--+" ");
		}

		int print=space-2;
		while(print>0){
			System.out.print(" ");
			print--;
		}
		ch=i==n-1?(ch++)+2:(ch++)+1;
		int l=i==n-1?i-1:i;
		for(int k=m;k<=l+1;k++){
			System.out.print((char)ch+++" ");
		}
		System.out.println();
		space-=4;
	}
	input.close();

}
}
