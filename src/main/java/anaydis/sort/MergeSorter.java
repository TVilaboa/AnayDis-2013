package anaydis.sort;

import java.util.Comparator;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Author: Tomás Vilaboa
 * Project: AnayDis-2013
 * Date: 19/09/13
 * Time: 21:15
 */
abstract public class MergeSorter extends AbstractSorter {

    protected  <T> void merge(Comparator<T> comparator, List<T> list, int lo, int m, int hi,List<T> aux) {
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

    public MergeSorter(SorterType type) {
        super(type);
    }
}
