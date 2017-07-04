package cz.jcu.uai.javapract;

import junit.framework.TestCase;

/**
 * Created by Karolínka on 4.7.2017.
 */
public class ComparatorTest extends TestCase {
    public void testDiff() throws Exception {

        Comparator tesctovaci = new Comparator();

        TimeTable stary = null;
        TimeTable novy = null;

        Diff vysledek = tesctovaci.diff(stary, novy);

        // kontrola


    }

}