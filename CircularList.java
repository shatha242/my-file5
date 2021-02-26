package ss;

import java.awt.*;
import java.awt.image.BandCombineOp;

/**
 * Created by DELL on 2/26/2021.
 */
public class CircularList <T>{
    public static class ListsTest {
        public static void main(String[] args) {
            List listA = new ArrayList<>();
            List listB = new LinkedList<>();
            Object object = new Object();
            Integer integer = new Integer(4);
            listA.add((String) object);
            listB.add((String) object);
            System.out.println(listA.equals(listB));
        }
    }
}
