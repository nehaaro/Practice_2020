
public class SwapString {

	
			public static void main(String[] args) {
				
				String s1="Neha";
				String s2="Arora";
				s1=s1+s2;
				System.out.println(s1);
				s2= s1.substring(0, s1.length()-s2.length());//s1.substring(0,4)
				s1= s1.substring(s2.length());//s1.substring(5), from to till end
				System.out.println(s1 +" "+ s2);
				
			}

}
