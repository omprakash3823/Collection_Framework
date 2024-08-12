import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class print_Integer_Element {
    public static void main(String[] args) {
        Collection c1=new ArrayList();
        c1.add(2);
        c1.add(34);
        c1.add("Ram");
        c1.add(34.8);
        c1.add("Shyam");
        c1.add(2.2);

        System.out.println(c1);
        System.out.print("[");
        Iterator itr=c1.iterator();

        while (itr.hasNext()){
            Object o=itr.next();
            if (o instanceof Integer){
                System.out.print(o+",");
            }

        }
        System.out.print("]");
    }
}
