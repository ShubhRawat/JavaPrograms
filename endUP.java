
public class endUP {

	public static void main(String[] args) {
		String str="hello";
	    
	    if(str.length()<3)
	  System.out.println(str.toUpperCase());
	  else
	  {
	    String str1=str.substring(str.length()-3,str.length());
	    String str2=str.substring(0,str.length()-3);
	    
	    System.out.println(str1);
	    System.out.println(str2);
	    str1=str1.toUpperCase();
	    
	    System.out.println(str2+str1);
	  }

	}

}
