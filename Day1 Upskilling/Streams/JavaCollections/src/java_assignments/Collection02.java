package java_assignments;
import java.util.HashSet;
import java.util.Iterator;

public class Collection02 {

    public static void main(String[] args) {

        //creating HashSet and adding elements

        HashSet<String> set = new HashSet<String>();
        set.add("Sravani");
        set.add("akhila");
        set.add("Grace");
        set.add("saritha");
        set.add("chaitanya");

        //traversing elements

        Iterator<String> itr = set.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}



