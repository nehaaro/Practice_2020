/**
 * 
 */

public class ReverseTwoStrings {

	public static void main(String[] args) {
	
		       String str1 = "Hello";
		        		
		        String str2 = "World";
		

		   int count=0;
		 
		        // convert String to character array
		        // by using toCharArray
		        char[] try1 = str1.toCharArray();
		        char[] try2= str2.toCharArray();
		        
		        int size1= try1.length;
		        int size2= try2.length;
		        
		        for(int i=0;i < size1;i++)
		        {
		        		int size= 4;
		        	int	j=size-i;
		        	
                 System.out.println(try1[i]+" "+ try2[j]);
		            	//j--;
		        }
	      }
		       
	}     
	
		        
	

