package headfirst.designpatterns.adapter.iterenum;

import java.util.*;

public class IteratorEnumerationTestDrive {

    public static void main (String args[]) {

        ArrayList<String> l = new ArrayList<>(Arrays.asList(new String[]{"1","2","3"}));
        Enumeration<?> enumeration = new IteratorEnumeration(l.iterator());
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
    }
}