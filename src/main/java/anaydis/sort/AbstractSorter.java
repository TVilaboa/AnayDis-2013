package anaydis.sort;

import java.util.Comparator;
import java.util.List;

public abstract class AbstractSorter implements Sorter, ObservableSorter {

      private SorterType type;

    protected <T> void swap(List<T> list,int i,int j){
            T t=list.get(i);
            list.set(i,list.get(j));
            list.set(j,t);
    }

    protected <T> boolean greater(Comparator<T> c,List<T> list,int i,int j){
            int diff=c.compare(list.get(i),list.get(j));
            if(diff>0)
                return true;
            else
                return false;


    }


    protected AbstractSorter(SorterType type) {
        this.type = type;
    }

    public SorterType getType() {
        return  type;
    }


}
