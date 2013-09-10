package anaydis.sort;

import anaydis.sort.provider.SorterProvider;
import org.jetbrains.annotations.NotNull;

import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * Author: Tomás Vilaboa
 * Project: AnayDis-2013
 * Date: 26/08/13
 * Time: 22:59
 */
public class SortProvider implements SorterProvider {
    private Map<SorterType, Sorter> sorters;

    public SortProvider() {
        sorters = new EnumMap<SorterType, Sorter>(SorterType.class);
        addSorter(new InsertionSorter());
        addSorter(new SelectionSorter());
    }

    private void addSorter(Sorter sorter) {
        sorters.put(sorter.getType(), sorter);
    }

    @NotNull
    @Override
    //return del map
    public Sorter getSorterForType(@NotNull SorterType type) {
        if(type.equals(SorterType.INSERTION))
            return new InsertionSorter();
        else if(type.equals(SorterType.BUBBLE))
            return new BubbleSorter();
        else if(type.equals(SorterType.SELECTION))
            return new SelectionSorter();
        else if (type.equals(SorterType.H))
            return new HSorter();
        else if(type.equals(SorterType.SHELL))
            return new ShellSorter();
        else if(type.equals(SorterType.QUICK))
            return new QuickSorter();
        else if(type.equals(SorterType.QUICK_MED_OF_THREE))
            return new QuickSorterMedOfThree();
        else if (type.equals(SorterType.QUICK_CUT))
            return new QuickSorterCutOff();
        else if (type.equals(SorterType.QUICK_NON_RECURSIVE))
            return new QuickSorterNonRecursive();
        else
            throw new IllegalArgumentException();
    }

    @NotNull
    @Override
    public Iterable<Sorter> getAllSorters() {
       return sorters.values();
    }
}
