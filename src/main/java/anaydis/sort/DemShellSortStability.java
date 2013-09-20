package anaydis.sort;

import anaydis.analisys.DobleInt;
import anaydis.analisys.DobleIntPrimeroComparator;
import anaydis.analisys.DobleIntSegundoComparator;

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


    /*ShellSort is not stable, since adjacent values will be compared with nonadyacent values
    on early passes and may be moved in different directions.
     */
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
