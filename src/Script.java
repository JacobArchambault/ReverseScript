
class Script {

	StringBuilder stringBuilder;

	Script(StringBuilder stringBuilder) {
		this.stringBuilder = stringBuilder;
	}

	String reverse(String string) {
		System.out.println("Without recursion: ");
		for (int i = string.length() - 1; i >= 0; i--) {
			stringBuilder.append(string.charAt(i));
		}
		return stringBuilder.toString();
	}

	static String reverseRecursive(String string) {
		if (string.length() <=1) {
			return string; 
		} else {
			return String.valueOf(string.charAt(string.length() - 1) + reverseRecursive(string.substring(0, string.length() - 1)));
		}
	}
}
