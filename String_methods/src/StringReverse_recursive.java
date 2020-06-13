
public class StringReverse_recursive {

	
	public static void main (String[] args){
		String str = "678678";
	
	System.out.println(recursiveMethod(str));

	}
	
	/*static String recursiveMethod(String str)
	
	{
		if((str==null )|| (str.length() <=1 ))
		{
			return str;
			//System.out.println(str);
		}	
		return recursiveMethod(str.substring(1)+ str.charAt(0));
		
	}*/
	
	//Recursive method to reverse string
	 
    static String recursiveMethod(String str)
	
	 {
         if ( (str.length() <= 1))
         {
                return str;
         }
 
         return recursiveMethod(str.substring(1)) + str.charAt(0);
    }
}
	
