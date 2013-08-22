package anaydis.sort;

/**
 * Created with IntelliJ IDEA.
 * Author: Tomás Vilaboa
 * Project: anaydis-2013
 * Date: 22/08/13
 * Time: 16:15
 */
public interface ObservableSorter {

    void addSorterListener(SorterListener listener);

    void removerSorterListener(SorterListener listener);

}
