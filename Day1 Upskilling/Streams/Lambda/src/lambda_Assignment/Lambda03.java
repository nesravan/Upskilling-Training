package lambda_Assignment;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
public class Lambda03 {

	    static void modifyValue(Consumer<Product> c, Product p1) {
	        c.accept(p1);
	        System.out.println("updated value:"+p1.getId());
	    }

	  static class Product{
	        private String name;
	        private int id;
	        public Product(String name, int id) {
	            super();
	            this.name=name;
	            this.id=id;
	        }

	  public String getName() {
	            return name;
	        }
	        public void setName(String name) {
	            this.name=name;
	        }

	 public int getId() {
	            return id;
	        }

	 public void setId(int id) {
	            this.id=id;
	        }
	    }
	    static <E> void display(Supplier<E> s) {
	        System.out.println(s.get());
	    }

	 static int returnIdByTen(int n, Function<Integer, Integer> fun) {
	        int res=fun.apply(n);
	        return res;
	    }
	    public static void main(String[] args) {
	        Product p = new Product("abc", 154);
	        display(()-> p.getId());
	        display(()->p.getName());

	 Consumer<Product> updateId=per->per.setId(123);
	        updateId.accept(p);
	        modifyValue(updateId, p);

	 int n=p.getId();
	        System.out.println(returnIdByTen(n, f->f+10));
	    }
	}


