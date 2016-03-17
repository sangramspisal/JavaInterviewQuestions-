import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a number:");
		int a=in.nextInt();
        System.out.println("Factorial of number is:"+factorial(a));

	}
	public static int factorial(int a){
		if(a==0)
			return 1;
		if(a==1)
				return 1;
		return a*factorial(a-1);
	}

}
