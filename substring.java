package assignment1;
import java.util.Scanner;

class substringNotFoundException extends Exception {
	 
	
	public String toString() {
		 return "given subtext is not there line of text  ";
	}
}
public class substring {

	public static void main(String[] args)throws Exception {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter the line of text");
		 String s1=sc.next();
		 String s2="SDMCET";
		 
		 boolean res= s1.contains(s2);
		 if(res) {
			 System.out.println("subdtring"+s2+" "+"found in the line of text");
		 }
		 else {
			  throw new substringNotFoundException();
		 }
		// TODO Auto-generated method stub

	}

}
