package anaydis.sort;

import org.jetbrains.annotations.NotNull;

import java.util.Comparator;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Author: Tomás Vilaboa
 * Project: AnayDis-2013
 * Date: 23/08/13
 * Time: 21:45
 */
public class InsertionSorter extends AbstractSorter {

    public InsertionSorter() {
        super(SorterType.INSERTION);
    }


    @Override
    public void addSorterListener(SorterListener listener) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void removerSorterListener(SorterListener listener) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public <T> void sort(@NotNull Comparator<T> tComparator, @NotNull List<T> ts) {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
