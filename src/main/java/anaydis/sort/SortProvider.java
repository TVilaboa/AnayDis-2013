package anaydis.sort;

import anaydis.sort.provider.SorterProvider;
import org.jetbrains.annotations.NotNull;

import java.util.Iterator;

/**
 * Created with IntelliJ IDEA.
 * Author: Tomás Vilaboa
 * Project: AnayDis-2013
 * Date: 26/08/13
 * Time: 22:59
 */
public class SortProvider implements SorterProvider {
    @NotNull
    @Override
    public Sorter getSorterForType(@NotNull SorterType type) {
        if(type.equals(SorterType.INSERTION))
            return new InsertionSorter();
        else if(type.equals(SorterType.BUBBLE))
            return new BubbleSorter();
        else if(type.equals(SorterType.SELECTION))
            return new SelectionSorter();
        else
            throw new IllegalArgumentException();
    }

    @NotNull
    @Override
    public Iterable<Sorter> getAllSorters() {
       return null;
    }
}