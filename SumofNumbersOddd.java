package guvi;

public class SumofNumbersOddd {
public static void main(String[] args){
	int sum1=0,sum2=0;
	for(int i=1;i<=45;i++){
		if(i<=15){
			sum1+=i;
		}
		else if(i>15){
			if(i%2!=0){
				sum2+=i;
			}
		}
	}
	System.out.println(sum1);
	System.out.println(sum2);
	
}
}
