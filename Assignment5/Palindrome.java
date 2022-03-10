package assignment5;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "madam";

		int i;
		int length = name.length();
		String[] arr = name.split("");
		String reversestring = "";

		for (i = (length - 1); i >= 0; i--) {
			reversestring = reversestring + name.charAt(i);

		}
		System.out.println(reversestring);
		if (name.equals(reversestring)) {
			System.out.println(name + " is a Palindrome String.");
		} else {
			System.out.println(name + " is not a Palindrome String.");
		}

	}

}
