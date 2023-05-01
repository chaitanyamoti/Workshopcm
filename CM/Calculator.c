//simple calculator using switch statement
#include<stdio.h>
 void main()
{
 char op;
 int a,b;
 
printf ("+ for addition \n");
printf (" - for subtraction \n");
printf (" * for multiplication \n");
printf (" / for division \n");
printf (" modulus for remainder \n");
printf ("Enter your choice: ");
scanf("%c",&op);

switch(op)
 {
   case '+': printf ("Enter two numbers ");
                  scanf("%d%d",&a,&b);
                  printf ("Addition = %d",a+b);
                   break;

    case '-': printf ("Enter two numbers ");
                  scanf("%d%d",&a,&b);
                  printf ("Subtraction = %d",a-b);
                   break;

    case '*': printf ("Enter two numbers ");
                  scanf("%d%d",&a,&b);
                  printf ("Multiplication = %d",a*b);
                   break;

    case '/': printf ("Enter two numbers ");
                  scanf("%d%d",&a,&b);
           if(b!=0)
               {
                  printf ("Division = %d",a/b);
               }
           else
              {
            printf("Division is not possible");
               }
                   break;

   case '%': printf ("Enter two numbers ");
                  scanf("%d%d",&a,&b);
                  printf ("Remainder = %d",a%b);
                   break;
   case '.':printf("exit");
    break;
   default:printf("Invalid operation");
      break;
      }
}

}

