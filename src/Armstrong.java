import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Please enter the number:");
		int a=in.nextInt();
		armstrong(a);

	}
	public static void armstrong(int a){
		int sum=0;
		int m=a;
		while(a%10!=0){
			sum=((a%10)*(a%10)*(a%10))+sum;
			System.out.println(sum);
			a=a/10;
			
		}
	System.out.println(sum);
		if(m==sum){
		System.out.println("Number is armstrong:");
		}
		else{
			System.out.println("Number is not armstrong:");
		}
	}

}
