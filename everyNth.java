
public class everyNth {

	public static void main(String[] args) {
		
		String str="Miracle";
		int n=2;
		
		int l=str.length();
		  String str1="";
		  for(int i=0;i<l;i+=n)
		  {
		    str1=str1+str.charAt(i);
		  }
		  
		   System.out.println(str1);

	}

}
