package java_assignment;

public class StringAppend {
	public static void main (String[] args) {
		StringBuilder s1=new StringBuilder("String Builder");
		StringBuilder s2=new StringBuilder("is a peer class of");
		StringBuilder s3=new StringBuilder("String that provides much of");
		StringBuilder s4=new StringBuilder("the functionality of Strings");
		
		s1.append(s2);
		System.out.println(s1);
		s1.append(s3);
		System.out.println(s1);
		s1.append(s4);
		System.out.println(s1);
		
	}

}
