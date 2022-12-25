package functionalprogramming.structre;

import java.util.stream.LongStream;

public class FP11parallizing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//by using normal
		        long time=System.currentTimeMillis();
				System.out.println(LongStream.range(0, 1000000000).sum());
				System.out.println(System.currentTimeMillis()-time);
				
				//by using paralal
				System.out.println(LongStream.range(0, 1000000000).parallel().sum());
				System.out.println(System.currentTimeMillis()-time);
	}

}
