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
        FullName name4=new FullName("Alonso","Carlos");
        FullName name5=new FullName("Alonso","Jose");
        FullName name6=new FullName("Alonso","Alberto");
        FullName name7=new FullName("Alonso","Victoria");
        FullName name8=new FullName("Alonso","Camila");
        FullName name9=new FullName("Alonso","Ayelen");
        FullName name10=new FullName("Diaz","Carlos");
        FullName name11=new FullName("Diaz","Jose");
        FullName name12=new FullName("Diaz","Alberto");
        FullName name13=new FullName("Diaz","Victoria");
        FullName name14=new FullName("Diaz","Camila");
        FullName name15=new FullName("Diaz","Ayelen");
        FullName name16=new FullName("Perez","Carlos");
        FullName name17=new FullName("Perez","Jose");
        FullName name18=new FullName("Perez","Alberto");
        FullName name19=new FullName("Perez","Victoria");
        FullName name20=new FullName("Perez","Camila");
        FullName name21=new FullName("Perez","Ayelen");
        List<FullName> list=new ArrayList<>();
        list.add(name1);
        list.add(name2);
        list.add(name3);
        list.add(name4);
        list.add(name5);
        list.add(name6);
        list.add(name7);
        list.add(name8);
        list.add(name9);
        list.add(name10);
        list.add(name11);
        list.add(name12);
        list.add(name13);
        list.add(name14);
        list.add(name15);
        list.add(name16);
        list.add(name17);
        list.add(name18);
        list.add(name19);
        list.add(name20);
        list.add(name21);
        InsertionSorter insert=new InsertionSorter();
        insert.sort(new FullNameComparatorLastName(),list);
        insert.sort(new FullNameComparatorName(),list);
        System.out.println("Insertion Sorter");
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        list =new ArrayList<>();
        list.add(name1);
        list.add(name2);
        list.add(name3);
        list.add(name4);
        list.add(name5);
        list.add(name6);
        list.add(name7);
        list.add(name8);
        list.add(name9);
        list.add(name10);
        list.add(name11);
        list.add(name12);
        list.add(name13);
        list.add(name14);
        list.add(name15);
        list.add(name16);
        list.add(name17);
        list.add(name18);
        list.add(name19);
        list.add(name20);
        list.add(name21);
        ShellSorter shell=new ShellSorter();
        shell.sort(new FullNameComparatorLastName(),list);
        shell.sort(new FullNameComparatorName(),list);
        System.out.println("Shell");
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        list =new ArrayList<>();
        list.add(name1);
        list.add(name2);
        list.add(name3);
        list.add(name4);
        list.add(name5);
        list.add(name6);
        list.add(name7);
        list.add(name8);
        list.add(name9);
        list.add(name10);
        list.add(name11);
        list.add(name12);
        list.add(name13);
        list.add(name14);
        list.add(name15);
        list.add(name16);
        list.add(name17);
        list.add(name18);
        list.add(name19);
        list.add(name20);
        list.add(name21);
        QuickSorter quick=new QuickSorter();
        quick.sort(new FullNameComparatorLastName(),list);
        quick.sort(new FullNameComparatorName(),list);
        System.out.println("Quick");
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
