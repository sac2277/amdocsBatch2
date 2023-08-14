import java.util.*;
import java.util.stream.Stream;
public class DemoStream
{

	public static void main(String ar[])
	{
  		List<Integer> nums = Arrays.asList(2,7,4,9,3,1);
		nums.forEach(n ->System.out.println(n));
                 System.out.println("______________");
		nums.stream().sorted().map(n->n*3).filter(n->n%2!=0).forEach(n ->System.out.println(n));
                
		
	}

}