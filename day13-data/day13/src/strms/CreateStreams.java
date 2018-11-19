package strms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreateStreams {

	public static void main(String[] args) {
		// attach seq stream to List & display all elems using
		// Stream's forEach
		List<Integer> l1 = Arrays.asList(1, 23, 45, 2, 40, 4);
		System.out.println("Printing elems via seq stream");
		l1.stream().forEach(System.out::println);
		Stream<Integer> strm1 = l1.stream();
		System.out.println("Printing elems via seq stream lambda ");
		strm1.forEach(i -> System.out.print(i + " "));
		System.out.println("Re-using same strm after terminal operation");
	//	strm1.forEach(i -> System.out.print(i + " "));
		

	}

}



