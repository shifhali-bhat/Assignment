package assignment1;

public class builtInException extends Exception {

	public static void main(String[] args) {
		try {
            int a = 30, b = 0;
            int c = a / b; // cannot divide by zero
            System.out.println("Result = " + c);
        }
        catch (ArithmeticException e) {
            System.out.println("Can't divide a number by 0");
        }
		 try {
	            int a[] = new int[5];
	            a[6] = 9; // accessing 7th element in an array of
	            // size 5
	        }
	        catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("Array Index is Out Of Bounds");
	        }
		 try {
	            String a = null; // null value
	            System.out.println(a.charAt(0));
	        }
	        catch (NullPointerException e) {
	            System.out.println("NullPointerException..");
	        }
		// TODO Auto-generated method stub

	}

}
