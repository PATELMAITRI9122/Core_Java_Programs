import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListWithLambdaExpression {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(20);
		list.add(100);
		list.add(10);
		list.add(200);
		list.add(500);
		list.add(3);
		list.add(5);

		System.out.println(list);

		Comparator<Integer> c = (o1, o2) -> (o1 < o2) ? +1 : (o1 > 02) ? -1 : 0;
		Collections.sort(list, c);
		//System.out.println(list);
		list.stream().forEach(System.out::println);
		System.out.println("****");
		
		List<Integer> l2 = list.stream().filter(i->i%2==0).collect(Collectors.toList());
		l2.stream().forEach(System.out::println);
	}

}
/*
class Mycomparator implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {

		if (o1 < o2) {
			return +1;
		} else if (o1 > o2) {
			return -1;
		} else {
			return 0;
		}
	}

}*/
