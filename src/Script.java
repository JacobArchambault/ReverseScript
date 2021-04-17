
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
}
