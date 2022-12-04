package javasessions;

public class MainMethodOverloading {

	// command line arguments
	public static void main(String[] args) {

		// System.out.println(args.length);//0
		// System.out.println(args[0]);//AIOB
		System.out.println("hi...");
		MainMethodOverloading.main();
		MainMethodOverloading.main(1);

	}

	public static void main() {

		System.out.println("bye...");
	}

	public static void main(int i) {

		System.out.println("pop..."+i);
	}

}
