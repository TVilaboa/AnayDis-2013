package anaydis.analisys;

import anaydis.sort.IntDataSetGenerator;
import anaydis.sort.MyIntComparable;
import anaydis.sort.QuickSorterCutOff;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Author: Tomás Vilaboa
 * Project: anaydis-2013
 * Date: 10/09/13
 * Time: 10:57
 */
public class QuickSorterMAnalisys {

    public static void main(String[] args) {
        for(int i = 1000;i<=1000000;i*=10){
             test(i);
        }
    }

    //Copy the same list for every M so the the time depends only on the M and not of the list orden.
    private static void test(int N) {
        QuickSorterCutOff quick=new QuickSorterCutOff();
        IntDataSetGenerator generator=new IntDataSetGenerator();
        long recordTime=999999999;
        int m=0;
        for(int i=5;i<=25;i++){
            List<Integer> list=generator.createRandom(N);
            long time= System.currentTimeMillis();
            quick.sort(new MyIntComparable(),list,i);
            time= (System.currentTimeMillis()-time);
            System.out.println("Para N=" + N + " con M=" + i + " tarda " + time + " ms" );
            if(time<recordTime){
                recordTime=time;
                m=i;
            }
        }
        System.out.println("El mejor M para " + N + " datos, fue M=" + m + " y tardo " + recordTime + " ms");
    }
}
