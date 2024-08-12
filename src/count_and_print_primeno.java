import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class count_and_print_primeno {
    public static void main(String[] args) {
        Collection c1 = new ArrayList();
        c1.add(2);
        c1.add(34);
        c1.add(89);
        c1.add(34.8);
        c1.add(67);
        c1.add(2.2);
        c1.add(90);
        c1.add(62);

        System.out.println(c1);

        int count = 0;
        Iterator itr = c1.iterator();

        while (itr.hasNext()) {
            Object o = itr.next();

            if (o instanceof Integer) {
                int num = (int) o;
                if (num <= 1) {
                    return;
                }
                boolean isPrime = true;
                for (int i = 2; i < Math.sqrt(num); i++) {
                    if (num % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    System.out.println(o + " is prime");
                    count++;
                }

            }

        }

    }
}
