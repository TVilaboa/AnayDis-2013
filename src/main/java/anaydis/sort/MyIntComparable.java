package anaydis.sort;

/**
 * Created with IntelliJ IDEA.
 * Author: Tomás Vilaboa
 * Project: AnayDis-2013
 * Date: 23/08/13
 * Time: 23:08
 */


    import java.util.Comparator;

    public class MyIntComparable implements Comparator<Integer>{

        @Override
        public int compare(Integer o1, Integer o2) {
            return (o1>o2 ? -1 : (o1==o2 ? 0 : 1));
        }
    }

