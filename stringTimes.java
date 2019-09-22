
public class stringTimes {

	public String stringTimes(String str, int n) {
		  if(n==1)
		  return str;
		  else if(n==0)
		  return "";
		  else
		  {
		    String str1=str;
		    for(int i=1;i<n;i++)
		    {
		      str1=str1+str;
		    }
		    return str1;
		  }
		}

	
	
	public static void main(String[] args) {

		stringTimes obj=new stringTimes();
		System.out.println(obj.stringTimes("Hi",5));
		
		

	}

}
