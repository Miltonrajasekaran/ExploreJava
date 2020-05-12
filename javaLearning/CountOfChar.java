package javaLearning;

public class CountOfChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		String str="You have no choice other than following me!";

		int letter=0;

		char[] ch = str.toCharArray();

		//System.out.println(ch.length);

		for (int i = 0; i < ch.length; i++) {

			if (ch[i] == 'o')
				letter++;
	

		}


		System.out.println("count of letter O is " + letter);	
		

	}

}

	
