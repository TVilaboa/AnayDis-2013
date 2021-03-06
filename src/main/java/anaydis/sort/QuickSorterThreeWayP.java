package anaydis.sort;

import anaydis.sort.gui.SorterListener;
import org.jetbrains.annotations.NotNull;

import java.util.Comparator;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Author: Tomás Vilaboa
 * Project: AnayDis-2013
 * Date: 15/09/13
 * Time: 21:21
 */
public class QuickSorterThreeWayP extends QuickSorter {

    private int p;
    private int q;

    protected  <T> int partition(@NotNull Comparator<T> comparator, @NotNull List<T> list,int l,int r){
        pivot(comparator,list,l,r);
        int i=l;
        int j=r;
        p=l;
        q=r;
        while(true){
            for(;i<q;i++){
                if(greater(comparator,list,i,r))
                    break;
                else if(equals(comparator,list,i,r)){
                    swap(list,i,p);
                    p++;
                }
            }
            for(;j>p;j--){
                if(greater(comparator,list,r,j))
                    break;
                else if(equals(comparator,list,j,r)){
                    swap(list,j,q);
                    q--;
                }
            }
            if(i>=j)
                break;
            else
                swap(list,i,j);
        }
        swap(list,j,p);
        for(;p>l;p--,j--){
            swap(list,j,p-1);
        }
        for(;q<r-1;q++,i++){
            swap(list,i,q+1);
        }
        swap(list,i,r);
        q=i;
        p=j;
        return i;
    }


    protected <T> void sort(@NotNull Comparator<T> comparator, @NotNull List<T> list,int l,int r){
       if(l >= r)
            return;
        partition(comparator,list,l,r);
        sort(comparator,list,l,p);
        sort(comparator,list,q,r);
    }

    public QuickSorterThreeWayP() {
        super(SorterType.QUICK_THREE_PARTITION);
    }

}
