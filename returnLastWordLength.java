package week3.dailychallenge;

public class returnLastWordLength {
	public static void main(String[] args) {
		
		String word = "luffy is still joyboy";
		int length = word.length();
		System.out.println("The Length of the word is :" + length);
		String[] split = word.split(" ");
		System.out.println("The number of word is:" +split.length);
		//System.out.println("The Length of the last word is:" +split[1].length());
		for (int i=0;i<split.length;i++)
		{
			System.out.println(split[i]);
			
		}
		int j = split.length-1;
		System.out.println("The Length of the last word is:" + split[j].length());
		
		
		
		
	}

}
