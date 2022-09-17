package assignment1;

import java.io.*;

class vowelsNotAllowedException extends Exception {
	
	public String toString() {
		return "vowels are not allowed";
	}
}
public class alphabet {

	
	public static void main(String[] args)throws Exception {
		FileInputStream fis= new FileInputStream("D:\\2SD20CS053\\assignment1\\src\\assignment1\\alphabet");
		// TODO Auto-generated method stub
        FileOutputStream fout=new FileOutputStream("D:\\2SD20CS053\\assignment1\\src\\assignment1\\consonant");
         char ch;
        while((ch=(char)fis.read())!='\0') {
        	 
        	 if(ch!='a'||ch!='e'||ch!='i'||ch!='o'||ch!='u') {
        		  fout.write(ch);
        		    
        	 }
        }
        while((ch=(char)fis.read())!='\0') {
       	 
       	 if(ch=='a'&&ch=='e'&&ch=='i'&&ch=='o'&&ch=='u') {
       		 throw new vowelsNotAllowedException();
       		    
       	 }
	}
}
}


