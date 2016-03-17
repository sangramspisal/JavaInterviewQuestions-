import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	System.out.println("Please enter the number:");
	int c=in.nextInt();
	primeno(c);
	
	

	}
	public static void primeno(int n){
	
	for(int i=2;i<=n/2;i++){
	if(n%i==0)	{	
	System.out.println("Entered number is  not prime:");		
	return;
	}
	}	
	if(n>1){
	System.out.println("Entered number is  prime:");
	return;
	}
	else{
	System.out.println("Entered number is  not prime:");
	return;
	}
	}

}
