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
        addSorter(new BubbleSorter());
        addSorter(new ShellSorter());
        addSorter(new QuickSorter());
        addSorter(new QuickSorterCutOff());
        addSorter(new QuickSorterMedOfThree());
        addSorter(new QuickSorterNonRecursive());
        addSorter(new QuickSorterThreeWayP());
        addSorter(new MergeSorterTopDown());
    }

    private void addSorter(Sorter sorter) {
        sorters.put(sorter.getType(), sorter);
    }

    @NotNull
    @Override
    //return del map
    public Sorter getSorterForType(@NotNull SorterType type) {
        if(sorters.containsKey(type))
            return sorters.get(type);
        else
            throw new IllegalArgumentException("To be implemented.");
    }

    @NotNull
    @Override
    public Iterable<Sorter> getAllSorters() {
       return sorters.values();
    }
}
