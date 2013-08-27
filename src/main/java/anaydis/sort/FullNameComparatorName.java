package anaydis.sort;

import java.util.Comparator;

/**
 * Created with IntelliJ IDEA.
 * Author: Tomás Vilaboa
 * Project: AnayDis-2013
 * Date: 26/08/13
 * Time: 22:04
 */
public class FullNameComparatorName implements Comparator<FullName> {
    @Override
    public int compare(FullName o1, FullName o2) {
        return o1.getFirsname().compareTo(o2.getFirsname());
    }
}
