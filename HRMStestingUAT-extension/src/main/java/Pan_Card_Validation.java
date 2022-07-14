	import java.util.regex.*;
	
public class Pan_Card_Validation {

 public static boolean isValidPanCardNo(String panCardNo)
		    {
		  String regex = "[A-Z]{5}[0-9]{4}[A-Z]{1}";
		 
		        // Compile the ReGex
		        Pattern p = Pattern.compile(regex);
		 
		        // If the PAN Card number
		        // is empty return false
		        if (panCardNo == null)
		        {
		            return false;
		        }
		 
		        // Pattern class contains matcher() method
		        // to find matching between given
		        // PAN Card number using regular expression.
		        Matcher m = p.matcher(panCardNo);
		 
		        // Return if the PAN Card number
		        // matched the ReGex
		        return m.matches();
		    }
		 
		    // Driver Code.
		    public static void main(String args[])
		    {
		 
		        // Test Case 1:
		        String str1 = "BNZAA2318J";
		        System.out.println(isValidPanCardNo(str1));
		 
		        // Test Case 2:
		        String str2 = "23ZAABN18J";
		        System.out.println(isValidPanCardNo(str2));
		 
		        // Test Case 3:
		        String str3 = "BNZAA2318JM";
		        System.out.println(isValidPanCardNo(str3));
		 
		        // Test Case 4:
		        String str4 = "BNZAA23184";
		        System.out.println(isValidPanCardNo(str4));
		 
		        // Test Case 5:
		        String str5 = "BNZAA 23184";
		        System.out.println(isValidPanCardNo(str5));
		    }
		
	
	/*public static int runTest(String regex, String text) {
	    Pattern pattern = Pattern.compile(regex);
	    Matcher matcher = pattern.matcher(text);
	    int matches = 0;
	    while (matcher.find()) {
	        matches++;
	    }
	    return matches;*/
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	