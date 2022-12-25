package functionalprogramming.structre;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FP03Functional3 {

	public static void main(String args[])
	{
		//printAllStructreList(Arrays.asList(1,2,3,4,9,8));
		//printEvenNumberStructreList(Arrays.asList(2,4,6,7,1,9));
		List<Integer> numbers = Arrays.asList(2,4,6,7,1,9,9,4,6);
		int sum=sumOfSquares(numbers);
		int sum1=sumOfCubes(numbers);
		int odd=sumOfOddNumbers(numbers);
		System.out.println(sum);
		System.out.println("*************");
		System.out.println(sum1);
		System.out.println("*************");
		System.out.println(odd);
		System.out.println("**************");
		distinctno(Arrays.asList(2,4,6,7,1,9,9,4,6));
		System.out.println("**************");
		List<String> courses=Arrays.asList("spring","data","jpa");
		comparebyLength(courses);
		
	}


   //square every number in the list and find sum of squares
	private static int sumOfSquares(List<Integer> numbers) {
		Optional<Integer> reduce = numbers.stream()
					.map(x->x*x)
					.reduce(Integer::sum);
		return reduce.get();//get na korle value ta return hobe na
	}
	//square every number in the list and find sum of squares
	private static int sumOfCubes(List<Integer> numbers) {
		Optional<Integer> reduce = numbers.stream()
					.map(x->x*x*x)
					.reduce(Integer::sum);
		return reduce.get();//get na korle value ta return hobe na
	}
	//find sum of odd numbers in the list
	private static int sumOfOddNumbers(List<Integer> numbers) {
		Optional<Integer> reduce = numbers.stream()
					.filter(x->x%2==1) //intermediate operation
					.reduce(Integer::sum);
		return reduce.get();//get na korle value ta return hobe na
	}
	//find distinct numbers in the list
	private static void distinctno(List<Integer> numbers)
	{
		//find distinct numbers in the list
		numbers.stream()
				.distinct() //intermediate operation
				.forEach(System.out::println);
		System.out.println("------------------");
		//find sorted numbers in the list
		numbers.stream()
				.sorted() //intermediate operation
				.forEach(System.out::println);
		System.out.println("-----------------");
		//natural order sorting
		numbers.stream()
				.sorted(Comparator.naturalOrder())
				.forEach(System.out::println);
		//reverse order sorting
		numbers.stream()
			.sorted(Comparator.reverseOrder()) //intermediate operation
			.forEach(System.out::println);
		
		
	}
	//*****sort the list using their length by comparetor
	private static void comparebyLength(List<String> courses)
	{
		courses.stream()
					.sorted(Comparator.comparing(str->str.length()))
					.forEach(System.out::println);
	}
	

	
}
