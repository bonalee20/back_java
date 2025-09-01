package practiceAugust;

@FunctionalInterface
interface MyFunction{
	int add(int a, int b);
}


public class Practice28 {
	public static void main(String[] args) {
		MyFunction  f2 = (a, b) -> a+b;
		System.out.println(f2.add(3, 3));
		
		
	}
}

