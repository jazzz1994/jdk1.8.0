package strms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreateStreams2 {

	public static void main(String[] args) {
		// attach seq stream to List & display all elems using
		// Stream's forEach
		List<Integer> l1 = Arrays.asList(1, 23, 45, 2, 40, 4);
		System.out.println("Printing elems via seq stream");
		l1.stream().forEach(i -> {
			System.out.println(Thread.currentThread().getName() + " " + i);
		});
		System.out.println("via parallel stream ");
		l1.parallelStream().forEach(i -> {
			System.out.println(Thread.currentThread().getName() + " " + i);
		});
		
	}

}
