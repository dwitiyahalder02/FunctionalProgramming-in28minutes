package functionalprogramming.structre;

import java.util.Arrays;
import java.util.List;

public class FP12Replaceall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> courses=Arrays.asList("Spring","Springboot","aws","spring data jpa","microservices");
		courses.replaceAll(str->str.toUpperCase());
		System.out.println(courses);
		
		//courses.removeIf(course->course.length()<6);
		//System.out.println(courses);

	}

}
