interface DemoInt
{
	void show();
}
/*class Demoimp implements DemoInt{

 	public void show()
	{
        System.out.println("Hi Welcome to session");
	}
}*/
public class DemoLF
{
	public static void main(String ar[])
	{

         DemoInt di=()->System.out.println("Hi Welcome to session");
          di.show();     
	}
}