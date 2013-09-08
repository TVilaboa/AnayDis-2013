package anaydis.sort;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Author: Tomás Vilaboa
 * Project: AnayDis-2013
 * Date: 07/09/13
 * Time: 21:57
 */
public class TestShellSequences {

    public static void main(String[] args) {
        ShellSorter shell=new ShellSorter();
        OnlyCountsSorterListener listener=new OnlyCountsSorterListener();
        shell.addSorterListener(listener);
        IntDataSetGenerator intDataSetGenerator=new IntDataSetGenerator();
        test(shell, listener, intDataSetGenerator,100);
        test(shell, listener, intDataSetGenerator,1000);
        test(shell, listener, intDataSetGenerator,10000);
    }

    private static void test(ShellSorter shell, OnlyCountsSorterListener listener, IntDataSetGenerator intDataSetGenerator, int n) {
        long time=System.currentTimeMillis();
        System.out.println("Sort Sedgewick  " + n);
        shell.sort(new MyIntComparable(), intDataSetGenerator.createRandom(n));
        System.out.println(System.currentTimeMillis() - time);
        System.out.println("Comparisons " + listener.getGreater());
        System.out.println("Swaps " + listener.getSwap());
        listener.reset();
        time=System.currentTimeMillis();
        System.out.println("Sort Knuth  " + n);
        shell.sort(new MyIntComparable(), intDataSetGenerator.createRandom(n),knuthSequence(n));
        System.out.println(System.currentTimeMillis() - time);
        System.out.println("Comparisons " + listener.getGreater());
        System.out.println("Swaps " + listener.getSwap());
        listener.reset();
    }

    static private List<Integer> knuthSequence(int n){

            List<Integer> sequence=new ArrayList<>();
            int h=0;
            for(int i=1;h<n/3;i++){
                h=(int)(Math.pow(3,i) -1)/2;         //uses sedgewick sequence
                sequence.add(h);
            }
            return sequence;

    }
}
