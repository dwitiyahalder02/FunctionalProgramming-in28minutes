package functionalprogramming.structre;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class FP08Stream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers=Arrays.asList(1,2,3,4,5,6);
		System.out.println(numbers.stream());
		
		System.out.println(Stream.of(1,2,3,4,5,6).count());
		
		System.out.println(Stream.of(1,2,3,4,5,6).reduce(0,Integer::sum));
		
		System.out.println(Stream.of(1,2,3,4,5,6).reduce(0,(x,y)->(x+y)));
		
		System.out.println(Stream.of(1,2,3,4,5,6).reduce(0,(x,y)->(x-y)));
		
		System.out.println(Stream.of(1,2,3,4,5,6).reduce(1,(x,y)->(x*y)));
		
		System.out.println(Stream.of(1,2,3,4,5,6).reduce(1,(x,y)->(x/y)));
		
		int numarray[]= {1,2,3,5,7,8};
		System.out.println(Arrays.stream(numarray).sum());
		System.out.println(Arrays.stream(numarray).average());
		System.out.println(Arrays.stream(numarray).min());
		System.out.println(Arrays.stream(numarray).max());
		
		//the simplest way to create a stream using range
		System.out.println(IntStream.range(1, 10));
		//here 1 to 9 is a part of the stream.9 is not included
		System.out.println(IntStream.range(1, 10).sum());
		
		//here 1 to 10 is a part of the stream.10 is included,streams of primitive values
		System.out.println(IntStream.rangeClosed(1, 10).sum());
		System.out.println("peek is an operation which is used to show the elemnts without changing the operation");
		IntStream.iterate(1,e->e+2).limit(10).peek(System.out::println).sum();//the range starts with 1 and increasing with 2
		//print first 10 even numbers using peek and finally do the sum
		System.out.println("print first 10 even numbers using peek and finally do the sum");
		IntStream.iterate(2,e->e+2).limit(10).peek(System.out::println).sum();
		//calculate first 10 powers of 2
		System.out.println("calculate first 10 powers of 2");
		System.out.println(IntStream.iterate(2,e->e*2).limit(10).peek(System.out::println).sum());
		
		//Doing big number calculations using BigInteger
		System.out.println(Integer.MAX_VALUE);
		//multiply first 50 big numbers
		System.out.println(LongStream.rangeClosed(1,10).reduce(1,(x,y)->x*y));
		
		
		
	}

}
