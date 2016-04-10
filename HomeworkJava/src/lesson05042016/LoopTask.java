package lesson05042016;

public class LoopTask {

	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("Usage: LoopTask <number>");
			System.exit(1);

		}

		int x = Integer.parseInt(args[0]);
		System.out.println(x);
		while (x != 0) {
			System.out.println(x % 2);
			x = x / 2;
		}
	}
}
