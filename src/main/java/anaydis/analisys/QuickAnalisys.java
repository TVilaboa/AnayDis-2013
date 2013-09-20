package anaydis.analisys;

import anaydis.sort.*;

import java.util.Iterator;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Author: Tomás Vilaboa
 * Project: AnayDis-2013
 * Date: 19/09/13
 * Time: 21:28
 */
public class QuickAnalisys {

    public static void main(String[] args) {
        QuickSorter quick=new QuickSorter();
        QuickSorter quickCut=new QuickSorterCutOff();
        QuickSorter quickMedian=new QuickSorterMedOfThree();
        QuickSorter quick3way= new QuickSorterThreeWayP();
        QuickSorter quickNonRecursive=new QuickSorterNonRecursive();
        int i=0;
        for (int j=0;j<4;j++){
            if(j==0)
                i=12500;
            else if(j==1)
                i=25000;
            else if(j==2)
                i=50000;
            else if(j==3)
                i=100000;
             test(i,quick);
            test(i,quick3way);
            test(i,quickMedian);
            test(i,quickCut);
            test(i,quickNonRecursive);

        }



    }

    //Copy the same list for every M so the the time depends only on the M and not of the list orden.
    private static void test(int N,QuickSorter sorter) {
        IntDataSetGenerator generator=new IntDataSetGenerator();
        List<Integer> list=generator.createRandom(N);
        long time= System.currentTimeMillis();
        sorter.sort(new MyIntComparable(),list);
        time= (System.currentTimeMillis()-time);
        System.out.println("Para N=" + N + " " + sorter.getType()+ " tarda " + time + " ms" );

    }
}
