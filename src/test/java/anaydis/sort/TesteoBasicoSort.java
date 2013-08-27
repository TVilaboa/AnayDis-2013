package anaydis.sort;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


/**
 * Created with IntelliJ IDEA.
 * Author: Tomás Vilaboa
 * Project: AnayDis-2013
 * Date: 23/08/13
 * Time: 23:01
 */
public class TesteoBasicoSort {

    public static void main(String[] args) {
        List list=new ArrayList();
        list.add(6);
        list.add(5);
        list.add(3);
        list.add(1);
        list.add(8);
        list.add(7);
        list.add(2);
        list.add(4);
        SelectionSorter selec=new SelectionSorter();
        ConsoleSorterListener listener = new ConsoleSorterListener();
        selec.addSorterListener(listener);
        selec.sort(new MyIntComparable(),list);
        System.out.println("Se realizo " + listener.getGreater() + " comparaciones.");
        System.out.println("Se realizo " + listener.getSwap() + " swaps");
        System.out.println("Selection Sorter");
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        list=new ArrayList();
        list.add(6);
        list.add(5);
        list.add(3);
        list.add(1);
        list.add(8);
        list.add(7);
        list.add(2);
        list.add(4);
        InsertionSorter insert=new InsertionSorter();
        insert.sort(new MyIntComparable(),list);
        System.out.println("Insertion Sorter");
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        list=new ArrayList();
        list.add(6);
        list.add(5);
        list.add(3);
        list.add(1);
        list.add(8);
        list.add(7);
        list.add(2);
        list.add(4);
        BubbleSorter bubble=new BubbleSorter();
        bubble.sort(new MyIntComparable(),list);
        System.out.println("Bubble Sorter");
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        IntDataSetGenerator intset=new IntDataSetGenerator();
        list=intset.createAscending(8);
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        list=intset.createDescending(8);
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        list=intset.createRandom(8);
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
