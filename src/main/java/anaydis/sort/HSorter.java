package anaydis.sort;

<<<<<<< HEAD
import org.jetbrains.annotations.NotNull;

import java.util.Comparator;
import java.util.List;

=======
>>>>>>> a24e4db1387aeccd6c382566b2023dd861d6f46f
/**
 * Created with IntelliJ IDEA.
 * Author: Tomás Vilaboa
 * Project: anaydis-2013
 * Date: 03/09/13
 * Time: 10:31
 */
<<<<<<< HEAD
public class HSorter extends AbstractSorter{

    public HSorter(){
        super(SorterType.H);
    }
    @Override
    public <T> void sort(@NotNull Comparator<T> comparator, @NotNull List<T> list) {
              sort(comparator,list,1);
    }

    protected <T> void sort(Comparator<T> comparator, List <T> list,int h){
        for(int i=1;i<list.size()-h;i+=h){
            for(int j=i;j>0;j--){
                if(greater(comparator,list,j-1,j+h)){
                    swap(list,j-1,j+h);

                } else
                    break;
            }
        }
    }
}

=======
public class HSorter {
}
>>>>>>> a24e4db1387aeccd6c382566b2023dd861d6f46f
