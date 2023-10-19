package String;

public class EqualsMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s=new String("Soma");
		String s1=new String("Soma");
		String s2="soma";
		String s3="soma";
		String s4="Soma";
		
		System.out.println(s.equals(s1));
		System.out.println(s==s1);
		
		System.out.println(s.equals(s2));
		System.out.println(s==s2);
		
		System.out.println(s2.equals(s3));
		System.out.println(s2==s3);
		System.out.println();
		System.out.println(s3.equalsIgnoreCase(s4));
		
	//	true
	// false
		
	//	false
	//	false
		
	//	true
	//	true
		
		
		
		
	}

}
