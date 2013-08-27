package anaydis.sort;

import org.jetbrains.annotations.NotNull;

import java.util.Comparator;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Author: Tomás Vilaboa
 * Project: anaydis-2013
 * Date: 22/08/13
 * Time: 16:12
 */
public class SelectionSorter extends AbstractSorter {


    public SelectionSorter() {
        super(SorterType.SELECTION);
    }


    @Override
    public <T> void sort(@NotNull Comparator<T> comparator, @NotNull List<T> list) {

       for(int i=0;i<list.size();i++){
           int index=i;
           for(int j=i+1;j<list.size();j++){
               if(greater(comparator,list,index,j)){
                  index=j;
               }

           }
           swap(list,i,index);
       }
    }

}
