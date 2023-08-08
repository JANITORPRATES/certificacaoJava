package scr.OCPGUIACOMPLETO.outro;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class TesteAleatorio {

	public static void main(String[] args) {
		//System.out.println(average(90, 100)); // Optional[95.0]
		//System.out.println(average());
		
		Stream<Integer> stream = Stream.of(3);
		System.out.println(stream.reduce((a, b) -> a*b));
		
		var list = List.of("monkey", "2", "chimp");
		Stream<String> infinite = Stream.generate(() -> "chimp");
		Predicate<String> pred = x -> Character.isLetter(x.charAt(0));
		 
		System.out.println(list.stream().anyMatch(pred));  // true
		System.out.println(list.stream().allMatch(pred));  // false
		System.out.println(list.stream().noneMatch(pred)); // false
		System.out.println(infinite.anyMatch(pred));       // true
	}

	public static Optional<Double> average(int... scores) {
		if (scores.length == 0)
			return Optional.empty();
		int sum = 0;
		for (int score : scores)
			sum += score;
		return Optional.of((double) sum / scores.length);
	}

}
