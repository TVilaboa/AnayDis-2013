package anaydis.analisys;

import java.util.Comparator;

/**
 * Created with IntelliJ IDEA.
 * Author: Tomás Vilaboa
 * Project: AnayDis-2013
 * Date: 26/08/13
 * Time: 22:06
 */
public class FullNameComparatorLastName implements Comparator<FullName> {
    @Override
    public int compare(FullName o2, FullName o1) {
        return o2.getLastname().compareTo(o1.getLastname());
    }
}
