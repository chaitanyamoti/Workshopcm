import java.util.*;

class avsum{
public static void main(String args[]){
int sum=0;
float avg=0;
Scanner sc= new Scanner(System.in);
System.out.println("Enter the size of array:");
int n = sc.nextInt();
int [] arr= new int[n];
System.out.println("Enter the element in array:");
for(int i=0;i<n;i++)
{
System.out.println("Enter the " + (i+1)+ " element in array:");
arr[i] = sc.nextInt();
sum=sum+arr[i];

}
avg=(float)sum/n;
System.out.println(" The sum of element in array:"+sum);
System.out.println(" ");
System.out.println(" The average of element in array:"+avg);
}
}

