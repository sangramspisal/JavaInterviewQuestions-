
public class Fibonacci {

	public static void main(String[] args) {
	int a=5;
	fibonacci(a);
	System.out.println();
	 for (int i = 0; i < a; i++) {
         System.out.print(fibonacci2(i) + " ");
     }
	System.out.println();
	 for (int i = 1; i <= a; i++) {
         System.out.print(fibonacci1(i) + " ");
     }
	
	}
	public static void fibonacci(int a){
		
		int num1[]=new int[a];
		if(a>0){		
		num1[0]=0;
		System.out.print(0+" ");
		}
		if(a>0){
		num1[1]=1;
		System.out.print(1+" ");
		}
		for(int i=2;i<a;i++){
			num1[i]=num1[i-1]+num1[i-2];
			System.out.print(num1[i]+" ");
		}
		
		}
	public static int fibonacci1(int a){
		if(a==1)
			return 0;
		else if(a==2)
			return 1;else 
		return fibonacci1(a-1)+fibonacci1(a-2);
	}
	public static int fibonacci2(int a){
		 if(a <= 1){
		  return a;
		 }else{
		  return fibonacci2(a-1) + fibonacci2(a-2);
		 }
		}
		
	

}
