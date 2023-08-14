import java.util.*;
public class DemoSwitch
{
	public static void main(String ar[])
	{
        Scanner sc=  new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd number");
	 int num2 = sc.nextInt();
        System.out.println("1 for Addition\n 2 for subtraction\n 3 for mul\n 4 for div");
         System.out.println("Enter your choice");
        int ch=sc.nextInt();
        	switch(ch)
		{
		case 1:
                 int result=num1+num2;
                 System.out.println("Addition of "+ num1 +" and "+ num2 +" = " + result);
 		//break;
		case 2:
                result=num1-num2;
                 System.out.println("Sub of "+ num1 +" and "+ num2 +" = " + result);
 		//break;
		case 3:
                 result=num1*num2;
                 System.out.println("mul of "+ num1 +" and "+ num2 +" = " + result);
 		//break;
		case 4:
                 result=num1/num2;
                 System.out.println("Div of "+ num1 +" and "+ num2 +" = " + result);
 		//break;
		default:
		System.out.println("wrong choice");

		}


	}

}