package anaydis.sort;

import anaydis.sort.gui.ObservableSorter;
import anaydis.sort.gui.SorterListener;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public abstract class AbstractSorter implements Sorter, ObservableSorter {

      private SorterType type;
      private List<SorterListener> listeners=new ArrayList<>();



    @Override
    public void addSorterListener(SorterListener listener) {
        listeners.add(listener);
    }


    public void removeSorterListener(SorterListener listener) {
        listeners.remove(listener);
    }

    <T> void swap(List<T> list, int i, int j){
            T t=list.get(i);
            list.set(i,list.get(j));
            list.set(j,t);
            for(SorterListener listener: listeners){
                listener.swap(i,j);
            }
    }

    <T> boolean greater(Comparator<T> c, List<T> list, int i, int j){
            int diff=c.compare(list.get(i),list.get(j));
        for(SorterListener listener: listeners){
            listener.greater(i,j);
        }
            if(diff>0)
                return true;
            else
                return false;


    }


    AbstractSorter(SorterType type) {
        this.type = type;
    }

    public SorterType getType() {
        return  type;
    }

    List<SorterListener> getListeners() {
        return listeners;
    }

    <T> boolean equals(Comparator<T> c, List<T> list, int i, int j){
        int diff=c.compare(list.get(i),list.get(j));
        for(SorterListener listener: listeners){
            listener.equals(i,j);
        }
        return diff == 0;


    }

    <T> void copy(List<T> from, int i, int j, List<T> to, boolean copyToAux){
        for(SorterListener listener: listeners){
            listener.copy(i,j,copyToAux);
        }
        if(copyToAux)
        to.add(j,from.get(i));
        else
            to.set(j,from.get(i));

    }
}
