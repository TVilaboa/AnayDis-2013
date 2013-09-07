package anaydis.sort;

import org.jetbrains.annotations.NotNull;

import java.util.Comparator;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Author: Tomás Vilaboa
 * Project: AnayDis-2013
 * Date: 07/09/13
 * Time: 17:43
 */
public class QuickSorterMedOfThree extends QuickSorter {

    public QuickSorterMedOfThree() {
        super(SorterType.QUICK_MED_OF_THREE);
    }

    @Override
    protected <T> void pivot(@NotNull Comparator<T> comparator, @NotNull List<T> list, int l, int r) {
        int m = (l + r)/2;
        if(greater(comparator,list,l,m))
            swap(list,m,l);
        if(greater(comparator,list,r,m))
            swap(list,r,m);
    }
}
