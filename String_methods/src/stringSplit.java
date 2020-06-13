
public class stringSplit {

	
	public static void main(String[] args) {
		
		String fullname = "my-name-is-khan ";

				//split the string wen gets space and store it in string array

       String []name= fullname.split(" ");
       
         int i=name.length;
         System.out.println(i);
       
       for(i=0;i<name.length;i++)  // as array starts with zero, it will run for 0 to 3 . When counts length-it counts number of words from 1
    	   
       {
    	   System.out.print(name[i]);
    	    	  
       }
       
       System.out.println(fullname.trim());
       System.out.println(fullname.charAt(2));//--my-name-is-khan
       
	}
}
