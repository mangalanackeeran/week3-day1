package assignment5;

public class FindTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String test="$$ Welcome to 2nd Class of Automation$$";
int letter=0, space=0,num=0,specialChar=0;
char[] testChar=test.toCharArray();
for(int i=0;i<testChar.length;i++)
{
	if(Character.isLetter(testChar[i]))
	{
		letter=letter+1;
	}
	else if(Character.isDigit(testChar[i]))
	{
		num=num+1;
	}
	else if(Character.isSpaceChar(testChar[i]))
	{
		space=space+1;
	}
	else
	{
		specialChar=specialChar+1;
	}
}
System.out.println(letter);
System.out.println(num);
System.out.println(space);
System.out.println(specialChar);



	}

}
