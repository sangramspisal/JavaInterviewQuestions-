import java.util.Scanner;

public class Gcd {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		System.out.println("Enter First number:");
		int a=in.nextInt();
		System.out.println("Enter Second number:");
		int b=in.nextInt();
		System.out.println("GCD Of the two numbers "+a+","+b+" is:"+GCD(a,b));
		System.out.println("LCM Of the two numbers "+a+","+b+" is:"+LCM(a,b));
		
		
	}
public static int LCM(int a,int b){
		
		return (a/GCD(a,b))*(b/GCD(a,b))*(GCD(a,b));
	}
	public static int GCD(int a,int b){
		
		
		if(b==0){
			
			return a;
			}
		return GCD(b,a%b);
	}
	

}
