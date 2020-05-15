package regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String email = "naveen e@tl.com";
		
		String pat = "[a-zA-Z0-9.]+@[a-z]+.[a-z.]{2,}";
		
		Pattern compile = Pattern.compile(pat);
		Matcher matcher = compile.matcher(email);
		
		System.out.println("given e-mail is valid  ---> " + matcher.matches());

	}

}
