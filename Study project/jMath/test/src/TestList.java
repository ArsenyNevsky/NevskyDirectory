import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import java.util.Iterator;


/**
 * Created with IntelliJ IDEA 12.
 * All rights reserved. email: erafiil@gmail.com
 * User: ${Arseny_Nevsky}
 * Date: 16.11.13
 * Time: 23:43
 * Location: ${Russia_Saint-Petersburg}
 */
public class TestList extends TestCase {

    @Test
    public void testGetFirst() {
        list = new List<>();
        list.add(1);
        Integer first = new Integer(1);
        assertEquals(first, list.getHead());
    }


    @Test
    public void testSumItem() {
        list = new List<>(1);
        list.add(2);
        list.add(3);
        list.add(4);

        Integer sum = new Integer(0);
        Integer exp = new Integer(10);
        Iterator<Integer> iter = list.iterator();

        while (iter.hasNext()) {
            sum += iter.next();
        }
        assertEquals(exp, sum);
    }

    private List<Integer> list;
}
