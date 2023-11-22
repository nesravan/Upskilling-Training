package java_assignment;
import java.util.*;
public class Stringpool {
		public static void main(String[] args) {
			String s="Java String pool refers to collection of strings which are stored in heap memory";
			String s1;
			s1= s.toLowerCase();
			System.out.println(s1);
			s1=s.toUpperCase();
			System.out.println(s1);
			System.out.println("replace:"+s.replace("a", "$"));
		System.out.println("check collection:"+s.contains("collection"));
}
}
			

