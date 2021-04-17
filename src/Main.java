
public class Main {

	public static void main(String[] args) {
		Script script = new Script(new StringBuilder());
		String string = "Here is a string";
		System.out.println("Original string: ");
		System.out.println(string);
		System.out.println(script.reverse(string));
		System.out.println("\nWith recursion: ");
		System.out.println(Script.reverseRecursive(string));
	}

}
