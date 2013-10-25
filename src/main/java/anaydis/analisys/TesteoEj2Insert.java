package anaydis.analisys;

import anaydis.sort.InsertionSorter;
import anaydis.sort.IntDataSetGenerator;
import anaydis.sort.MyIntComparable;
import anaydis.sort.OnlyCountsSorterListener;

/**
 * Created with IntelliJ IDEA.
 * Author: Tomás Vilaboa
 * Project: anaydis-2013
 * Date: 27/08/13
 * Time: 11:04
 */
public class TesteoEj2Insert {

    private static InsertionSorter insertionSorter = new InsertionSorter();
    private static OnlyCountsSorterListener countsInsert=new OnlyCountsSorterListener();
    private static IntDataSetGenerator setGenerator=new IntDataSetGenerator();
    private static MyIntComparable intComparator=new MyIntComparable();

    public static void main(String[] args) {

        insertionSorter.addSorterListener(countsInsert);
        testProm(10);
        testProm(50);
        testProm(100);
        testProm(250);
        testProm(500);
        testProm(1000);
        testProm(2000);
        testProm(3000);
        testProm(4000);
        testProm(5000);
        testMejor(10);
        testMejor(50);
        testMejor(100);
        testMejor(250);
        testMejor(500);
        testMejor(1000);
        testMejor(2000);
        testMejor(3000);
        testMejor(4000);
        testMejor(5000);
        testPeor(10);
        testPeor(50);
        testPeor(100);
        testPeor(250);
        testPeor(500);
        testPeor(1000);
        testPeor(2000);
        testPeor(3000);
        testPeor(4000);
        testPeor(5000);

    }

    private static void testProm(int n){
        countsInsert.reset();
        long time=System.currentTimeMillis();
        insertionSorter.sort(intComparator, setGenerator.createRandom(n));
        System.out.println("Tardo " + (System.currentTimeMillis() - time) + " milisegundos en sortear " +
                + n + " elementos en caso promedio" );
        System.out.println("Realizo " + countsInsert.getGreater() + " comparaciones.");
        System.out.println("Realizo " + countsInsert.getSwap() + " swaps.");
    }

    private static void testMejor(int n){
        countsInsert.reset();
        long time=System.currentTimeMillis();
        insertionSorter.sort(intComparator, setGenerator.createAscending(n));
        System.out.println("Tardo " + (System.currentTimeMillis() - time) + " milisegundos en sortear " +
                + n + " elementos en caso mejor" );
        System.out.println("Realizo " + countsInsert.getGreater() + " comparaciones.");
        System.out.println("Realizo " + countsInsert.getSwap() + " swaps.");
    }

    private static void testPeor(int n){
        countsInsert.reset();
        long time=System.currentTimeMillis();
        insertionSorter.sort(intComparator, setGenerator.createDescending(n));
        System.out.println("Tardo " + (System.currentTimeMillis() - time) + " milisegundos en sortear " +
                + n + " elementos en caso peor" );
        System.out.println("Realizo " + countsInsert.getGreater() + " comparaciones.");
        System.out.println("Realizo " + countsInsert.getSwap() + " swaps.");
    }
}
