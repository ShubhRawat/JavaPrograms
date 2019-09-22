
public class doubleX {

	boolean doubleX(String str) {
		  int index= str.indexOf('x');
		  if(index!=-1&&index<str.length()-1)
		  {
		  if(str.substring(index,index+2).equals("xx"))
		  return true;
		  }
		  return false;
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 doubleX obj=new doubleX();
boolean str= obj.doubleX("xaxx");
System.out.println(str);
boolean str1= obj.doubleX("abc");
System.out.println(str1);
boolean str2= obj.doubleX("xxxx");
System.out.println(str2);
	}

}
