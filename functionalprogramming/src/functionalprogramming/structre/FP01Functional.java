package functionalprogramming.structre;

import java.util.Arrays;
import java.util.List;

public class FP01Functional {

	public static void main(String args[])
	{
		printAllStructreListinFunctional(Arrays.asList(1,2,3,4,9,8,12,6,4));
		System.out.println("**********************");
		printEvenNumberFunctional(Arrays.asList(1,2,3,4,9,8,12,6,4));
		System.out.println("**********************");
		printOddNumberFunctional(Arrays.asList(1,2,3,4,9,8,12,6,4));
		List<String> courses=List.of("spring","hibernate","java","springboot","springmicroservice");
		System.out.println("**********************");
		printAllCoursesIndividually(courses);
		System.out.println("**********************");
		printSquareOfEvenNumberFunctional(Arrays.asList(1,2,3,4,9,8,12,6,4));
		System.out.println("**********************");
		printCubeOfOddNumberFunctional(Arrays.asList(1,2,3,4,9,8,12,6,4));
		System.out.println("**********************");
		printNumberOfCharactersInEachCourseName(courses);
	}
	private static void print(int no)
	{
		System.out.println(no);
	}
	private static boolean isEven(int no)
	{
		return no%2==0;
	}

	private static void printAllStructreListinFunctional(List<Integer> number) {
		// TODO Auto-generated method stub
		//how to loop the numbers
//		for(int i:number)
//		{
//			System.out.println(i);
//		}
//		
		//for functional approach try to convert the numbers in streams.
		//number.stream().forEach(FP01Functional::print);//static method reference here FP01Functional is the class and print is the static method.
		//number.stream().forEach(t->System.out.println(t)); //by lambda
		number.stream().forEach(System.out::println);
	}
	private static void printEvenNumberFunctional(List<Integer> number) {
		// TODO Auto-generated method stub
		//how to loop the numbers
		//only allow even numbers. add filter
//			  number.stream()
//					.filter(FP01Functional::isEven)
//					.forEach(System.out::println);
		//by lambda expression
		number.stream()
					.filter(no->no%2==0) //lambda 
					.forEach(System.out::println);
		
}
	//print all odd numbers
	private static void printOddNumberFunctional(List<Integer> number)
	{
		number.stream()
					.filter(no->no%2!=0)
					.forEach(System.out::println);
	}
	//print each courses individually
	private static void printAllCoursesIndividually(List<String> courses)
	{
		courses.stream().forEach(System.out::println);
		//print all those courses which started with spring
		System.out.println("---------------------------------");
		courses.stream()
					.filter(course->course.startsWith("spring"))
					.forEach(System.out::println);
		System.out.println("---------------------------------");
		//print courses which have atleast 4 letters
		courses.stream()
				.filter(course->course.length()>=4)
				.forEach(System.out::println);
		
	}
	//prit squares of even numbers
	private static void printSquareOfEvenNumberFunctional(List<Integer> number)
	{
		number.stream()
					.filter(no->no%2==0)
					.map(no->no*no)
					.forEach(System.out::println);
	}
	//print the cubes of odd numbers
	private static void printCubeOfOddNumberFunctional(List<Integer> number)
	{
		number.stream()
					.filter(no->no%2==1)
					.map(no->no*no*no)
					.forEach(System.out::println);
	}
	//print the number of characters in each course name
	private static void printNumberOfCharactersInEachCourseName(List<String> courses)
	{
		courses.stream()
					.map(course->course+" "+course.length())
					.forEach(System.out::println);
	}
	
	
	
}
