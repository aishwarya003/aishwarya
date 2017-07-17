package sample;

public class countthecharacters {
public static void main(String[] args){
	String s="Hi@ 5// sfv+0";
	int alpha=0;
	int digit=0;
	int space=0;
	int character=0;
	for(char a:s.toCharArray()){
		
		if(Character.isAlphabetic(a)){
			alpha++;
		}
		else if(Character.isDigit(a)){
			digit++;
		}
		else if(Character.isSpace(a)){
			space++;
		}
		else{
			character++;
		}
	}
	System.out.println("Alphabets count "+alpha);
	System.out.println("Digit Count "+digit);
	System.out.println("Space count "+space);
	System.out.println("Special Character count "+character);
}
}
