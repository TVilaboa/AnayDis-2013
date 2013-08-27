package anaydis.sort;

import anaydis.sort.data.DataSetGenerator;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Author: Tomás Vilaboa
 * Project: anaydis-2013
 * Date: 27/08/13
 * Time: 10:49
 */
public class IntDataSetGenerator implements DataSetGenerator<Integer> {
    @NotNull
    @Override
    public List<Integer> createAscending(int length) {
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<length;i++){
            list.add(i);
        }
        return list;
    }

    @NotNull
    @Override
    public List<Integer> createDescending(int length) {
        List<Integer> list=new ArrayList<>();
        for(int i=length;i>0;i--){
            list.add(i);
        }
        return list;
    }

    @NotNull
    @Override
    public List<Integer> createRandom(int length) {
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<length;i++){
            list.add((int)(Math.random()*length));
        }
        return list;
    }

    @NotNull
    @Override
    public Comparator<Integer> getComparator() {
        return new MyIntComparable();
    }
}
