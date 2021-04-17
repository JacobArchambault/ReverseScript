
class Script {

	static String reverseRecursive(final String string) {
		if (string.length() <= 1) {
			return string;
		}
		return String.valueOf(
				string.charAt(string.length() - 1) + Script.reverseRecursive(string.substring(0, string.length() - 1)));
	}

	StringBuilder stringBuilder;

	Script(final StringBuilder stringBuilder) {
		this.stringBuilder = stringBuilder;
	}

	String reverse(final String string) {
		System.out.println("Without recursion: ");
		for (var i = string.length() - 1; i >= 0; i--) {
			stringBuilder.append(string.charAt(i));
		}
		return stringBuilder.toString();
	}
}
