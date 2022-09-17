package assignment1;
import java.io.*;
import java.util.Scanner;

class NegativeNumberNotAllowedException extends Exception {
	 int num;
	NegativeNumberNotAllowedException(int num){
		this.num=num;
	}
	public String toString() {
		 return "given num"+num+"is nagative";
	}
}
class  NumberNotPrimeException extends Exception {
	 
	
	public String toString() {
		 return "given num is not an prime";
	}
}


public class prime {
       
	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
		int num;
		int flag=0;
		 
		num=sc.nextInt();
		if(num<0) {
			throw new NegativeNumberNotAllowedException(num);
			
		}
		else {
			
			for(int i=2;i<num;i++) {
				if(num%i==0) {
					break;
					}
				else {
					flag++;
				}
				
			}
		}
		if(flag==0) {
			
			throw new NumberNotPrimeException();
		}
		else {
			System.out.println("given num"+num+"is a prime");
		}
		

	}

}
