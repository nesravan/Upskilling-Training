package java_assignment;
import java.util.HashMap;
public class Generics01 {
	public static void main(String[] args) {
	        HashMap<Integer,Double> hm=new HashMap<>();
	        hm.put(647, 4.28);
	        hm.put(468, 6.28);
	        hm.put(646, 98.28);
	        hm.put(398, 45.8);
	        hm.put(379, 40.98);
	        hm.put(753, 7.28);
	        hm.put(257, 49.8);
	        hm.put(578, 95.28);
	        hm.put(455, 82.8);
	        hm.put(358, 46.808);

	        hm.forEach((K,V) -> System.out.println(K +" "+V));
	    }
}

