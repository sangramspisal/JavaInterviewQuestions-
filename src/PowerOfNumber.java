import java.util.Scanner;

public class PowerOfNumber {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=in.nextInt();
		System.out.println("Enter the power");
		int b=in.nextInt();
		System.out.println(power(a,b));
		System.out.println(powerRecursion(a,b));
	}


	public static int power(int a,int b){
		int sum=1;
		while(b!=0){
		sum=sum*a;
		b--;
		}
		return sum;
	
	}
	public static int powerRecursion(int a,int b){
		if(b==1){
		return a;
		}
		return a*power(a,--b);
	
	}

}
