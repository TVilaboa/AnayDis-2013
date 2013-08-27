package anaydis.sort;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Author: Tomás Vilaboa
 * Project: AnayDis-2013
 * Date: 26/08/13
 * Time: 20:20
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        FullName name1=new FullName("Alonso","Paula");
        FullName name2=new FullName("Diaz","Diego");
        FullName name3=new FullName("Alonso","Diego");
        List<FullName> list=new ArrayList<>();
        list.add(name1);
        list.add(name2);
        list.add(name3);
        InsertionSorter insert=new InsertionSorter();
        insert.sort(new FullNameComparatorLastName(),list);
        insert.sort(new FullNameComparatorName(),list);
        System.out.println("Insertion Sorter");
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
