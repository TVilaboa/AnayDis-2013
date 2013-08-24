package anaydis.sort;

import org.jetbrains.annotations.NotNull;

import java.util.Comparator;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Author: Tomás Vilaboa
 * Project: AnayDis-2013
 * Date: 24/08/13
 * Time: 20:23
 */
public class BubbleSorter extends AbstractSorter {

    public BubbleSorter(){
        super(SorterType.BUBBLE);
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
    public <T> void sort(@NotNull Comparator<T> comparator, @NotNull List<T> list) {
        for(int i=list.size();i>0;i--){
            for(int j=0;j<i-1;j++){
                if(greater(comparator,list,j+1,j))
                    swap(list,j,j+1);

            }
        }
    }
}
