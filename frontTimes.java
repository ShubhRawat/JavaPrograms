
// Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars, 
// or whatever is there if the string is less than length 3. Return n copies of the front;
//
//frontTimes("Chocolate", 2) ->  "ChoCho"
//frontTimes("Chocolate", 3) ->  "ChoChoCho"
//frontTimes("Abc", 3) ->        "AbcAbcAbc" 




public class frontTimes {
	
	
	public String frontTimes(String str, int n) {
		  String front="";
		  if(str.length()<3)
		  front=str;
		  else
		  front=str.substring(0,3);
		  
		  if(n==1)
				  return str;
				  else if(n==0)
				  return "";
				  else
				  {
				    String str1=front;
				    for(int i=1;i<n;i++)
				    {
				      str1=str1+front;
				    }
				    return str1;
				  }
		}

	public static void main(String[] args) {
		frontTimes obj=new frontTimes();
		System.out.println(obj.frontTimes("Chocolate", 3));

	}

}
