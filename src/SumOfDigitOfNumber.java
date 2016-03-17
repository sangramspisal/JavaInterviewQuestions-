import java.util.Scanner;

public class SumOfDigitOfNumber {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number:");
		int a=in.nextInt();
		System.out.println(sum(a));
		
		
	}
	public static int sum(int a){
		if(a==0)
			return 0;
		
		
	return (a%10)+(sum(a/10));
	}

}
