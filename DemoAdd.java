import java.util.*;

public class DemoAdd
{
	static public void main(String ar[])
	{
	char c1='5';
	System.out.println(c1);
	Float f1=23.45f;
	System.out.println(f1);
 	Boolean b1=true;
	System.out.println(b1);
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your name");
        String s1=sc.nextLine();
        System.out.println("hi your name is "+ s1);
        System.out.println("Enter first number");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd number");
	 int num2 = sc.nextInt();

	int sum=num1+num2;
         System.out.println("Addition of "+ num1 +" and "+ num2 +" = " + sum);
	}

}