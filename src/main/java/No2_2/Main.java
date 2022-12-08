package No2_2;

public class Main {
	 public static void main(String[] args) {
		Factory f1 = Factory.getInstance();
		Factory f2 = Factory.getInstance();
		System.out.println(f1);
		System.out.println(f2);

	}
}
