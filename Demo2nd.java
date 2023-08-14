class Demo implements Runnable
{
 	public void run()
	{
            System.out.println("DemoThread is running");
	}

}
class Demo2 implements Runnable
{
 	public void run()
	{
            System.out.println("Demo2Thread is running");
	}

}
public class Demo2nd
{
public static void main(String ar[]){
Demo d1=new Demo();
Demo2 d2=new Demo2();
Thread t1=new Thread(d1,"hi");
Thread t2=new Thread(d2,"bye");
t1.start();
try{
Thread.sleep(5000);
}catch(Exception e){
System.out.println(e.getMessage());
}
t2.start();
System.out.println(t1.getName());
System.out.println(t2.getName());
}

}