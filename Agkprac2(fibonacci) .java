import java.util.Scanner;
class prac3{
	public static void main(String[] args){
		System.out.println("Enter the Upper Limit for series");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a,b,c;
		a=0;
		b=1;
		while(a<=n){
			c=a+b;
			System.out.println(a);
			a=b;
			b=c;
		} 
	}
}
