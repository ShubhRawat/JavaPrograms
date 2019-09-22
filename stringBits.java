
public class stringBits {

	public String stringBits(String str) {
		  String strnew="";
		  
		  for(int i=0;i<str.length();i=i+2)
		  {
		    strnew=strnew+str.charAt(i);
		  }
		  
		  return strnew;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stringBits obj=new stringBits();
	    String str=obj.stringBits("Heeololeo");	
       System.out.println(str);
	}
}
