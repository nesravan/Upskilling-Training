package lambda_Assignment;
import java.util.ArrayList;
import java.util.function.Predicate;
public class Lambda02 {
	    private int totalprice;
	    private String status;

	  public Lambda02(int totalPrice, String status) {
	        super();
	        this.totalprice = totalPrice;
	        this.status=status;
	    }

	 public static ArrayList<Lambda02>  listOfOrders(ArrayList<Lambda02> arr, Predicate<Lambda02> pr){

	 ArrayList<Lambda02> a=new ArrayList<>();
	        for(Lambda02 i: arr)
	        {
	            if(pr.test(i))
	            {
	                System.out.println("totalPrice:"+i.totalprice+"  "+"Status:"+i.status);
	            }
	        }
	        return a;
	    }
	    public static void main(String[] args) {
	    	ArrayList<Lambda02> a= new ArrayList<>();
	        a.add(new Lambda02(1000000, "completed"));
	        a.add(new Lambda02(1000,"pending"));
	        a.add(new Lambda02(10001,"accpeted"));
	        a.add(new Lambda02(125000,"completed"));
	        a.add(new Lambda02(125,"completed"));

	 Predicate<Lambda02> pr=e->(e.totalprice>10000 && (e.status.contentEquals("accpeted")|| e.status.contentEquals("completed")));
	        listOfOrders(a, pr);

	 

	    }
	}


