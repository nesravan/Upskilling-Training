package lambda_Assignment;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
public class Lambda06 {
public static List<String> List=Arrays.asList("grace","akhila","sravani", "saritha","mounisha");
	    public static List<String> convertToUpperCase(List<String> list, Consumer<List<String>> c) 
	    {
	        c.accept(list);
	        return list;
	    }
	    public static void main(String[] args) {

	    	Consumer<List<String>> c=lis ->
	        {
	            for(int i=0;i<lis.size();i++) {
	                lis.set(i, List.get(i).toUpperCase());
	            }
	        };
	        System.out.println(convertToUpperCase(List,c));
	    }
	}

