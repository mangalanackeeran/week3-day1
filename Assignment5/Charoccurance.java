package assignment5;

public class Charoccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Welcome to bangalore";
		String lowerStr = str.toLowerCase();
		int count = 0;

		char[] str1 = lowerStr.toCharArray();
		int length = str1.length;

		for (int i = 0; i < length; i++) {
			if (str1[i] == 'o') {
				count = count + 1;
			}
			continue;
		}

		System.out.println(count);
	}

}
