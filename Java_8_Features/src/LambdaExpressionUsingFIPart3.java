
public class LambdaExpressionUsingFIPart3 {

	public static void main(String[] args) {

		Interfc1 i = n->n*n;
		System.out.println(i.sequareIt(4));
		System.out.println(i.sequareIt(5));
	}
}

interface Interfc1 {
	public int sequareIt(int n);
}