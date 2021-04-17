
public class Main {

	public static void main(final String[] args) {
		final var script = new Script(new StringBuilder());
		final var string = "Here is a string";
		System.out.println("Original string: ");
		System.out.println(string);
		System.out.println(script.reverse(string));
		System.out.println("\nWith recursion: ");
		System.out.println(Script.reverseRecursive(string));
	}

}
