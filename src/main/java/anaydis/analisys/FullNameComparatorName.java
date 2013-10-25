package anaydis.analisys;

import java.util.Comparator;

/**
 * Created with IntelliJ IDEA.
 * Author: Tomás Vilaboa
 * Project: AnayDis-2013
 * Date: 26/08/13
 * Time: 22:04
 */
class FullNameComparatorName implements Comparator<FullName> {
    @Override
    public int compare(FullName o2, FullName o1) {
        return o2.getFirsname().compareTo(o1.getFirsname());
    }
}
