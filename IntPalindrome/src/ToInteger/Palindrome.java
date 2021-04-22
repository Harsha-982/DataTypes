package ToInteger;
import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String string=sc.nextLine();
		int lengthOfString=string.length();
		boolean flag=false;
		for(int iter=0;iter<lengthOfString/2;iter++) {
			if(string.charAt(iter)==string.charAt(lengthOfString-1-iter)) {
				flag=true;
			
			}
		}
		if(flag==true) 
			System.out.println("Given String "+string +" is Palindrome");
		else 
			System.out.println("Given String "+string +" is Not Palindrome");
	}
}
