package functionalprogramming.structre;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Fp09StringMisselinious {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> courses=Arrays.asList("spring","data","jpa","springboot");
		System.out.println(courses.stream().collect(Collectors.joining()));
		System.out.println(courses.stream().map(x->x+",").collect(Collectors.joining()));
		System.out.println(courses.stream().collect(Collectors.joining(",")));
		
		System.out.println("Spring".split(""));
		
		System.out.println(courses.stream().map(course->course.split(" ")).collect(Collectors.toList()));
		
		//flatmap -> each element of stream replaced with content of mapped stream
		//Mapping Function -> Arrays::stream
		//["S","P","R","I","N","G"]=>"S","P","R","I","N","G"
		//["A","W","S"]=>"A","W","S"
		System.out.println(courses.stream().map(course->course.split("")).flatMap(Arrays::stream).collect(Collectors.toList()));
		
		//distinct characters
		System.out.println(courses.stream().map(course->course.split("")).flatMap(Arrays::stream).distinct().collect(Collectors.toList()));

	}

}
