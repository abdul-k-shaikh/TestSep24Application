package test.com.dec24;

public class MiddleCharFound {

	public static void main(String[] args) {
		String str = "abcde";  //abcde
		int length = str.length();
		if(length%2==0) {
			System.out.println("char in even case:"+str.substring(length/2-1,length/2+1));
		}else {
			System.out.println("char in odd case:"+str.substring(length/2,length/2+1));
			
		}
	}

}
