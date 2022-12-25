package functionalprogramming.structre;

import java.util.Arrays;
import java.util.List;

public class FP10HigherOrderfunc {

	public static void main(String args[])
	{
		List<String> courses=Arrays.asList("Spring","Springboot","aws","spring data jpa","microservices");
		
		courses.stream().filter(course->course.length()>10).map(String::toUpperCase).forEach(System.out::println);
	}
}
