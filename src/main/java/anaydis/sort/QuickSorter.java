package anaydis.sort;

import org.jetbrains.annotations.NotNull;

import java.util.Comparator;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Author: Tomás Vilaboa
 * Project: AnayDis-2013
 * Date: 07/09/13
 * Time: 17:04
 */
public class QuickSorter extends AbstractSorter {

    public QuickSorter() {
        super(SorterType.QUICK);
    }

    QuickSorter(SorterType type) {
        super(type);
    }

    @Override
    public <T> void sort(@NotNull Comparator<T> comparator, @NotNull List<T> list) {
        sort(comparator, list,0,list.size()-1);
    }

    <T> void sort(@NotNull Comparator<T> comparator, @NotNull List<T> list, int l, int r){
        if(l >= r)
            return;
        int i=partition(comparator,list,l,r);
        sort(comparator,list,l,i-1);
        sort(comparator,list,i+1,r);
    }

    <T> int partition(@NotNull Comparator<T> comparator, @NotNull List<T> list, int l, int r){
        pivot(comparator,list,l,r);
        int i=l;
        int j=r;
        while(true){
            for(;i<r;i++){
                if(greater(comparator,list,i,r))
                    break;
            }
            for(;j>l;j--){
                if(greater(comparator,list,r,j))
                    break;
            }
            if(i>=j)
                break;
            else
                swap(list,i,j);
        }
        swap(list,i,r);
        return i;
    }

    <T> void pivot(@NotNull Comparator<T> comparator, @NotNull List<T> list, int l, int r){

    }
}
