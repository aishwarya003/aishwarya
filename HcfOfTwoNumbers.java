package sample;
import java.util.*;
public class HcfOfTwoNumbers {
public static void main(String[] args){
	Scanner s=new Scanner(System.in);
	int a=s.nextInt();
	int b=s.nextInt();
	System.out.println("G.C.D is"+hcf(a,b));
	s.close();
}

public static int hcf(int a,int b){
	if(b==0){
		return a;
	}
	else{
		return (hcf(b,a%b));
	}
}
}
