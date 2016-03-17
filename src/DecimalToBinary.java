import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number:");
		int a=in.nextInt();
		System.out.println("Binary format is:");
	    decimalToBinary(a);	
		

	}
	public static void decimalToBinary(int a){
		if(a>0){
			decimalToBinary(a/2);
			
		}
		System.out.print(a%2);
	}

}
