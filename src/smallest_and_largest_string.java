import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class smallest_and_largest_string {
    public static void main(String[] args) {
        Collection c1=new ArrayList();
        c1.add(2);
        c1.add(34);
        c1.add("Ram");
        c1.add(34.8);
        c1.add("Shyam");
        c1.add(2.2);
        c1.add("sita");
        c1.add("radheshyam");

        System.out.println(c1);

        String s_s=" ";
        String l_s=" ";
        int count=0;



        Iterator itr=c1.iterator();

        while (itr.hasNext()){
            Object o=itr.next();

            if (o instanceof String){
                count++;
                if(count==1){
                    s_s=(String) o;

                }

                if(s_s.length()> ((String) o).length()){
                    s_s=(String) o;
                }
                if(l_s.length()<((String) o).length()){
                    l_s=(String) o;
                }


            }

        }
        System.out.println(s_s);
        System.out.println(l_s);
    }
}
