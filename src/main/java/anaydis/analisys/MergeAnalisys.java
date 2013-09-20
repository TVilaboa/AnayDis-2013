package anaydis.analisys;

import anaydis.sort.*;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Author: Tomás Vilaboa
 * Project: AnayDis-2013
 * Date: 19/09/13
 * Time: 21:14
 */
public class MergeAnalisys {

    public static void main(String[] args) {
        MergeSorter mergeSorterTopDown=new MergeSorterTopDown();
        MergeSorter mergeSorterBottomUp=new MergeSorterBottomUp();
        int i;
        for (int j=0;j<5;j++){
            if(j==0)
                i=100;
            else if(j==1)
                i=500;
            else if(j==2)
                i=1000;
            else if(j==3)
                i=2500;
            else
            i=5000;
            test(i,mergeSorterBottomUp);
        test(i,mergeSorterTopDown);
        }



    }

    //Copy the same list for every M so the the time depends only on the M and not of the list orden.
    private static void test(int N,MergeSorter sorter) {
            IntDataSetGenerator generator=new IntDataSetGenerator();
            List<Integer> list=generator.createRandom(N);
            long time= System.currentTimeMillis();
            sorter.sort(new MyIntComparable(),list);
            time= (System.currentTimeMillis()-time);
            System.out.println("Para N=" + N + " " + sorter.getType()+ " tarda " + time + " ms" );

    }
}
