package anaydis.sort;

import anaydis.sort.data.DataSetGenerator;
import anaydis.sort.data.StringDataSetGenerator;
import anaydis.sort.provider.SorterProvider;
import anaydis.sort.test.AbstractTestPracticaTres;

/**
 * Created with IntelliJ IDEA.
 * Author: Tomás Vilaboa
 * Project: AnayDis-2013
 * Date: 03/09/13
 * Time: 21:38
 */
public class TestPracticaTres extends AbstractTestPracticaTres {
    @Override protected DataSetGenerator<String> getStringDataSetGenerator() {
        return new StringDataSetGenerator();
    }

    @Override protected DataSetGenerator<Integer> getIntegerDataSetGenerator() {
        return new IntDataSetGenerator();
    }

    @Override protected SorterProvider getSorterProvider() {
        return new SortProvider();
    }
}
