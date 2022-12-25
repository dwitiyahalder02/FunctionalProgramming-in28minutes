package functionalprogramming.structre;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FP04Functional4 {

	public static void main(String args[])
	{
		//printAllStructreList(Arrays.asList(1,2,3,4,9,8));
		//printEvenNumberStructreList(Arrays.asList(2,4,6,7,1,9));
		List<Integer> numbers = Arrays.asList(2,4,6,7,1,9,9,4,6);
		List<Integer> doubleNumbers=doubleList(numbers);
		System.out.println(doubleNumbers);
		List<Integer> evenNumbers=evenNumList(numbers);
		System.out.println(evenNumbers);
		List<String> courses=Arrays.asList("spring","data","jpa");
		System.out.println(lengthofCourses(courses));
		
	}

	private static List<Integer> lengthofCourses(List<String> courses) {
		// TODO Auto-generated method stub
		return courses.stream()
				      .map(course->course.length())
				      .collect(Collectors.toList());
	}

	private static List<Integer> evenNumList(List<Integer> numbers) {
		// TODO Auto-generated method stub
		return numbers.stream()
						.filter(x->x%2==0)
						.collect(Collectors.toList());
	}

	private static List<Integer> doubleList(List<Integer> numbers) {
		// TODO Auto-generated method stub
		//collecting stream elements to list
		return numbers.stream()
						.map(x->x*x)
						.collect(Collectors.toList()); //terminal operation
	}
	
	


   
	
}
