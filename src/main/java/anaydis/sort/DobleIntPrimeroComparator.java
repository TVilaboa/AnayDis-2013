package anaydis.sort;

import java.util.Comparator;

/**
 * Created with IntelliJ IDEA.
 * Author: Tomás Vilaboa
 * Project: AnayDis-2013
 * Date: 08/09/13
 * Time: 16:11
 */
public class DobleIntPrimeroComparator implements Comparator<DobleInt> {


    @Override
    public int compare(DobleInt o1, DobleInt o2) {
        return o1.getPrimero()-o2.getPrimero();
    }
}
