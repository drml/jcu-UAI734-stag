package cz.jcu.uai.javapract;


import cz.jcu.uai.javapract.mock.mock.TimetableMockNew;
import cz.jcu.uai.javapract.mock.mock.TimetableMockOld;
import junit.framework.TestCase;

/**
 *
 * Created by Karolínka on 4.7.2017.
 */
public class ComparatorTest extends TestCase {
    public void testDiff() throws Exception {

        Comparator tesctovaci = new Comparator();

        TimeTable stary = new TimetableMockOld();
        TimeTable novy = new TimetableMockNew();

        Diff vysledek = tesctovaci.diff(stary, novy);

        // kontrola









    }

}