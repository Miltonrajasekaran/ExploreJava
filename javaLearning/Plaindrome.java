package javaLearning;

public class Plaindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   String str = "malayalam";
	       
	        String rev = "";
			
			for (int i = str.length()-1; i >= 0; i--) {
				
			            rev = rev + str.charAt(i);
			        }
			        if(str.equalsIgnoreCase(rev))
			        {
			            System.out.println("The string is palindrome.");
			        }
			        else
			        {
			            System.out.println("The string is not palindrome.");
				
				 
							
			}
		}

	}

