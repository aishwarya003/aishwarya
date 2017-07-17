package sample;
import java.util.*;
public class HcfOfTwoNumbers {
public static void main(String[] args){
	Scanner s=new Scanner(System.in);
	int m=s.nextInt();
	int n=s.nextInt();
	System.out.println("G.C.D is "+hcf(m,n));
	s.close();
}

public static int hcf(int m,int n){
	if(n==0){
		return m;
	}
	else{
		return (hcf(n,m%n));
	}
}
}
