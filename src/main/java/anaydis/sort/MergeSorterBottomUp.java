package anaydis.sort;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Author: Tomás Vilaboa
 * Project: AnayDis-2013
 * Date: 19/09/13
 * Time: 20:14
 */
public class MergeSorterBottomUp extends MergeSorter{


    public MergeSorterBottomUp() {
        super(SorterType.MERGE_BOTTOM_UP);
    }

    @Override
    public <T> void sort(@NotNull Comparator<T> comparator, @NotNull List<T> list) {
       int N=list.size();
        List<T> aux=new ArrayList<>();
        for(int m=1;m<N;m*=2){
            for(int i=0;i<N-m;i+=2*m){
                merge(comparator,list,i,i+m-1,Math.min(i+m+m-1, N-1),aux);
            }
        }
    }
}
