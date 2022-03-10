package assignment5;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "I am a software tester";
		String[] starr = test.split(" ");
		for (int i = 0; i < starr.length; i++) {
			if (i % 2 != 0) {
				char[] ch = starr[i].toCharArray();
				for (int j = ch.length - 1; j >= 0; j--) {
					System.out.print(ch[j]);
				}
				System.out.print(" ");

			}
			else {
				System.out.print(starr[i]+" ");
			}
		}

	}

}
