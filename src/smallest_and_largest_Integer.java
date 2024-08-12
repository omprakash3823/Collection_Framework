import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class smallest_and_largest_Integer {
    public static void main(String[] args) {
        Collection c1=new ArrayList();
        c1.add(2);
        c1.add(34);
        c1.add("Ram");
        c1.add(34.8);
        c1.add("Shyam");
        c1.add(200);
        c1.add("sita");
        c1.add("radheshyam");

        System.out.println(c1);

        int s_s=Integer.MAX_VALUE;
        int l_s=Integer.MIN_VALUE;
        Iterator itr=c1.iterator();

        while (itr.hasNext()){
            Object o=itr.next();

            if (o instanceof Integer){

                if(s_s> (int) o){
                    s_s=(int) o;
                }
                if(l_s<((int) o)){
                    l_s=(int) o;
                }


            }

        }
        System.out.println(s_s);
        System.out.println(l_s);
    }
}
