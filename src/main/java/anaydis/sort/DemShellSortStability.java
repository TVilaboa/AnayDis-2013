package anaydis.sort;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Author: Tomás Vilaboa
 * Project: AnayDis-2013
 * Date: 08/09/13
 * Time: 16:10
 */
public class DemShellSortStability {

    public static void main(String[] args) {
        IntDataSetGenerator generator=new IntDataSetGenerator();
        List<DobleInt> list=new ArrayList<>();
        List<Integer> primeros=generator.createRandom(500);
        List<Integer> segundos=generator.createRandom(500);
        for (int i=0;i<500;i++){
            DobleInt doble=new DobleInt();
            doble.setPrimero(primeros.get(i));
            doble.setSegundo(segundos.get(i));
            list.add(doble);
        }
        ShellSorter shell=new ShellSorter();
        shell.sort(new DobleIntPrimeroComparator(),list);
        shell.sort(new DobleIntSegundoComparator(),list);
        for(DobleInt dobleInt: list){
            System.out.println(dobleInt.getPrimero() + " ; " + dobleInt.getSegundo());
        }
    }
}
