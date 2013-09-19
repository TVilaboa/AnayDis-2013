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
 * Time: 18:21
 */
public class MergeSorterTopDown extends AbstractSorter {




    public MergeSorterTopDown() {
        super(SorterType.MERGE);
    }

    @Override
    public <T> void sort(@NotNull Comparator<T> comparator, @NotNull List<T> list) {
        List<T> aux=new ArrayList<>();
        sort(comparator, list,0,list.size()-1,aux);
    }

    private <T> void sort(@NotNull Comparator<T> comparator, @NotNull List<T> list,int lo,int hi,List<T> aux){
        if(hi<=lo) return;
        int m=lo +(hi-lo)/2;
        sort(comparator,list,lo,m,aux);
        sort(comparator,list,m+1,hi,aux);
        merge(comparator,list,lo,m,hi,aux);

    }

    private <T> void merge(Comparator<T> comparator, List<T> list, int lo, int m, int hi,List<T> aux) {
        for(int i=lo;i<=m;i++){
            copy(list,i,i,aux,true);
        }
        for(int j=m+1;j<=hi;j++){
            copy(list,hi-j+m+1,j,aux,true);
        }
        int i=lo,j=hi;
        for(int k=lo;k<=hi;k++){
            if(greater(comparator,aux,i,j))
                copy(aux,j--,k,list,false);
            else
                copy(aux,i++,k,list,false);
        }

    }
}
