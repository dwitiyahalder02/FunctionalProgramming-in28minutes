package functionalprogramming.structre;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class FP06methodrefference {

	private static void print(String str)
	{
		System.out.println(str);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> courses=Arrays.asList("Spring","Hibernate","duckduckgo");
		courses.stream().
		    map(String::toUpperCase)
			//map(str->str.toUpperCase()).
			.forEach(FP06methodrefference::print);
		//FP06methodrefference::print ->static method reference
		
		Supplier<String> suppiler=()->new String();
		//constructor reference
		Supplier<String> supp=String::new;

	}

}
