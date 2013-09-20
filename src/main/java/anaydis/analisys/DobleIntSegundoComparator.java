package anaydis.analisys;

import java.util.Comparator;

/**
 * Created with IntelliJ IDEA.
 * Author: Tomás Vilaboa
 * Project: AnayDis-2013
 * Date: 08/09/13
 * Time: 16:13
 */
public class DobleIntSegundoComparator implements Comparator<DobleInt> {
    @Override
    public int compare(DobleInt o1, DobleInt o2) {
        return o1.getSegundo()-o2.getSegundo();
    }
}
