package regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UsernameValidate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	String email = "Testleaf$123";
		
		String pat = "[A-Za-z]+$[0-9]";
		
		Pattern compile = Pattern.compile(pat);
		Matcher matcher = compile.matcher(email);
		
		System.out.println("given uname is valid  ---> " + matcher.matches());

	}

}
