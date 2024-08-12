import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class sum_Of_Integer {
    public static void main(String[] args) {
        Collection c1=new ArrayList();
        c1.add(2);
        c1.add(34);
        c1.add("Ram");
        c1.add(34.8);
        c1.add("Shyam");
        c1.add(2.2);

        System.out.println(c1);
        int sum=0;
        Iterator itr=c1.iterator();

        while (itr.hasNext()) {
            Object o = itr.next();
            if (o instanceof Integer) {
                sum = sum + (int) o;
            }

        }
        System.out.println(sum);
    }
}
